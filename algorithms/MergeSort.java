package telran.homework.algorithms;

import java.util.Arrays;

/*
У вас есть список из n элементов, которые представляют собой оценки студентов по математике.
 Вам нужно отсортировать этот список в порядке убывания оценок с использованием алгоритма сортировки Merge sort.
Для решения этой задачи напишите функцию, которая принимает на вход список оценок и возвращает новый список,
отсортированный в порядке убывания.
{3, 8, 1, 9, 4, 2, 7, 6, 5 };
 */
public class MergeSort {

        public static void main(String[] args) {
            int[] grades = {3, 8, 1, 9, 4, 2, 7, 6, 5};
            System.out.println("Не отсотрированный: " + Arrays.toString(grades));

            int[] sortedGrades = mergeSort(grades);
            System.out.println("Отсортированный: " + Arrays.toString(sortedGrades));
        }

        public static int[] mergeSort(int[] array) {
            if (array.length <= 1) {
                return array;
            }

            int mid = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);

            return merge(mergeSort(left), mergeSort(right));
        }

        public static int[] merge(int[] left, int[] right) {
            int[] result = new int[left.length + right.length];
            int i = 0, j = 0, k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] >= right[j]) {  // Изменение сравнения на >= для убывающего порядка
                    result[k++] = left[i++];
                } else {
                    result[k++] = right[j++];
                }
            }

            while (i < left.length) {
                result[k++] = left[i++];
            }

            while (j < right.length) {
                result[k++] = right[j++];
            }

            return result;
        }
    }
