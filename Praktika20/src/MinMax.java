/**
 * Обобщенный класс MinMax для поиска минимального и максимального элемента массива.
 */
public class MinMax<T extends Comparable<T>> {
    private final T[] array;

    public MinMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        this.array = array;
    }

    public T getMin() {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T getMax() {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}
