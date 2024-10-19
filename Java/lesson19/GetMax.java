package telran.homework.lesson19;

/*
 Напишите шаблонный метод getMax который принимает на вход массив произвольного типа и компаратор
 */
import java.util.Comparator;

public class GetMax {

    public static void main(String[] args) {
        // Примеры использования
        Integer[] intArray = {1, 3, 2, 5, 4};
        String[] stringArray = {"apple", "orange", "banana", "pear"};

        // Найти максимальный элемент в массиве целых чисел
        Integer maxInt = getMax(intArray, Integer::compareTo);
        System.out.println("Max Integer: " + maxInt); // Output: Max Integer: 5

        // Найти максимальный элемент в массиве строк
        String maxString = getMax(stringArray, String::compareTo);
        System.out.println("Max String: " + maxString); // Output: Max String: pear
    }


    public static <T> T getMax(T[] array, Comparator<? super T> comparator) {
        if (array == null || array.length == 0) {
            return null; // Возвращаем null для пустого или null массива
        }

        T maxElement = array[0];
        for (T element : array) {
            if (comparator.compare(element, maxElement) > 0) {
                maxElement = element;
            }
        }
        return maxElement;
    }


}
