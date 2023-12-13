package ProyectoScrum.db_driven_adapter.jparepository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProyectoScrum.db_driven_adapter.domain.TareaEntity;

@Repository
public interface TareaJpaRepository extends JpaRepository<TareaEntity,Long> {
List<TareaEntity> findByRealizadaFalse();
List<TareaEntity> findByPrioridad(int prioridad);
}