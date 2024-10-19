package telran.homework.lesson15;

import telran.lesson15.Student;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorTester {
    public static void main(String[] args) {
        // Collector - механизм для выполнения операций над потоком
        // Механизм преобразования потока во что угодно
        // collect - терминальная функция которая принимает Collector

        List<String> names = List.of("Masha", "Alexander", "Sveta", "Vlad", "Alice", "Xenia");

        System.out.println(
                names.stream()
                        .map(name -> name.toUpperCase())
                        // .toList()
                        // .collect(Collectors.toList())
                        .collect(Collectors.toSet())
        );

        // соберем все элементы в Map<длина, список элементов>
        System.out.println(
                names.stream()
                        .collect(
                                Collectors.groupingBy(
                                        s -> s.length() // лямбда для вычисления ключа каждого элемента
                                )
                        )
        );

        // groupingBy создает мапу по ключу из лямбды
        // соберем все элементы в Map<длины, количества элементов с такой длиной>
        System.out.println(
                names.stream()
                        .collect(
                                Collectors.groupingBy(
                                        s -> s.length()
                                )
                        ) // Map<Integer, List<String>>
                        .entrySet() // Set<Pair<Integer, List<String>>
                        .stream()
                        .map(pair -> new AbstractMap.SimpleEntry(pair.getKey(), pair.getValue().size()))
                        .collect(
                                Collectors.toMap(
                                        pair -> pair.getKey(),
                                        pair -> pair.getValue()
                                )
                        )
        );

        // counting
        System.out.println(
                names.stream()
                        .collect(
                                Collectors.counting()
                        )
        );


        // partitioningBy группирует элементы потока по предикату
        System.out.println(
                names.stream()
                        .collect(
                                Collectors.partitioningBy( // Map<Boolean, List<String>>
                                        s -> s.endsWith("a")
                                )
                        )
        );


        List<Student> students = List.of(
                new Student("Michael", "Svetlov", 24),
                new Student("Alexander", "Svetlov", 28),
                new Student("Daria", "Petrovskaya", 19),
                new Student("Maria", "Drobysheva", 19),
                new Student("Max", "Pavlov", 24)
        );

        // toCollection - выбрать в какую коллекцию собирать поток
        names.stream()
                .collect(
                        Collectors.toCollection(
                                TreeSet::new
                        )
                );

        // соберите не повторяющиеся фамилии студентов в контейнер по
        // возрастанию
        System.out.println("" +
                students.stream()
                        .map(student -> student.getLastName())
                        .collect(
                                Collectors.toCollection(
                                        TreeSet::new
                                )
                        )
        );

        // сгруппируйте студентов по возрасту
        // Map<Integer, List<Student>>
        System.out.println(
                students.stream()
                        .collect(
                                Collectors.groupingBy(
                                        student -> student.getAge()
                                )
                        )
        );

        // разделите студентов по гендеру
        // считая что фамилии оканчивающееся на 'a' женские
        // Map<Boolean, List<Student>>
        // true - женские
        System.out.println(
                students.stream()
                        .collect(
                                Collectors.partitioningBy(
                                        student -> student.getLastName().endsWith("a")
                                )
                        )
        );

        System.out.println(
                students.stream()
                        .collect(
                                Collectors.partitioningBy(
                                        student -> student.getLastName().endsWith("a"),
                                        Collectors.counting() // применится к List<Student>
                                )
                        )
        );

        // joining - объединение элементов в строку через разделитель
        System.out.println(
                students.stream()
                        .map(student -> student.getFirstName())
                        .collect(
                                Collectors.joining(
                                        ", ",
                                        "{",
                                        "}"
                                )
                        )
        );


// Вычисление среднего возраста студентов
        System.out.println(
                students.stream()
                        .collect(Collectors.averagingDouble(
                                Student::getAge
                        ))
        );

// Поиск самого молодого работника
        System.out.println(
                students.stream()
                        .collect(Collectors.minBy(Comparator.comparingInt(Student::getAge)))
        );

// Разбиение студентов на группы по возрасту
        System.out.println(
                students.stream()
                        .collect(Collectors.groupingBy(student -> student.getAge() / 10))
        );

        // Вычисление среднего возраста мужчин и женщин
        System.out.println(
                students.stream()
                        .collect(Collectors.partitioningBy(
                                student -> student.getLastName().endsWith("a"),
                                Collectors.averagingDouble(Student::getAge)
                        ))
        );



    }
}
