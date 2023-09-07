package Entities.Animals.Herbivores;

import Bio.Animals.Herbivores.Herbivores;
import Utils.Interfaces.LifeProcess;
import lombok.*;

import java.io.Serializable;

@Value
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Rabbit extends Herbivores implements Serializable, LifeProcess {

    @Override
    public void move() {

    }
}
