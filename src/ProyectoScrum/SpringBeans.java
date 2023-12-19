

package ProyectoScrum;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ProyectoScrum.core.DrivenPorts.TareaRepository;
import ProyectoScrum.core.DriverPorts.TareaService;
import ProyectoScrum.core.DriverPorts.TareaServiceImpl;

@Configuration
@ComponentScan(basePackages = "ProyectoScrum")
public class SpringBeans {
    
    @Bean
    public TareaService tareaService(TareaRepository tareaRepository) {
        return new TareaServiceImpl(tareaRepository);
    }
}