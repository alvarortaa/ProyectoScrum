package ProyectoScrum.db_driven_adapter;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import ProyectoScrum.core.DrivenPorts.TareaRepository;
import ProyectoScrum.core.domain.Tarea;
import ProyectoScrum.core.domain.TareaDoesNotExistException;
import ProyectoScrum.db_driven_adapter.jparepository.HAAJpaRepository;
import ProyectoScrum.db_driven_adapter.jparepository.TareaJpaRepository;
import ProyectoScrum.db_driven_adapter.domain.TareaEntity;


@Component
public class JpaTareaRepository implements TareaRepository {

	@Autowired
	private TareaJpaRepository tareaJpaRepository;
	private HAAJpaRepository haaJpaRepository;

	@Override
	public void agregarTarea(Tarea tarea) {
		tareaJpaRepository.save(new TareaEntity(tarea)); // Asumiendo que hay una entidad llamada TareaEntity para
															// mapear la tarea
	}

	@Override
	public void eliminarTarea(int id) {
		tareaJpaRepository.deleteById((long) id);
	}

	public void editarTarea(int id, Tarea nuevaTarea) {
		// Buscar la tarea existente en la base de datos por su ID
		TareaEntity tareaExistente = tareaJpaRepository.findById((long) id)
				.orElseThrow(() -> new IllegalArgumentException("No se encontró la tarea con ID: " + id));

		TareaEntity tareaActualizada = tareaExistente.withNewValues(nuevaTarea);

		// Guardar la tarea actualizada en la base de datos
		tareaJpaRepository.save(tareaActualizada);
	}

	@Override
	public List<Tarea> obtenerTodasTareas() {
		List<TareaEntity> tareaEntities = tareaJpaRepository.findAll();
		return tareaEntities.stream().map(TareaEntity::toTarea).collect(Collectors.toList());
	}

	@Override
	public List<Tarea> obtenerTareasPendientes() {
		List<TareaEntity> tareaEntities = tareaJpaRepository.findByRealizadaFalse();
		return tareaEntities.stream().map(TareaEntity::toTarea).collect(Collectors.toList());
	}

	@Override
	public List<Tarea> obtenerTareasPorPrioridad(int prioridad) {
		List<TareaEntity> tareaEntities = tareaJpaRepository.findByPrioridad(prioridad);
		return tareaEntities.stream().map(TareaEntity::toTarea).collect(Collectors.toList());
	}

	@Override
	public Tarea findById(int id) {
		Optional<TareaEntity> tareaEntityOptional = tareaJpaRepository.findById((long) id);
		TareaEntity tareaentity = tareaEntityOptional.orElseThrow(TareaDoesNotExistException::new);
		
	    return tareaentity.toTarea();
			
	}
	
}
