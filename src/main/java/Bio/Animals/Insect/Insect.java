package Bio.Animals.Insect;

import Bio.Animals.Animal;
import Bio.Bio;
import Bio.Plants.Plant;
import Utils.Interfaces.LifeProcess;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class Insect extends Animal implements Serializable, LifeProcess {

    public Insect(String name, double weight, int maxPerCell, int maxSpeed, double feedAmount) {
        super(name, weight, maxPerCell, maxSpeed, feedAmount);
    }

    public boolean isInsect(@NonNull Object o) {
        return o instanceof Insect;
    }

    @Override
    public void eat(@NonNull Bio food) {
        double result;
        if (food instanceof Plant) {
            result = food.getWeight() - this.getFeedAmount();
            food.setWeight(result);
        }
    }
}
