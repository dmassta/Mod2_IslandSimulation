package Entities.Plant;

import Abstraction.Bio.Plants.Plant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public final class Grass extends Plant implements Serializable {

    public Grass(String name, double weight, int maxPerCell) {
        super(name, weight, maxPerCell);
    }
}
