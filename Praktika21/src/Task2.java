/**
 * Задание 2 (Практическая работа № 21).
 * Класс, который умеет хранить массив любых типов данных (Integer, Long, String и др.).
 */
public class Task2 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("=== Задание 2. Хранение массива любых типов ===");

        AnyTypeArray<Integer> intArray = new AnyTypeArray<>(new Integer[]{1, 2, 3, 4});
        AnyTypeArray<Long> longArray = new AnyTypeArray<>(new Long[]{100L, 200L, 300L});
        AnyTypeArray<String> strArray = new AnyTypeArray<>(new String[]{"один", "два", "три"});

        System.out.println("Массив Integer (размер " + intArray.size() + "): " + intArray);
        System.out.println("Массив Long    (размер " + longArray.size() + "): " + longArray);
        System.out.println("Массив String  (размер " + strArray.size() + "): " + strArray);
    }
}
