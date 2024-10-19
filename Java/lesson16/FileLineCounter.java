package telran.homework.lesson16;


/*


 Посчитайте количество слов в текстовом файле - считается что слова отделяются пробелами
public static int countWords(String fileName)

Обратите внимание на метод BufferedReader.lines()
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineCounter {


    public static void main(String[] args) {
        String fileName = "digits.txt";
        int lines = FileLineCounter.countLines(fileName);
        System.out.println("количество строк: " + lines);

        int words = countWords(fileName);
        System.out.println("количество слов: " + words);

        String pattern = "1";
        int linesWithPattern = countLinesWithPattern(fileName, pattern);
        System.out.println("Количество под строк: " + linesWithPattern);
    }


    //Посчитайте количество строк текстового файла, содержащих определенную подстроку
//      public static int countWordsWithPattern(String fileName, String pattern)

    public static int countLinesWithPattern(String fileName, String pattern) {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(pattern)) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }


//Посчитайте количество слов в текстовом файле - считается что слова отделяются пробелами
//public static int countWords(String fileName)

    public static int countWords(String fileName) {
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            wordCount = reader.lines()
                    .mapToInt(line -> line.split("\\s+").length)
                    .sum();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordCount;
    }


    // Напишите метод, принимающий на вход имя тех текстового файла, и воззвращающий количество строк в нем
    //public static int countLines(String fileName)

    public static int countLines(String fileName) {
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lineCount;
    }

}