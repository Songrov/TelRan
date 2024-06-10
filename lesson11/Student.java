package telran.homework.lesson11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String major;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

   @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }



    @Override
    public String toString() {
       return "Student{name='" + name + "', age=" + age + ", major='" + major + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22, "Историк"));
        students.add(new Student("Bob", 25, "Информатик"));
        students.add(new Student("Charlie", 20, "Математик"));
        students.add(new Student("David", 22, "Информатик"));

        // Сортировка по имени (используя Comparable)
        Collections.sort(students);
        System.out.println("Сотр по имени: " + students);

        // Сортировка по убыванию возраста и по возрастанию специальности
        students.sort(Comparator.comparingInt(Student::getAge).reversed()
                .thenComparing(Student::getMajor));
        System.out.println("Сортировка: " + students);
    }
}