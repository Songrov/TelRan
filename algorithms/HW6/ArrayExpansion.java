package telran.homework.algorithms.HW6;

import java.util.Arrays;

    public class ArrayExpansion {
        public static void main(String[] args) {
            int[] originalArray = {1, 2, 3, 4, 5};
            int numberOfNewElements = 3;

            int[] expandedArray = expandArray(originalArray, numberOfNewElements);

            System.out.println("Original Array: " + Arrays.toString(originalArray));
            System.out.println("Expanded Array: " + Arrays.toString(expandedArray));
        }

        public static int[] expandArray(int[] originalArray, int numberOfNewElements) {
            // Создаем новый массив, размер которого равен размеру исходного массива плюс количество новых элементов
            int[] newArray = new int[originalArray.length + numberOfNewElements];

            // Копируем все элементы из исходного массива в новый массив
            System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);

            // Добавляем заданное количество новых элементов (например, нули) в новый массив
            for (int i = originalArray.length; i < newArray.length; i++) {
                newArray[i] = 0;  // Или любое другое значение по умолчанию
            }

            return newArray;
        }
    }