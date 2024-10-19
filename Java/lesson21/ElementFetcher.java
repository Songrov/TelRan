package telran.homework.lesson21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ElementFetcher {
    public static void main(String[] args) {
        List<String> countries = List.of("Cuba", "Ecuador", "Brazil", "Canada");
        Collection<String> selectedCountries = getElements(countries, 1, 2);

        System.out.println(selectedCountries);  // Выводит: [Ecuador, Brazil]
    }

    public static <T> Collection<T> getElements(List<T> list, int... elements) {
        Collection<T> result = new ArrayList<>();

        for (int index : elements) {
            // Проверяем, что индекс находится в пределах размера списка
            if (index >= 0 && index < list.size()) {
                result.add(list.get(index));
            }
        }

        return result;
    }
}
