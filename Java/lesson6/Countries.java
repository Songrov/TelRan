package telran.homework.lesson6;
// 1. Есть список countries {"Andorra", "Belize", "Cayman", "France",
// "Argentina", "Cuba", "Sweden", "austria"} и список
//words {"Andorra", "Canada", "First", "candy", "austria", "Argentina", "wood",
// "parrot", "cat", "Alan", "Cuba", "Finland", "Axelrod" , "Avangard", "Cuba"}
//Оставить в countries только те страны, которые присутствуют также и в списке words

//Напишите метод, принимащий два массива целых и возвращающий
// список из общих элементов этих массивов.
//Например: [1, 2, 5, 5, 8, 9, 7, 10], [1, 0, 6, 15, 6, 4, 7, 0] -> {1, 7}
//3. Напишите итератор для перебора MyArrayList в порядке возрастания значений элементов
//** 4. Напишите для MyArrayList ListIterator возвращая его в методе listIterator(),
// реализовать операции
//boolean hasNext()
//boolean  hasPrevious()
//E next()
//E previous()
//остальные можно не реализовывать


import java.util.ArrayList;
import java.util.List;

public class Countries {
    public static void main(String[] args) {

       List<String> countries = new ArrayList<>(
               List.of("Andorra", "Belize", "Cayman", "France", "Argentina",
                       "Cuba", "Sweden", "austria")
       );

        List<String> words = new ArrayList<>(
                List.of("Andorra", "Canada", "First", "candy", "austria",
                        "Argentina", "wood", "parrot", "cat", "Alan", "Cuba",
                        "Finland", "Axelrod" , "Avangard", "Cuba")
        );

        countries.retainAll(words);

        // Выводим результат
        System.out.println(countries);
    }
}
