package telran.homework.lesson17;

/*
Распечатайте уникальные слова из файла в обратном порядке - имя файла передается в метод в виде параметра
public static void uniqueWords(String filename)
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class FileUniqueWords {

    public static void main(String[] args) {
        String fileName = "digits.txt";
        uniqueWords(fileName);


    }


    public static void uniqueWords(String fileName) {
        Set<String> uniqueWords = new TreeSet<>(Collections.reverseOrder());

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            reader.lines()
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .map(String::toLowerCase)
                    .forEach(uniqueWords::add);
        } catch (IOException e) {
            e.printStackTrace();
        }

        uniqueWords.forEach(System.out::println);
    }


}
