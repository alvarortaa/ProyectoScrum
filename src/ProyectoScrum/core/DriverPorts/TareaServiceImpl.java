package ProyectoScrum.core.DriverPorts;


import java.util.List;

import ProyectoScrum.core.DrivenPorts.TareaRepository;
import ProyectoScrum.core.domain.Estado;
import ProyectoScrum.core.domain.Tarea;


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

	@Override
	public List<Tarea> verListaTareas() {
		  return repositorioTareas.obtenerTodasTareas();
    }

	@Override
	public void planificarProximaSemana(int horas) {
		repositorioTareas.planificarProximaSemana(horas);
		
	}

	@Override
	public Tarea editarEstado(int tareaId, Estado nuevoEstado) {
		Tarea tarea = repositorioTareas.findById(tareaId);
        if (tarea != null) {
            tarea.setEstado(nuevoEstado);
            repositorioTareas.editarTarea(tareaId, tarea);
            
        }
		return tarea;
	}
}

