import java.io.Serializable;

/**
 * Базовый класс Animal, реализующий Serializable (для Задания 2).
 */
public class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name='" + name + "'}";
    }
}
