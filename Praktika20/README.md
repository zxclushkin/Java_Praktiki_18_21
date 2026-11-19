# Практическая работа № 20. Работа с дженериками

Проект IntelliJ IDEA с 4 легкими заданиями по обобщенным типам (Generics):

1. **Task1.java** — обобщенный класс `Triple<T, V, K>` с геттерами и выводом имен классов.
2. **Task2.java** — ограничения на параметры типа (`T extends Comparable<T>`, `V extends Animal & Serializable`) в классе `BoundedTriple`.
3. **Task3.java** — обобщенный класс `MinMax<T extends Comparable<T>>` для поиска минимума и максимума в массиве.
4. **Task4.java** — необобщенный класс `Calculator` со статическими обобщенными методами `sum`, `subtraction`, `multiply`, `divide`.

Можно запускать как общий `Main.java` (меню), так и отдельно каждый `Task1`–`Task4`.
