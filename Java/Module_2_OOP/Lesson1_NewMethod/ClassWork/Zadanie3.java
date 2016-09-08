package Module_2_OOP.Lesson1_NewMethod.ClassWork;

/**
 * Created by Roman on 23.11.2015.
 */
public class Zadanie3 {
    public static void main(String[] args) {
        // Написать метод(ы) который получает количество дней и выводит часы, минуты и секунды (через return)
        int day = 5;
        int hour = 24;
        int minute = 60;
        int sec = 60;

        int result1 = DaytoHour(day, hour); // Из Дней в часы
        System.out.println("Часов в 5 днях: " +result1);

        int result2 = DaytoMinute(day, minute);
        System.out.println("Минут в 5 днях: " +result2);

        int result3 = DaytoSecond(day, sec);
        System.out.println("Секунд в 5 днях: " +result3);
    }

    static int DaytoHour(int a, int b) {
        return a * b;
    }

    static int DaytoMinute(int a, int b) {
        return a * 24 *b;
    }

    static int DaytoSecond(int a, int b) {
        return a*24*60*b;
    }

}
