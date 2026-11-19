import java.io.Serializable;

/**
 * Обобщенный класс с ограничениями на параметры типа:
 * T реализует Comparable, V наследует Animal и реализует Serializable.
 */
public class BoundedTriple<T extends Comparable<T>, V extends Animal & Serializable, K>
        extends Triple<T, V, K> {

    public BoundedTriple(T first, V second, K third) {
        super(first, second, third);
    }
}
