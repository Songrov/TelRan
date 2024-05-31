package telran.homework.lesson8;
/*
Напишите метод, который принимает на вход набор (Set) целых чисел и удаляющий из этого набора все отрицательные числа (порядок не важен).
Например: {-1, 12,3,4,-8,-2} -> {4, 12, 3, 8}
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Remove {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(-1);
        numbers.add(12);
        numbers.add(3);
        numbers.add(4);
        numbers.add(-8);
        numbers.add(-2);


        remove(numbers);
        System.out.println("положительные числа: " + numbers);
    }
    public static void remove(Set<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 0) {
                iterator.remove();
            }
        }
    }
}
