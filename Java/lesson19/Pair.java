package telran.homework.lesson19;

public class Pair<T, U> {

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "one");
        Pair<Integer, String> pair2 = new Pair<>(1, "one");
        Pair<Integer, String> pair3 = new Pair<>(2, "two");

        System.out.println("pair1 equals pair2: " + Pair.equals(pair1, pair2)); // true
        System.out.println("pair1 equals pair3: " + Pair.equals(pair1, pair3)); // false
    }



    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static <T, U> boolean equals(Pair<T, U> pair1, Pair<T, U> pair2) {
        if (pair1 == pair2) {
            return true;
        }
        if (pair1 == null || pair2 == null) {
            return false;
        }
        boolean firstEqual = pair1.getFirst() == null ? pair2.getFirst() == null : pair1.getFirst().equals(pair2.getFirst());
        boolean secondEqual = pair1.getSecond() == null ? pair2.getSecond() == null : pair1.getSecond().equals(pair2.getSecond());
        return firstEqual && secondEqual;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }


}
