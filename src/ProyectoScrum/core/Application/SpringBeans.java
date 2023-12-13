package ProyectoScrum.core.Application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ProyectoScrum.core.DrivenPorts.TareaRepository;
import ProyectoScrum.core.DriverPorts.TareaService;
import ProyectoScrum.core.DriverPorts.TareaServiceImpl;

@Configuration
public class SpringBeans {
        @Bean
       TareaService tareaService(final TareaRepository tareaRepository) {
            return new TareaServiceImpl(tareaRepository);
}
}