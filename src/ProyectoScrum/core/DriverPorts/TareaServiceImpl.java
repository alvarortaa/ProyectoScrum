package ProyectoScrum.core.DriverPorts;

import ProyectoScrum.core.DrivenPorts.TareaRepository;
import ProyectoScrum.core.domain.Tarea;
import miproyecto.core.domain.Book;

public class TareaServiceImpl implements TareaService {
    private TareaRepository repositorioTareas;

    public TareaServiceImpl(TareaRepository repositorioTareas) {
        this.repositorioTareas = repositorioTareas;
    }

    @Override
    public void añadirTarea(Tarea tarea) {
        repositorioTareas.agregarTarea(tarea);
    }
	@Override
	public void eliminarTarea(int id) {
		repositorioTareas.eliminarTarea(id);
		
	}

	@Override
	public void editarTarea(int id, Tarea t) {
		repositorioTareas.editarTarea(id, t);
		
	}
	public Tarea getTarea(int  id) {
        return repositorioTareas.findById(id);
}
}

