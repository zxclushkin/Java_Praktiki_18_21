import java.util.Scanner;

/**
 * Главный класс для запуска легких заданий практической работы № 19.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===================================================");
            System.out.println("  Практическая работа № 19. Свои исключения");
            System.out.println("===================================================");
            System.out.println("1 - Задание 1. Проверяемое исключение (BadFileNameException)");
            System.out.println("2 - Задание 2. Непроверяемое исключение (BadFileExtensionException)");
            System.out.println("3 - Задание 3. Онлайн-покупка и проверка ИНН");
            System.out.println("4 - Задание 4. Сортировка и поиск студентов");
            System.out.println("0 - Выход");
            System.out.print("Выберите задание: ");

            String choice = scanner.nextLine().trim();
            System.out.println();

            switch (choice) {
                case "1":
                    Task1.run();
                    break;
                case "2":
                    Task2.run();
                    break;
                case "3":
                    Task3.run(scanner);
                    break;
                case "4":
                    Task4.run();
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
