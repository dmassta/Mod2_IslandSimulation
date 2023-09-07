package Entities.Animals.Predator;

import Bio.Animals.Predator.Predator;
import Utils.Interfaces.Factory.BioFactory;
import Utils.Interfaces.Factory.Copyable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class Bear extends Predator implements Serializable, Copyable, BioFactory {

    public Bear(String name, double weight, int maxPerCell, int maxSpeed, double feedAmount) {
        super(name, weight, maxPerCell, maxSpeed, feedAmount);
    }

    @Override
    public void move() {}

    @Override
    public Object copy() {
        Predator copy = createBio();
        return copy;
    }

    @Override
    public Bear createBio() {
        return new Bear(name, weight, maxPerCell, maxSpeed, feedAmount);
    }
}
