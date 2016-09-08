package Module_1_Basic.Lesson10_Printf;

import java.util.Locale;

/**
 * Created by Roman on 19.11.2015.
 */
public class Test1_FormatStrok {

    public static void main(String[] args) {

        double a1 = 1000000 / 3;
        System.out.println("a1: " + a1);

        double a = 1000000.0 / 3.0;
        System.out.println("a: " + a);

        System.out.printf("%.3f\n", a);  //souf
        System.out.printf("%8.3a\n", a); //8 - ширина поля, из них 3 дробные
        System.out.printf("хеш код: " + "%.3h\n", a);


        String str = "I love Java";
        System.out.printf("%S\n", str);
        System.out.printf("%s\n", str);

        // Флаги (Знаки)
        System.out.printf("%+.1f\n", a);
        System.out.printf("%,.3f\n", a);
        System.out.printf("% .2f\n", a);

        System.out.printf("%1$s %2$+.4f \n", "Наше число: ", a);

        //Региональные флаги
        System.out.printf(Locale.ENGLISH, "%,d%n", 1000000);
        System.out.printf(Locale.GERMAN, "%,d%n", 1000000);
        System.out.printf(Locale.FRANCE, "%,d%n", 1000000);



    }
}
