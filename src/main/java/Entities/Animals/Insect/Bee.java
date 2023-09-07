package Entities.Animals.Insect;

import Bio.Animals.Insect.Insect;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

@Value
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Bee extends Insect implements Serializable {

    @Override
    public void move() {

    }
}
