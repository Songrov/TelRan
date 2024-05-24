package telran.homework.lesson6;


import java.util.ArrayList;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        // Есть список countries {"Andorra", "Belize", "Cayman", "France", "Argentina", "Cuba", "Sweden", "austria"} и список
        //words {"Andorra", "Canada", "First", "candy", "austria", "Argentina", "wood", "parrot", "cat", "Alan", "Cuba", "Finland", "Axelrod" , "Avangard", "Cuba"}
        // Оставить в countries только те страны, которые присутствуют также и в списке words
        List<String> countries = new ArrayList<>(
                List.of(
                        "Andorra", "Belize", "Cayman", "France", "Argentina", "Cuba", "Sweden", "austria"
                )
        );
        List<String> words = new ArrayList<>(
                List.of(
                        "Andorra", "Canada", "First", "candy", "austria", "Argentina", "wood", "parrot", "cat", "Alan", "Cuba", "Finland", "Axelrod" , "Avangard", "Cuba"
                )
        );
        countries.retainAll(words);
        System.out.println(countries);
        System.out.println(
                shared(
                        new int[] {1, 2, 5, 5, 8, 9, 7, 10},
                        new int[] {1, 0, 6, 15, 6, 4, 7, 0}
                )
        );
    }

    // Напишите метод, принимащий два массива целых и возвращающий список (List)
    // из общих элементов этих массивов.
    // Например: [1, 2, 5, 5, 8, 9, 7, 10], [1, 0, 6, 15, 6, 4, 7, 0] -> {1, 7}
    public static List<Integer> shared(int [] a, int [ ] b) {
        List<Integer> a1 = new ArrayList<>();
        for(int i : a) {
            a1.add(i);
        }
        List<Integer> a2 = new ArrayList<>();
        for(int i : b) {
            a2.add(i);
        }
        a1.retainAll(a2);
        return a1;
    }

}
