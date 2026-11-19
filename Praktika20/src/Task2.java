/**
 * Задание 2 (Практическая работа № 20).
 * Ограничения на параметры типа: T extends Comparable, V extends Animal & Serializable.
 */
public class Task2 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("=== Задание 2. Ограничения на параметры типа ===");

        BoundedTriple<String, Cat, Integer> item =
                new BoundedTriple<>("Домашний кот", new Cat("Барсик"), 3);

        System.out.println("T: " + item.getFirst());
        System.out.println("V: " + item.getSecond());
        System.out.println("K: " + item.getThird());
        item.printClassNames();
    }
}
