package Utils.Interfaces;

import Bio.Bio;
import lombok.NonNull;

public interface LifeProcess {

    void eat(@NonNull Bio food);
    void move();
}
