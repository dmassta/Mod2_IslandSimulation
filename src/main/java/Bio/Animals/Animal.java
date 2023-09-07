package Bio.Animals;

import Bio.Bio;
import Bio.Plants.Plant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class Animal extends Bio implements Serializable {

    public int maxSpeed;
    public double feedAmount;
    public boolean isHungry;
    public int daysHungry;
    public boolean isDead = false;


    public Animal(String name, double weight, int maxPerCell, int maxSpeed, double feedAmount) {
        super(name, weight, maxPerCell);
        this.maxSpeed = maxSpeed;
        this.feedAmount = feedAmount;
    }

    public boolean isAnimal() {
        return true;
    }

    public boolean die() {
        return false;}

    public void reproduce() {}

//    @Override
//    public void move() {
//
//    }
//
//    @Override
//    public void eat(@NonNull Bio food) {
//
//        double currentFeeding = this.getFeedAmount();
//        this.setHungry(true);
//        while(this.isHungry) {
//            while(currentFeeding > 0) {
//                if (food instanceof Plant) {
//                    currentFeeding -= food.getWeight();
//                }
//            }
//            this.setHungry(false);
//        }
//    }
}
