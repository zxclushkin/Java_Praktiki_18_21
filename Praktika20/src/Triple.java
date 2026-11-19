/**
 * Обобщенный класс с тремя параметрами типа (T, V, K).
 */
public class Triple<T, V, K> {
    private final T first;
    private final V second;
    private final K third;

    public Triple(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    public void printClassNames() {
        System.out.println("Тип T: " + (first != null ? first.getClass().getName() : "null"));
        System.out.println("Тип V: " + (second != null ? second.getClass().getName() : "null"));
        System.out.println("Тип K: " + (third != null ? third.getClass().getName() : "null"));
    }
}
