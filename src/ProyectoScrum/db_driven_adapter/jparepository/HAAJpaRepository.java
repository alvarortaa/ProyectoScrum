package ProyectoScrum.db_driven_adapter.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import ProyectoScrum.db_driven_adapter.domain.TareaEntity;


public interface HAAJpaRepository  extends JpaRepository<TareaEntity, Long> {}
