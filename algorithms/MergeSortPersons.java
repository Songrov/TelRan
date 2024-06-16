package telran.homework.algorithms;

import java.util.Arrays;

public class MergeSortPersons {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 30),
                new Person("David", 35),
                new Person("Eve", 28)
        };

        System.out.println("Original array: " + Arrays.toString(people));

        Person[] sortedPeople = mergeSort(people);
        System.out.println("Sorted array (by age, descending): " + Arrays.toString(sortedPeople));
    }

    public static Person[] mergeSort(Person[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        Person[] left = Arrays.copyOfRange(array, 0, mid);
        Person[] right = Arrays.copyOfRange(array, mid, array.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    public static Person[] merge(Person[] left, Person[] right) {
        Person[] result = new Person[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].age >= right[j].age) {  // Изменение сравнения на >= для убывающего порядка
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
