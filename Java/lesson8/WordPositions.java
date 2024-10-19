package telran.homework.lesson8;
/*
Напишите метод, который принимает строку и возвращает для каждого слова строки порядковые номера слов.
Например: "один раз это один раз но только раз" -> {"один":[0,3,7], "раз":[1,4], "это":[2], "но":[5], "только":[6]}
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPositions {

    public static void main(String[] args) {
        String input = "один раз это один раз но только раз";
        Map<String, List<Integer>> result = getWordPositions(input);
        System.out.println(result);
    }

    public static Map<String, List<Integer>> getWordPositions(String input) {
        Map<String, List<Integer>> wordPositions = new HashMap<>();
        String[] words = input.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            wordPositions.putIfAbsent(word, new ArrayList<>());
            wordPositions.get(word).add(i);
        }

        return wordPositions;
    }


}

