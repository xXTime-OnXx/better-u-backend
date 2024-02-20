package ch.better.u.persistence.improvement;

import ch.better.u.domain.aggregate.Improvement;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Dependent
public class ImprovementRepository {

    @Inject
    EntityManager em;

    @Transactional
    public void add(Improvement improvement) {
        ImprovementEntity entity = ImprovementEntity.from(improvement);
        em.persist(entity);
    }

}
