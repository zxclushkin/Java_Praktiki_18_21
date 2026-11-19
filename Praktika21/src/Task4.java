import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Задание 4 (Практическая работа № 21).
 * Сохранение содержимого каталога в список и вывод первых 5 элементов на экран.
 */
public class Task4 {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("=== Задание 4. Содержимое каталога (первые 5 элементов) ===");

        File targetDir = new File("src");
        String path = targetDir.isDirectory() ? "src" : ".";

        List<String> entries = readDirectory(path);
        System.out.println("Каталог: " + new File(path).getAbsolutePath());
        System.out.println("Всего найдено элементов: " + entries.size());
        System.out.println("Первые 5 элементов:");

        int limit = Math.min(5, entries.size());
        for (int i = 0; i < limit; i++) {
            System.out.println("  " + (i + 1) + ". " + entries.get(i));
        }
    }

    public static List<String> readDirectory(String dirPath) {
        List<String> result = new ArrayList<>();
        File dir = new File(dirPath);
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                result.add(file.getName());
            }
            Collections.sort(result);
        }
        return result;
    }
}
