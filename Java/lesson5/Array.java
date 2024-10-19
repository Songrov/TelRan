package telran.homework.lesson5;

// Напишите метод, который принимает список целых и возвращает список только из четных:
//{1,2,6,8,15,3} -> {2,6,8}
//Напишите функцию, возвращающую второй по величине элемент списка целых.
//Например, {1,3,4,2} -> 3
//Напишите функцию, меняющую порядок следования элементов в списке на противоположный
//например, {1,2,3} -> {3,2,1}
//** 4. Напишите функцию, удаляющие дубликаты из передаваемого в нее списка строк.
//Например {"Dima", "Sam", "Dima", "Alina"} -> {"Alina", "Dima", "Sam"}

import java.util.ArrayList;
import java.util.List;

public class Array {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 6, 8, 15, 3);
        List<Integer> evenNumbers = a(numbers);
        System.out.println("Список только из четных чисел: " + evenNumbers);

    }



    public static List<Integer> a(List<Integer> numbers) {
        List<Integer> sort = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                sort.add(num);
            }
        }
        return sort;
    }

}
