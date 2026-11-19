import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Задание 1 (Практическая работа № 21).
 * Обобщенный метод для конвертации массива строк или чисел в список.
 */
public class Task1 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("=== Задание 1. Конвертация массива строк/чисел в список ===");

        String[] strings = {"Java", "Generics", "Erasure"};
        Integer[] numbers = {10, 20, 30, 40};

        List<String> stringList = arrayToList(strings);
        List<Integer> numberList = arrayToList(numbers);

        System.out.println("Исходный массив строк: " + Arrays.toString(strings));
        System.out.println("Список строк:          " + stringList);
        System.out.println("Исходный массив чисел: " + Arrays.toString(numbers));
        System.out.println("Список чисел:          " + numberList);
    }

    public static <E> List<E> arrayToList(E[] array) {
        List<E> list = new ArrayList<>();
        for (E element : array) {
            list.add(element);
        }
        return list;
    }
}
