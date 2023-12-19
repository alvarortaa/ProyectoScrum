package ProyectoScrum.core.DriverPorts;

import java.util.List;

import ProyectoScrum.core.domain.Estado;
import ProyectoScrum.core.domain.Tarea;


public interface TareaService {
	void añadirTarea(Tarea tarea);
	void eliminarTarea(int id);
	void editarTarea(int id, Tarea t);
	Tarea getTarea(int id);
	List<Tarea> verListaTareas();
    void planificarProximaSemana(int horas);
    Tarea editarEstado(int tareaId, Estado nuevoEstado);
	
}
