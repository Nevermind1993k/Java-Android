package Module_2_OOP.Lesson1_NewMethod.ClassWork;

/**
 * Created by Roman on 23.11.2015.
 */
public class Zadanie3v2 {
    public static void main(String[] args) {
        // Написать метод(ы) который получает количество дней и выводит часы, минуты и секунды (через void)
        int day = 5;
        int hour = 24;
        int minute = 60;
        int sec = 60;

        DaytoHour(day, hour);
        DaytoMinute(day,minute);
        DaytoSecond(day,sec);
    }

    static void DaytoHour (int a, int b) {
        int c = a * b;
        System.out.println("Часов в 5 днях: " + c);
    }

    static void DaytoMinute (int a, int b) {
        int c = a*24*b;
        System.out.println("Минут в 5 днях: " +c);
    }

    static void DaytoSecond (int a, int b) {
        int c = a*24*60*b;
        System.out.println("Секунд в 5 днях: " +c);
    }
}
