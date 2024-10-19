package telran.homework.lesson18;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringSplitter {

    //Дана строка "michael;levanov|34|34000"
    //Разбейте ее по резделителям (;|) и распечатайте составные части
    public static void main(String[] args) {
        String line = "michael;levanov|34|34000";
        String[] parts = line.split("");
       // String[] parts = line.split("df");

        // Печатаем составные части строки
        for (String part : parts) {
            System.out.println(
                    Arrays.toString(
                            line.split("\\s+")
                    )
            );
        }

//В строке "Today's temperature is 18 degrees centigrade, yesterday it was 14"
//Замените все чиcла на 21 и замените centi на multi
        System.out.println(
                "Today's temperature is 18 degrees centigrade, yesterday it was 14"
                        .replaceAll("\\d+", "21")
                        .replaceAll("centigrade", "multi")
        );



        String date1 = "24 jan 2001";
        System.out.println(isDate(date1)); // true


    } // main

    /*
    Напишите метод isDate(String) который проверит, что передаваемая строка является датой,
Дата выглядит как "24 jan 2001" - день месяца, месяц и год
Месяцы могут быть только jan, feb, mar и тп
     */
    public static boolean isDate(String date) {
        // Регулярное выражение для проверки даты
        String dateRegex = "^(0?[1-9]|[12][0-9]|3[01])\\s+(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)\\s+(\\d{4})$";
        Pattern pattern = Pattern.compile(dateRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(date);

        // Проверка, соответствует ли строка шаблону даты
        return matcher.matches();
    }
}

