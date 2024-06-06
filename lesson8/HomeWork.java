package telran.homework.lesson8;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("uniqueChars: " + uniqueChars("hello, world!"));
        Set<Integer> ints = new HashSet<>(
                Arrays.asList(
                        -1, 12, 3, 4, -8, -2
                )
        );
        System.out.println("before removeNegative " + ints);
        removeNegative(ints);
        System.out.println("after removeNegative " + ints);

        System.out.println(index("один раз это один раз но только раз"));
    }

    // Напишите метод, который принимает строку и возвращает для каждого слова
    // строки порядковые номера слов (порядок важен - слова в порядке нахождения
    // в строке, порядковые номера по возрастанию).
    // Например: "один раз это один раз но только раз" -> {"один":[0,2], "раз":[1,3,7], "это":[2], "но":[5], "только":[6]}

    public static Set<Word> index(String s ) {
        Set<Word> r = new LinkedHashSet<>();
        String [] words = s.split(" ");
        for(int i = 0; i <  words.length; i ++) {
            String word = words[i];
            Word w = new Word(word);
            Word existing = findElement(r, w);
            if(existing == null) {
                w.pos.add(i);
                r.add(w);
            } else {
                existing.pos.add(i);
            }
        }
        return r;
    }

    private static Word findElement(Set<Word> r, Word w) {
        for(Word e: r) {
            if(e.equals(w))
                return e; // Элемент из сета
        }
        return null;
    }

    static class Word {
        public String w;
        public List<Integer> pos = new ArrayList<>();

        public Word(String w) {
            this.w = w;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Word word = (Word) o;

            return w.equals(word.w);
        }

        @Override
        public int hashCode() {
            return w.hashCode();
        }

        @Override
        public String toString() {
            return "Word{" +
                    "w='" + w + '\'' +
                    ", pos=" + pos +
                    '}';
        }
    }

    // Напишите метод, который принимает на вход набор (Set)
    // целых чисел и удаляющий из этого набора все отрицательные числа
    // (порядок не важен).
    //
    //Например: {-1, 12,3,4,-8,-2} -> {4, 12, 3, 8}
    public static void removeNegative(Set<Integer> ints) {
        for (Iterator<Integer> iterator = ints.iterator(); iterator.hasNext(); ) {
            if (iterator.next() < 0) {
                iterator.remove();
            }
        }
    }


    // Напишите метод, принимающий на вход строку и возвращающий набор
    // уникальных символов этой строки (порядок не важен)
    //Например: "hello, world!" -> {' ', 'd', 'w', h', 'e', 'l', 'o', '!', 'w', 'r'}.
    public static Set<Character> uniqueChars(String s) {
        Set<Character> c = new HashSet<>();
        for (Character ch : s.toCharArray()) {
            c.add(ch);
        }
        return c;
    }
}
