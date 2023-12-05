package ProyectoScrum.core.DriverPorts;

import ProyectoScrum.core.domain.Tarea;

public interface TareaService {
	void añadirTarea(Tarea tarea);
	void eliminarTarea(int id);
	void editarTarea(int id);
}
