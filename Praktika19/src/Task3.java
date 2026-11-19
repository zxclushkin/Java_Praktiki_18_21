import java.util.Scanner;

/**
 * Задание 3 (Практическая работа № 19).
 * Онлайн-покупка: ввод ФИО и ИНН, генерация InvalidInnException при неверном ИНН.
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        run(scanner);
    }

    public static void run(Scanner scanner) {
        System.out.println("=== Задание 3. Онлайн-заказ и проверка ИНН ===");
        System.out.print("Введите ФИО клиента: ");
        String fullName = scanner.nextLine().trim();

        System.out.print("Введите ИНН (10 или 12 цифр, например 7707083893): ");
        String inn = scanner.nextLine().trim();

        try {
            validateOrder(fullName, inn);
            System.out.println("Заказ успешно оформлен на клиента: " + fullName + " (ИНН: " + inn + ")");
        } catch (InvalidInnException e) {
            System.out.println("Ошибка оформления заказа: " + e.getMessage());
        }
    }

    public static void validateOrder(String fullName, String inn) throws InvalidInnException {
        if (fullName == null || fullName.isEmpty()) {
            throw new InvalidInnException("ФИО клиента не может быть пустым!");
        }
        if (inn == null || !inn.matches("\\d{10}|\\d{12}")) {
            throw new InvalidInnException("Недействительный ИНН: '" + inn + "'. Ожидается 10 или 12 цифр.");
        }
    }
}
