package Utils;

import java.util.concurrent.ThreadLocalRandom;

public enum Direction {
    UP,
    DOWN,
    RIGHT,
    LEFT;
    
    public Direction choseDirection() {
        int index = ThreadLocalRandom.current().nextInt(0, 3);
        return switch(index) {
            case 0 -> Direction.UP;
            case 1 -> Direction.DOWN;
            case 2 -> Direction.RIGHT;
            case 3 -> Direction.LEFT;
            default -> throw new IllegalStateException("Unexpected value: " + index);
        };
    }
}
