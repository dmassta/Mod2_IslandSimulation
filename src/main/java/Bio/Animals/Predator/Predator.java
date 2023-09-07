package Bio.Animals.Predator;

import Bio.Animals.Animal;
import Bio.Animals.Herbivores.Herbivores;
import Bio.Bio;

import Utils.Interfaces.LifeProcess;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class Predator extends Animal implements Serializable, LifeProcess {

    public Predator(String name, double weight, int maxPerCell, int maxSpeed, double feedAmount) {
        super(name, weight, maxPerCell, maxSpeed, feedAmount);
    }

    public boolean isPredator() {
        return true;
    }

    @Override
    public void eat(@NonNull Bio food) {
        double result = food instanceof Herbivores ? (food.getWeight() - this.getFeedAmount()) : this.getWeight();
        this.setWeight(result);
    }
}
