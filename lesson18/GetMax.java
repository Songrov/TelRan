package telran.homework.lesson18;

import java.util.Arrays;
import java.util.Comparator;

public class GetMax {
    // Напишите шаблонный метод getMax который принимает на вход массив
    // произвольного типа и компаратор
    public static <T> T getMax(T [] t, Comparator<T> comparator) {
        return Arrays.stream(t)
                .max(comparator)
                .orElse(null);
    }
}