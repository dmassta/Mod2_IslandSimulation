package Entities.Animals.Herbivores;

import Bio.Animals.Herbivores.Herbivores;

import Utils.Interfaces.LifeProcess;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

@Value
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Horse extends Herbivores implements Serializable, LifeProcess {

    public Horse(String name, double weight, int maxPerCell, int maxSpeed, double feedAmount) {
        super(name, weight, maxPerCell, maxSpeed, feedAmount);
    }

    @Override
    public void move() {

    }
}
