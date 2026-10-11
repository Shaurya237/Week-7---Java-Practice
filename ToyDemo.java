import java.util.Objects;

abstract class Toy {
    private static int nextId = 1001;
    private final String toyId;

    protected Toy() {
        toyId = "TOY-" + nextId++;
    }

    public abstract String makeSound();

    public String getToyId() {
        return toyId;
    }
}

class ToyCar extends Toy {
    private final String name;

    public ToyCar(String name) {
        this.name = requireNonBlank(name, "name");
    }

    @Override
    public String makeSound() {
        return name + ": Vroom vroom!";
    }

    private static String requireNonBlank(String value, String field) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(field + " must not be blank");
        }
        return value;
    }
}

class ToyRobot extends Toy {
    private final String name;

    public ToyRobot(String name) {
        this.name = requireNonBlank(name, "name");
    }

    @Override
    public String makeSound() {
        return name + ": Beep boop!";
    }

    private static String requireNonBlank(String value, String field) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(field + " must not be blank");
        }
        return value;
    }
}

public class ToyDemo {
    public static void main(String[] args) {
        ToyCar car = new ToyCar("Speedster");
        ToyRobot robot = new ToyRobot("Bolt");
        System.out.println(car.makeSound());
        System.out.println(robot.makeSound());
        System.out.println(car.getToyId());
        System.out.println(robot.getToyId());
        // Toy is abstract, so `new Toy()` cannot compile.
    }
}
