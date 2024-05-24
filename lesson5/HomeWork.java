package telran.homework.lesson5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(
                filterOnlyEven(
                        List.of(1,2,3,4)
                )
        );
        System.out.println(
                List.of(1,2,3,4).stream().filter(i -> i %2 == 0).toList()
        );
        System.out.println(
                secondBiggest(
                        List.of(1,3,4,2) // Read-only
                )
        );
        System.out.println(
                reverse(
                        new ArrayList<>(List.of(1,2,3))
                )
        );
        System.out.println(
                unique(
                        new ArrayList<>(
                                List.of("Dima", "Sam", "Dima", "Alina")
                        )
                )
        );
    }

    // Напишите функцию, удаляющие дубликаты из передаваемого в нее списка строк.
    // Например {"Dima", "Sam", "Dima", "Alina"} -> {"Alina", "Dima", "Sam"}
    public static List<String> unique(List<String> s) {
        List<String> r = new ArrayList<>();
        // поэлементно проходим по s
        // если элемент не присутствует в r то добавляем его
        // O(n^2)

        // сортируем s
        // {"Dima", "Sam", "Dima", "Alina"}
        // {"Alina" "Dima", "Dima", "Sam"}
        // проходим и добавляем новый элемент в r
        // сортировка O(n*log(n)) // + O(n)
        Collections.sort(s);
        r.add(s.get(0));
        for (int i = 1; i < s.size(); i++) {
            String current = s.get(i);
            String prev = s.get(i - 1);
            if( !current.equals(prev)) {
                r.add(current);
            }
        }
        return r;
    }


    // Напишите функцию, меняющую порядок следования элементов в списке на противоположный
    // например, {1,2,3} -> {3,2,1}
    public static List<Integer> reverse(List<Integer> l) {
        if( l == null) {
            return null;
        }
        for (int i = 0; i < l.size()/2; i++) {
            Collections.swap(l, i, l.size() - 1 - i);
//            Integer temp = l.get(i);
//            l.set(i, l.get(l.size() - 1 - i));
//            l.set(l.size() - 1 - i, temp);
            // 0 <> size - 1
            // 1 <> size - 1 - 1
        }
        return l;
    }

    // Напишите функцию, возвращающую второй по величине элемент списка целых.
    // Например, {1,3,4,2} -> 3
    public static Integer secondBiggest(List<Integer> l) {
        if( l == null || l.size() <= 1) {
            return null;
        }
        List<Integer> r = new ArrayList<>(l);
        Collections.sort(r);
        return r.get(r.size() - 2);
    }


    // Напишите метод, который принимает список
    // целых и возвращает список только из четных
    public static List<Integer> filterOnlyEven(List<Integer> l) {
        List<Integer> r = new ArrayList<>();
        for (Integer i : l) {
            if(i % 2 == 0) {
                r.add(i);
            }
        }
        return r;
    }
}
