package Module_1_Basic.Lesson4_Sb.HW_0611;

/**
 * Created by Roman on 08.11.2015.
 */
public class HW4Telephone {

    public static void main(String[] args) {

        //Текст: «Тел/факс.: (044) 234-45-67; тел.: (044) 234-45-68; тел.моб.: +38(095) 123-45-67».
        //Вытянуть каждый телефон в таком виде: (044) 234-45-67 или +38(095) 123-45-67 в отдельную переменную.

        String str = "Тел/факс.: (044) 234-45-67; тел.: (044) 234-45-68; тел.моб.: +38(095) 123-45-67;";
        StringBuilder sb = new StringBuilder(str);


        int a = str.indexOf(':');
        int b = str.indexOf(';');
        String phone1 = str.substring(a + 1, b);
        System.out.println(phone1);

        int a1 = str.indexOf("тел.:");
        int b1 = str.indexOf("; тел.моб");
        String phone2 = str.substring(a1 + 5, b1);
        System.out.println(phone2);

        int lasta = str.lastIndexOf(':');
        int lastb = str.lastIndexOf(';');
        String phone3 = str.substring(lasta + 1, lastb);
        System.out.println(phone3);


    }
}
