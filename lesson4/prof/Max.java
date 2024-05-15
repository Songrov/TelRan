package telran.homework.lesson4.prof;

public class Max {

    // Напишите метод, который найдет максимум в двухмерном масиве целых.
// Добавьте проверки на null ( если передаваемый массив null,
// если одномерные массивы null).
    public static int max(int [] [] a) {
        if ( a == null)
            return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++) {
            if( a[i] == null) {
                continue;
            } else {
                for(int j = 0; j < a[i].length; j++) {
                    if( a[i][j] > max) {
                        max = a[i][j];
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [][] array = null;
        System.out.println(max(array));
        int [][] a = {
                null,
                {1,2},
                {-10}
        };
        System.out.println(max(a));
    }
}
