
package ProyectoScrum;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "ProyectoScrum")
@EntityScan(basePackages = "ProyectoScrum.db_driven_adapter.domain")
@EnableJpaRepositories(basePackages = "ProyectoScrum.db_driven_adapter.jparepository")
public class ProyectoScrumInicio {
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoScrumInicio.class, args);
	}

}
