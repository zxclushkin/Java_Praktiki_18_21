import java.util.Scanner;

/**
 * Главный класс для запуска легких заданий практической работы № 18.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===================================================");
            System.out.println("  Практическая работа № 18. Исключения в Java");
            System.out.println("===================================================");
            System.out.println("1 - Задание 1. Деление на ноль (try-catch)");
            System.out.println("2 - Задание 2. Ввод числа, catch и блок finally");
            System.out.println("3 - Задание 3. Генерация исключения (throw)");
            System.out.println("4 - Задание 4. Проброс исключения (throws) и цикл");
            System.out.println("0 - Выход");
            System.out.print("Выберите задание: ");

            String choice = scanner.nextLine().trim();
            System.out.println();

            switch (choice) {
                case "1":
                    Task1.run();
                    break;
                case "2":
                    Task2.run(scanner);
                    break;
                case "3":
                    Task3.run();
                    break;
                case "4":
                    Task4.run(scanner);
                    break;
                case "0":
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный пункт меню. Введите число от 0 до 4.");
            }
            System.out.println();
        }
    }
}
