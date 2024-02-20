package ch.better.u.domain.usecase;

import ch.better.u.domain.aggregate.Improvement;
import ch.better.u.persistence.improvement.ImprovementRepository;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class ImprovementManager {

    @Inject
    ImprovementRepository improvementRepository;

    public void add(Improvement improvement) {
        improvementRepository.add(improvement);
    }

}
