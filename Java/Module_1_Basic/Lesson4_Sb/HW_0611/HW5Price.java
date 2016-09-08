package Module_1_Basic.Lesson4_Sb.HW_0611;

/**
 * Created by Roman on 08.11.2015.
 */
public class HW5Price {

    public static void main(String[] args) {

        //Дано текст: «Цена: 0081 грн. Цена: 00511 грн. Цена: 054 грн. Цена: 998 грн.»,
        //нужно понять что там не так и изменить.


        String str = "Цена: 0081 грн. Цена: 00511 грн. Цена: 054 грн. Цена: 998 грн.";

        int a = str.indexOf(':');
        int b = str.indexOf("грн");
        String price1 = str.substring(a+1,b);
        StringBuilder sb = new StringBuilder(price1);
        sb=sb.reverse();
        System.out.println(sb);


        //Цена 00511

        //Цена 054


        int lasta = str.lastIndexOf(':');
        int lastb = str.lastIndexOf("грн");
        String price4 = str.substring(lasta+1, lastb);
        StringBuilder sb4 = new StringBuilder(price4);
        sb4=sb4.reverse();
        System.out.println(sb4);
    }
}
