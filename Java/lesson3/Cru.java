package telran.homework.lesson3;

public enum Cru {
    AUTRE(80),
    PREMIER(90),
    GRAND(100);

    private int quality;

    Cru(int quality) {
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }
//1. Шампань - создать перечисление Cru для деревень Шампани с указанием уровня качества
    //AUTRE(80), PREMIER(90), GRAND(100)
    //Добавьте int quality, конструктор и геттер
    //Добавьте в перечисление Weekday метод boolean isWeekEnd(),
    // который вернет true для субботы и воскресенья
    //3. Создайте класс Date с полями:
    //private int year // годprivate Month month // перечисление, которое также нужно создать - месяцы года
    //private int day // день месяца
    //Добавьте конструктор, геттеры и toString
    //Добавьте функцию add(int days) которая увеличивает дату на переданное
    // kоличество дней с учетом високосности года и тп
}
