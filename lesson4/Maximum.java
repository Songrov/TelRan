package telran.homework.lesson4;

import java.util.Arrays;
import java.util.Comparator;

//  Напишите метод, который найдет максимум в двухмерном масиве целых.
//  Добавьте проверки на null ( если передаваемый массив null, если одномерные массивы null).
//Напишите метод для распечатки на экране двухмерного массива целых. Например, вот так:[
//[1,2,3],
//[4],
//[3,4,5,6,7]
//]
public class Maximum {

    public static void main(String[] args) {
        int[][] exampleArray = {
                {1, 2, 3},
                {4},
                {3, 4, 5, 6, 7}
        };
        int max = findMax(exampleArray);
        System.out.println("Максимум в двумерном массиве: " + max);
    }


    public static int findMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] row : array) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

}
