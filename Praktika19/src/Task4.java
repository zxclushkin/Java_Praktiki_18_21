import java.util.Arrays;

/**
 * Задание 4 (Практическая работа № 19).
 * Сортировка студентов по среднему баллу и поиск по ФИО с EmptyStringException и StudentNotFoundException.
 */
public class Task4 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("=== Задание 4. Сортировка и поиск студентов ===");

        Student[] students = {
                new Student("Иванов Иван", 4.3),
                new Student("Петров Петр", 3.9),
                new Student("Сидорова Анна", 4.8)
        };

        Arrays.sort(students);
        System.out.println("Список студентов (отсортирован по убыванию среднего балла):");
        for (Student student : students) {
            System.out.println("  - " + student);
        }

        System.out.println();
        testSearch(students, "Иванов Иван");
        testSearch(students, "Смирнов Алексей");
        testSearch(students, "   ");
    }

    private static void testSearch(Student[] students, String query) {
        try {
            Student found = findStudent(students, query);
            System.out.println("Найден студент: " + found);
        } catch (EmptyStringException | StudentNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        }
    }

    public static Student findStudent(Student[] students, String fullName)
            throws EmptyStringException, StudentNotFoundException {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new EmptyStringException("Передана пустая строка ФИО!");
        }
        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(fullName.trim())) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО '" + fullName + "' не найден.");
    }
}
