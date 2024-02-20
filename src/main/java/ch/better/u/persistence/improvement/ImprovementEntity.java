package ch.better.u.persistence.improvement;

import ch.better.u.domain.aggregate.Improvement;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ImprovementEntity {

    @Id
    private String id;
    private String name;
    private int points;
    private boolean done;

    public static ImprovementEntity from(Improvement improvement) {
        ImprovementEntity entity = new ImprovementEntity();
        entity.setId(improvement.getId());
        entity.setName(improvement.getName());
        entity.setPoints(improvement.getPoints());
        entity.setDone(improvement.isDone());
        return entity;
    }
}
