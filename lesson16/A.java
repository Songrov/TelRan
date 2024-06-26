package telran.homework.lesson16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
Напишите метод, принимающий на вход имя тех текстового файла, и воззвращающий количество строк в нем
public static int countLines(String fileName)

Посчитайте количество строк текстового файла, содержащих определенную подстроку
public static int countWordsWithPattern(String fileName, String pattern)

(x) Посчитайте количество слов в текстовом файле - считается что слова отделяются пробелами
public static int countWords(String fileName)

Обратите внимание на метод BufferedReader.lines()
 */
public class A {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");

        fis.close();

        System.out.println(fis.readAllBytes());
    }
}
