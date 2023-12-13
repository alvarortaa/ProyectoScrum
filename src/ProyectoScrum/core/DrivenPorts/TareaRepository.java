package ProyectoScrum.core.DrivenPorts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProyectoScrum.core.domain.Tarea;

@Repository
public interface TareaRepository {
	void agregarTarea(Tarea tarea);
    void eliminarTarea(int id);
    void editarTarea(int id, Tarea t);
    List<Tarea> obtenerTodasTareas();
    List<Tarea> obtenerTareasPendientes();
    List<Tarea> obtenerTareasPorPrioridad(int prioridad);
    Tarea findById(int id);
}

