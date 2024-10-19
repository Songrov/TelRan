package telran.homework.lesson9;

import java.util.*;

public class ChangeList {
    public static void main(String[] args) {
        System.out.println(
                changeList(
                        List.of(10, 20, 30, 40, 50), 4
                )
        );
    }

    // Напишите метод, который принимает на вход список целых и число k
    // Метод должен возвратить список, в котором первые k чисел
    // поменялись местами и должны находится в обратном порядке
    // Например: [10, 20, 30, 40, 50], 4 -> [40, 30, 20, 10, 50]
    // Желательно сделать с помощью стэков/очередей
    public static Collection<Integer> changeList(Collection<Integer> l, int k) {
        /*
        очередь [10, 20, 30, 40, 50]
        стэк [40 30 20 10]  очередь [50]
        очередь [50 40 30 20 10]
         */
        Queue<Integer> q = new LinkedList<>(l);
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < l.size(); i++) {
            s.push(q.poll());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        for (int i = 0; i < l.size() - k; i++) {
            q.add(q.poll());
        }
        return q;
    }
}
