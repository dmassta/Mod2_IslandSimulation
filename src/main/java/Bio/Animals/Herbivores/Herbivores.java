package Bio.Animals.Herbivores;


import Bio.Animals.Animal;
import Bio.Bio;
import Bio.Plants.Plant;
import Utils.Interfaces.LifeProcess;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class Herbivores extends Animal implements Serializable, LifeProcess {

    public Herbivores(String name, double weight, int maxPerCell, int maxSpeed, double feedAmount) {
        super(name, weight, maxPerCell, maxSpeed, feedAmount);
    }

    public boolean isHerbivores(@NonNull Object o){
        return o instanceof Herbivores;
    }

    @Override
    public void eat(@NonNull Bio food) {
        double result;
        if (food instanceof Plant) {
            result = food.getWeight() - this.getFeedAmount();
            this.setWeight(result);
        }
    }
}
