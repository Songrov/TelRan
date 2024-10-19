package telran.homework.lesson10;

import java.util.HashMap;
import java.util.Map;

/*
Создайте метод, принимающий на вход массив строк и массив целых одинаковой длины и возвращающий Map
public static Map makeMap(String [] strings, int [] ints)
Например: ["Dima", "Masha"], [23,33] -> [{"Dima":23}, {"Masha", 33}].
 */
public class HW1 {
        public static Map<String, Integer> makeMap(String[] strings, int[] ints) {
            if (strings.length != ints.length) {
                throw new IllegalArgumentException("Both arrays must have the same length");
            }

            Map<String, Integer> result = new HashMap<>();
            for (int i = 0; i < strings.length; i++) {
                result.put(strings[i], ints[i]);
            }

            return result;
        }




        public static void main(String[] args) {
            String[] names = {"Dima", "Masha"};
            int[] ages = {23, 33};

            Map<String, Integer> map = makeMap(names, ages);
            System.out.println(map);
        } // main
    }

