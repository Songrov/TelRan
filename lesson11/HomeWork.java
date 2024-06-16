package telran.homework.lesson11;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(
                makeMap(
                        new String[] {"Dima", "Masha"},
                        new int[] {23,33}
                )
        );

        System.out.println(
                mostFrequentString(
                        List.of("один раз это один раз но только раз".split(" "))
                )
        );

        System.out.println(
                getWords(
                        List.of("alla", "student", "students", "al", "pass", "sap", "lalalala")
                )
        );
    } // main

    // Сгруппируйте слова с одинаковым набором символов
    // Один и те-же символы могут встречаться несколько раз
    // Например: ["alla", "student", "students", "al", "pass", "sap", "lalalala"]
    // -> [["student", "students"], ["alla", "al", "lalalala"], ["pass", "sap"]]
    public static Collection<List<String>> getWords(List<String> strings) {
        Map<String, List<String>> container = new HashMap<>();
        for (String s: strings) {
            Set<String> key = new TreeSet<>(
                    Arrays.asList(
                            s.split("")
                    )
            );
            String k = key.toString(); // "[a, l]"
            List<String> values = container.get(k);
            if(values == null) {
                values = new ArrayList<>();
            }
            values.add(s);
            container.put(k, values);
        }
        return container.values();
    }


    //  Верните самую часто встречающуюся строку в списке строк
    public static String mostFrequentString(List<String> strings) {
        Map<String, Integer> words = new HashMap<>();
        for (String s: strings) { // O(N)
            Integer count = words.get(s);
            if(count == null) {
                count = 0;
            }
            words.put(s,++count);
        }
        TreeMap<Integer, String> count = new TreeMap<>(); // O(N*logN)
        for(Map.Entry<String, Integer> e: words.entrySet()) {
            count.put(e.getValue(), e.getKey());
        }
        return count.lastEntry().getValue(); // O(1)
    }



    // Создайте метод, принимающий на вход массив строк
    // и массив целых одинаковой длины и возвращающий Map
    //Например: ["Dima", "Masha"], [23,33] -> [{"Dima":23}, {"Masha", 33}]
    public static Map<String, Integer> makeMap(String [] strings, int [] ints) {
        Map<String, Integer> result = new HashMap<>();
        if(strings == null || ints == null || strings.length != ints.length) {
            return result;
        }
        for (int i = 0; i < strings.length; i++) {
            result.put(strings[i], ints[i]);
        }
        return  result;
    }
}
