package telran.homework.lesson24;

import java.util.stream.Collectors;

/*
 1. Создайте флюкс из нескольких имен - например, "Max", "Masha", "Alexander", "Olga"
Преобразуйте строки в их длину и соберите длины в список целых.
Распечатайте список, подписавшись на этот флюкс

 Воспользуйтесь именами из предыдущего примера и создайте флюкс и с помощью flatMap преобразуйте его в
"max", "MAX", "masha", "MASHA" …
То есть, для кажого имени нужно выдавать пару элементов в нижнем и в верхем регистре.
Соберите в Set, распечатайте Set

(xx) 3. Воспользуйтесь CurrencyService чтобы вызвать два перевода валюты друг за другом:
евро в фунты и получившуюся сумму фунтов в доллары
Выполните эту операцию для флюкса из 10,20,50,100,500 евро
Воспользуйтесь двумя последовательными flatMap
Результаты сохраните в список и его распечатайте

 */
public class Flux {
    public static void main(String[] args) {
        reactor.core.publisher.Flux<String> names = reactor.core.publisher.Flux.just("Max", "Masha", "Alexander", "Olga");
        // Преобразуйте строки в их длину и соберите длины в список целых.
        // Распечатайте список, подписавшись на этот флюкс
        names
                .map(s -> s.length())
                .collectList()
                .subscribe(
                        list -> System.out.println(list)
                );

/*
Воспользуйтесь именами из предыдущего примера и создайте флюкс и с помощью flatMap преобразуйте его в
"max", "MAX", "masha", "MASHA" …
То есть, для кажого имени нужно выдавать пару элементов в нижнем и в верхем регистре.
Соберите в Set, распечатайте Set
 */
        names
                .flatMap(s -> reactor.core.publisher.Flux.just(s.toLowerCase(), s.toUpperCase()))
                .collect(
                        Collectors.toSet()
                )
                .subscribe(
                        set -> System.out.println(set)
                );
    }
}
