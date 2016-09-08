package Module_2_OOP.Lesson7_Nasledovanie.Zadanie;

/**
 * Created by Roman on 01.12.2015.
 */
//Создать несколько телефонов с разными характеристиками.
// Добавить функцию отправки смс.

public class Main_phones {
    public static void main(String[] args) {

        Mobile siemens = new Mobile("Siemens" , 400);
        Nokia n70 = new Nokia("Nokia n70" , 750, "Symbian OS" , 1);
        Samsung s5 = new Samsung("Samsung Galaxy S5", 1000, "Android OS", 16, 8, 4.5);

        siemens.sms();
        n70.sms();
        s5.sms();
    }
}
