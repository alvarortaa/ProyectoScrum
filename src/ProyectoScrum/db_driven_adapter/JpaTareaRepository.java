package ProyectoScrum.db_driven_adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ProyectoScrum.core.DrivenPorts.TareaRepository;
import ProyectoScrum.core.domain.Tarea;

@Component
public class JpaTareaRepository implements TareaRepository{

	 @Autowired
	    private TareaJpaRepository tareaJpaRepository;

	    @Override
	    public void agregarTarea(Tarea tarea) {
	        tareaJpaRepository.save(new TareaEntity(tarea)); // Asumiendo que hay una entidad llamada TareaEntity para mapear la tarea
	    }

	    @Override
	    public void eliminarTarea(int id) {
	        tareaJpaRepository.deleteById(id);
	    }

	    @Override
	    public void editarTarea(int id) {
	        tareaJpaRepository.save(new TareaEntity(tarea)); // Actualiza la tarea en la base de datos
	    }

	    @Override
	    public List<Tarea> obtenerTodasTareas() {
	        List<TareaEntity> tareaEntities = tareaJpaRepository.findAll();
	        return tareaEntities.stream()
	                .map(TareaEntity::toTarea)
	                .collect(Collectors.toList());
	    }

	    @Override
	    public List<Tarea> obtenerTareasPendientes() {
	        List<TareaEntity> tareaEntities = tareaJpaRepository.findByRealizadaFalse();
	        return tareaEntities.stream()
	                .map(TareaEntity::toTarea)
	                .collect(Collectors.toList());
	    }

	    @Override
	    public List<Tarea> obtenerTareasPorPrioridad(int prioridad) {
	        List<TareaEntity> tareaEntities = tareaJpaRepository.findByPrioridad(prioridad);
	        return tareaEntities.stream()
	                .map(TareaEntity::toTarea)
	                .collect(Collectors.toList());
	    }

		
	}
