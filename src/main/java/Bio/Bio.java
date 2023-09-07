package Bio;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class Bio implements Serializable {

    public String name;
    public double weight;
    public int maxPerCell;

    protected Bio() {}

    protected Bio(String name, double weight, int maxPerCell) {
        this.name = name;
        this.weight = weight;
        this.maxPerCell = maxPerCell;
    }
}
