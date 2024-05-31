package telran.homework.lesson8;

import java.util.HashSet;
import java.util.Set;

/*
Напишите метод, принимающий на вход строку и возвращающий набор уникальных символов этой строки
Например: "hello, world!" -> {' ', 'd', 'w', h', 'e', 'l', 'o', 'w', 'r'}.
 */

public class Unique {

    public static void main(String[] args) {
        String input = "hello, world!";
        Set<Character> uniqueCharacters = getUniqueCharacters(input);
        System.out.println(uniqueCharacters);
    }
    public static Set<Character> getUniqueCharacters(String input) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }
        return uniqueChars;
    }
}
