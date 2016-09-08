package Module_1_Basic.Lesson5_Loop;

/**
 * Created by Roman on 09.11.2015.
 */
public class Test_if {

    public static void main(String[] args) {

        // && - AND, И, Все условия
        // || - OR, ИЛИ, Одно из
        // ! - NOT НЕ

        int a = 2;

        if (a == 1)                 System.out.println('1');
        else if (a == 2)            System.out.println('2');
        else if (a == 3)            System.out.println('3');
        else                        System.out.println("Хм....");


        if (a < 3 && a == 1)        System.out.println("a < 3 && a == 1");
        else if (a == 2 || a > 5)   System.out.println("a == 2 || a > 5");
        else                        System.out.println("I dont now");
        }
    }
