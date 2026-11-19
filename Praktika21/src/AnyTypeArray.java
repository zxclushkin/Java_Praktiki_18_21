import java.util.Arrays;

/**
 * Обобщенный класс для хранения массива любых типов данных.
 * Внутри хранит Object[] — это наглядно показывает принцип стирания типов в Java.
 */
public class AnyTypeArray<E> {
    private final Object[] elements;

    public AnyTypeArray(E[] array) {
        if (array == null) {
            this.elements = new Object[0];
        } else {
            this.elements = Arrays.copyOf(array, array.length, Object[].class);
        }
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException("Индекс вне границ: " + index);
        }
        return (E) elements[index];
    }

    public int size() {
        return elements.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
