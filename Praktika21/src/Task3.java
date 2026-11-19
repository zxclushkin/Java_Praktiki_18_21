/**
 * Задание 3 (Практическая работа № 21).
 * Метод, который возвращает любой элемент массива по индексу.
 */
public class Task3 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("=== Задание 3. Получение элемента массива по индексу ===");

        AnyTypeArray<String> cities = new AnyTypeArray<>(new String[]{"Москва", "Казань", "Сочи"});
        Double[] prices = {19.99, 49.50, 99.0};

        System.out.println("Элемент [1] из AnyTypeArray<String>: " + cities.get(1));
        System.out.println("Элемент [2] из Double[]: " + getElementByIndex(prices, 2));

        try {
            System.out.println(cities.get(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Проверка границ: " + e.getMessage());
        }
    }

    public static <E> E getElementByIndex(E[] array, int index) {
        if (array == null || index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Недопустимый индекс: " + index);
        }
        return array[index];
    }
}
