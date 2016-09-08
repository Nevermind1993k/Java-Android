package Module_2_OOP.Lesson1_NewMethod.ClassWork;

/**
 * Created by Roman on 23.11.2015.
 */
public class Zadanie2 {
    public static void main(String[] args) {
        //Написать метод перевода одной валюты во вторую.(через return)
        int grn = 10;
        int dol = 25;

        int result = sum (grn,dol);

        System.out.println("10 грн в долларах: " + result);
    }
    static int sum (int abc, int bcd) {
        return abc * bcd;
    }
}
