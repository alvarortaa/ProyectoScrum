package ProyectoScrum.ui_driver_adapter;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ProyectoScrum.core.DriverPorts.TareaService;
import ProyectoScrum.core.domain.Estado;
import ProyectoScrum.core.domain.Prioridad;
import ProyectoScrum.core.domain.Tarea;
import ProyectoScrum.core.domain.TareaDoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/tareas")
public class TareaController {

	 @Autowired
	    private TareaService tareaService;
	   @GetMapping("/tareas")
	    public ResponseEntity getTarea(@RequestParam int  id) {
	       
	            return ResponseEntity.ok(tareaService.getTarea(id));
	        } 

	   @GetMapping("/añadir")
	   public String mostrarFormularioAñadir(Model model) {
	       model.addAttribute("tarea", new Tarea());
	       return "añadir-tarea";  // Esto buscará la vista añadir-tarea.jsp en la carpeta /WEB-INF/jsp/
	   }

	   @PostMapping("/añadir")
	   public String añadirTarea(@ModelAttribute Tarea tarea,
	                             @RequestParam String descripcion,
	                             @RequestParam int id,
	                             @RequestParam Prioridad prioridad,
	                             @RequestParam int duracion,
	                             @RequestParam boolean presencial) {
	       // Crear la tarea con los parámetros proporcionados
	       Tarea nuevaTarea = new Tarea(descripcion, id, prioridad, duracion, presencial);
	       tareaService.añadirTarea(nuevaTarea);
	       return "redirect:/tareas/ver";
	   }

	   @GetMapping("/ver")
	   public String verListaTareas(Model model) {
	       List<Tarea> tareas = tareaService.verListaTareas();
	       model.addAttribute("tareas", tareas);
	       return "ver-tareas";  // Esto buscará la vista ver-tareas.jsp en la carpeta /WEB-INF/jsp/
	   }


	   @GetMapping("/eliminar/{tareaId}")
	    public String eliminarTarea(@PathVariable int tareaId) {
	        tareaService.eliminarTarea(tareaId);
	        return "redirect:/tareas/ver";
	    }

	    @GetMapping("/editar/{tareaId}")
	    public String mostrarFormularioEditar(@PathVariable int tareaId, Model model) {
	        Tarea tarea = tareaService.getTarea(tareaId);
	        model.addAttribute("tarea", tarea);
	        return "editar-tarea"; // Vista para el formulario de edición
	    }

	    @PostMapping("/editar/{tareaId}")
	    public String editarTarea(@PathVariable int tareaId, @ModelAttribute Tarea tarea) {
	        tareaService.editarTarea(tareaId, tarea);
	        return "redirect:/tareas/ver";
	    }
/*
    @GetMapping("/planificar")
    public String mostrarFormularioPlanificar(Model model) {
        return "planificar-semana";
    }

    @PostMapping("/planificar")
    public String planificarProximaSemana(@RequestParam int horasDisponibles) {
        tareaService.planificarProximaSemana(horasDisponibles);
        return "redirect:/tareas/ver";
    }*/
}

	    
	

