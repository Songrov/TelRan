package telran.homework.lesson14;


import telran.lesson14.Emp;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpTester {
    public static void main(String[] args) {
        List<Emp> emps = List.of(
                new Emp("Max Petrov", 22, "programmer"),
                new Emp("Ivan Peregudov", 33, "analyst"),
                new Emp("Semen Dezhnev", 55, "manager"),
                new Emp("Katerina Drogova", 31, "programmer"),
                new Emp("Oleg Petrov", 19, "intern"),
                new Emp("Nicolas Spivakov", 23, "analyst"),
                new Emp("Boris Moiseev", 48, "manager"),
                new Emp("Alex Reingard", 33, "analyst"),
                new Emp("Olga Filimonova", 27, "programmer")
        );

        // сохраните в список и распечатайте всех работников с возрастом больше 41
        System.out.println(
                emps.stream()
                        .filter(e -> e.getAge() > 41)
                        .toList()
        );

        // распечатайте только имена всех программистов
        // Olga Filimonova -> Olga
        System.out.println(
                emps.stream()
                        .filter(e -> e.getPosition().equals("programmer"))
                        .map(e -> e.getName())
                        .map(name -> name.split(" ")[0])
                        .toList()
        );

        // посчитайте количество аналитиков
        // max() min() average() count()
        System.out.println(
                emps.stream()
                        .filter(e -> e.getPosition().equals("analyst"))
                        .count()
        );

        // найдите самого молодого работника
        System.out.println(
                emps.stream()
                        .min(
                                Comparator.comparingInt(Emp::getAge)
                        )
                        .orElse(null)
        );

        // посчитайте количество уникальных позиций 4
        System.out.println(
                emps.stream()
                        .map(e -> e.getPosition())
                        .distinct()
                        .count()
        );

        // распечатайте 3 самых опытных работников - кто старше всех
        System.out.println(
                emps.stream()
                        .sorted(
                                Comparator.comparingInt(Emp::getAge).reversed()
                        )
                        .limit(3)
                        .toList()
        );

        // убедитесь что все работники старше 18 лет
        System.out.println(
                emps.stream()
                        .allMatch(e -> e.getAge() > 18)
        );

        // распечатайте фамилии всех женщин - зачанчиваются на 'a'
        System.out.println(
                emps.stream()
                        .map(e -> e.getName())
                        .filter(name -> name.endsWith("a"))
                        .map(name -> name.split(" ")[1])
                        .toList()
        );

        // найдите средний возраст
        // mapToDouble()
        // average()
        System.out.println(
                emps.stream()
                        .mapToDouble(e -> e.getAge())
                        // .map(e -> 0.0 + e.getAge())
                        .average()
                        .orElse(0)
        );

        // посчитайте количество программистов-мужчин - имя не оканчивается на 'a'
        System.out.println(
                emps.stream()
                        .filter(e -> e.getPosition().equals("programmer"))
                        .map(e -> e.getName())
                        .filter(e -> !e.endsWith("a"))
                        .count()
        );

        // распечатайте всех работников, отсортировав их по профессии и по возрасту
        System.out.println(
                emps.stream()
                        .sorted(
                                Comparator.comparing(Emp::getPosition)
                                        .thenComparingInt(Emp::getAge)
                        )
                        .toList()
        );

        // посчитайте сумму возрастов работников
        // reduce
        // mapToInt()
        // sum()
        System.out.println(
                emps.stream()
                        .mapToInt(e->e.getAge())
                        .reduce(
                                (i,j) -> i + j
                        )
                        .orElse(0)
        );

        // Объедините в строку имена всех работников
        System.out.println(
                emps.stream()
                        .map(Emp::getName)
                        .map(name -> name.split(" ")[0])
                        .collect(Collectors.joining(", "))
        );

        // найдите профессию самого старшего из тех работников, кому менее чем 40 лет
        Optional<Emp> Under40 = emps.stream()
                .filter(e -> e.getAge() < 40)
                .max(Comparator.comparingInt(Emp::getAge));

        System.out.println(Under40.map(Emp::getPosition).orElse("Нет сотрудников меньше 40"));


    }
}
