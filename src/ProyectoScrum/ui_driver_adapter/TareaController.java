package ProyectoScrum.ui_driver_adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ProyectoScrum.core.DriverPorts.TareaService;
import ProyectoScrum.core.domain.TareaDoesNotExistException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TareaController {

	 @Autowired
	    private TareaService tareaService;
	    @GetMapping("/tareas")
	    public ResponseEntity getTarea(@RequestParam int  id) {
	       
	            return ResponseEntity.ok(tareaService.getTarea(id));
	        } 
}
	    
	

