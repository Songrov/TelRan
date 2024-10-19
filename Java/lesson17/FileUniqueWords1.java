package telran.homework.lesson17;
/*
Распечатайте в каких строках файла содержатся уникальные слова
Например, если строки файла:
один раз
это один раз
но только раз
но один это два
Результат:
[{один: [0,1,2]}, {раз: [0,1,3]}, {это: [1,3]}, {но:[2,3]} …]
Обратите внимание на IntStream.range(…)
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class FileUniqueWords1 {
    public static void main(String[] args) {
        String fileName = "digits.txt"; // замените на имя вашего файла
        Map<String, List<Integer>> result = uniqueWords(fileName);
        result.forEach((word, lines) -> System.out.println(word + ": " + lines));
    }


    public static Map<String, List<Integer>> uniqueWords(String fileName) {
        Map<String, List<Integer>> wordOccurrences = new HashMap<>();

        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            lines = reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < lines.size(); i++) {
            String[] words = lines.get(i).split("\\s+");
            for (String word : words) {
                wordOccurrences
                        .computeIfAbsent(word, k -> new ArrayList<>())
                        .add(i);
            }
        }

        return wordOccurrences;
    }


}
