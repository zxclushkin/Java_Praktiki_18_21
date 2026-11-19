import java.util.Arrays;

/**
 * Задание 3 (Практическая работа № 20).
 * Обобщенный класс MinMax для поиска минимального и максимального элемента массива.
 */
public class Task3 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("=== Задание 3. Обобщенный класс MinMax ===");

        Integer[] numbers = {8, 3, 15, 1, 6};
        MinMax<Integer> intMinMax = new MinMax<>(numbers);
        System.out.println("Массив чисел: " + Arrays.toString(numbers));
        System.out.println("Минимум: " + intMinMax.getMin() + ", Максимум: " + intMinMax.getMax());

        String[] words = {"яблоко", "груша", "арбуз"};
        MinMax<String> strMinMax = new MinMax<>(words);
        System.out.println("Массив строк: " + Arrays.toString(words));
        System.out.println("Минимум: " + strMinMax.getMin() + ", Максимум: " + strMinMax.getMax());
    }
}
