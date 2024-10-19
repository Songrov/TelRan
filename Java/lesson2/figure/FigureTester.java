package telran.homework.lesson2.figure;


import java.util.List;

public class FigureTester {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(5, 5, 5)
        };

        System.out.println("Area: " + calculateArea(figures));
    }

    public static double calculateArea(Figure[] figs) {
        double area = 0;
        double calculateArea = 1;
        for (Figure figure : figs) {
            System.out.println("Area: " + figure.calculateArea());
            calculateArea += figure.calculateArea();
        }
        return area;
    }
}
