package ProyectoScrum.db_driven_adapter.jparepository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProyectoScrum.core.domain.Estado;
import ProyectoScrum.db_driven_adapter.domain.TareaEntity;

@Repository
public interface TareaJpaRepository extends JpaRepository<TareaEntity,Long> {
List<TareaEntity> findByPrioridad(int prioridad);
List<TareaEntity> findByEstadoOrderByPrioridadDesc(Estado estado);
List<TareaEntity> findAll();
}