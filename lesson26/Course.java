package telran.homework.lesson26;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
1. Создайте класс Course с приватными полями
String specialization
int duration
double price
Создайте конструктор со всеми полями
и метод toString который возвращает строку со значениями всех полей.
С помощью Reflection API создайте экземпляр  класса Course через ссылку на рефлексионный конструктор.
С помощью Reflection API вызовите у экземпляра класса метод toString и выведите на экран его результат

(xx) 2. Добавьте аннотацию Fake с методом String value() default ""
Повесьте эту аннотацию на поле  specialization класса Course
В toString в Course используйте value() из аннотации Fake вместо значения specialization если value() не пусто.
 */
@AllArgsConstructor
@ToString
public class Course {

    private String specialization;
    private int duration;
    private double price;

    public static void main(String[] args) {
        try {
            Class<Course> courseClass = Course.class;
           Constructor<Course> constructor = courseClass.getConstructor(String.class, int.class, double.class);
           Course courseInstance = constructor.newInstance("Computer Science", 6, 1500.0);

            Method toStringMethod = courseClass.getMethod("toString");


            String result = (String) toStringMethod.invoke(courseInstance);
            System.out.println(result);

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}