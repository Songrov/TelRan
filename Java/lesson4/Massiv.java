package telran.homework.lesson4;

public class Massiv {
    public static void main(String[] args) {
        int [] [] q = new int[][] {
                {1,2,3},
                {4},
                {3,4,5,6,7}
        };
        massiv(q);


    }
    public static void massiv(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j < array[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }}}
