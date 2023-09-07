package Bio.Plants;

import Bio.Bio;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class Plant extends Bio implements Serializable {

    public Plant(String name, double weight, int maxPerCell) {
        super(name, weight, maxPerCell);
    }

    public boolean isPlant(@NonNull Object o){return o instanceof Plant;}
}
