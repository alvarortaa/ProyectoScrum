package ProyectoScrum.core.DrivenPorts;

import java.util.List;

import ProyectoScrum.core.domain.Tarea;

public interface TareaRepository {
	void agregarTarea(Tarea tarea);
    void eliminarTarea(int id);
    void editarTarea(int id);
    List<Tarea> obtenerTodasTareas();
    List<Tarea> obtenerTareasPendientes();
    List<Tarea> obtenerTareasPorPrioridad(int prioridad);
}

