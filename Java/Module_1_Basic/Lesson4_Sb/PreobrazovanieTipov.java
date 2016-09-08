package Module_1_Basic.Lesson4_Sb;

/**
 * Created by Roman on 05.11.2015.
 */
public class PreobrazovanieTipov {

    public static void main(String[] args) {

        //Преобразование числа в строку:
        String s1 = Integer.toString(16); //"16"
        String s2 = Long.toString(888888); // "8888888"
        String s3 = Integer.toString(333, 16);//Преобразование 333 в 16-тиричную систему, получим 14d
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        //Преобразование строки в число:
        int a = Integer.parseInt("2121"); // 2121
        int a1 = Integer.valueOf("666"); // 666
        long b = Long.parseLong("241515151515"); //241515151515
        int c = Integer.parseInt("14d", 16); // 333
        System.out.println(a);
        System.out.println(a1);
        System.out.println(b);
        System.out.println(c);
    }
}
