package telran.homework.lesson9;
/*
Напишите метод, который принимает на вход список целых и число kМетод должен возвратить список, в котором первые k
чисел поменялись местами и должны находится в обратном порядке
Например: [10, 20, 30, 40, 50], 4 -> [40, 30, 20, 10, 50]
Сделайте с помощью стэков/очередей/деков
 */
import java.util.*;

public class ReverseFirstKElements {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int k = 4;

        System.out.println("Порядок: " + numbers);
        List<Integer> result = reverseFirstK(numbers, k);
        System.out.println("Обратный порядок: " + result);
    }

    public static List<Integer> reverseFirstK(List<Integer> list, int k) {
        if (k > list.size() || k < 0) {
            throw new IllegalArgumentException("k must be between 0 and the size of the list");
        }

        Stack<Integer> stack = new Stack<>();

        // Push the first k elements onto the stack
        for (int i = 0; i < k; i++) {
            stack.push(list.get(i));
        }

        // Pop the elements from the stack and put them back in the list
        for (int i = 0; i < k; i++) {
            list.set(i, stack.pop());
        }

        return list;
    }


}
