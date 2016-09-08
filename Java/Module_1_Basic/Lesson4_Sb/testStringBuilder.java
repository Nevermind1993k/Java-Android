package Module_1_Basic.Lesson4_Sb;

import java.util.Scanner;

/**
 * Created by Roman on 06.11.2015.
 */
public class testStringBuilder {

    public static void main(String[] args) {

        char ch = 'w';

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //Ввели строку с клавы

        StringBuilder sb = new StringBuilder();
        sb.append(str); //добавить в sb строку str
        System.out.println(sb);

        sb.append(" А этот текст добавили в StringBuilder"); // добавить в строку sb , фразу : " А этот текст добавили в StringBuilder"
        String goodStr = sb.toString();
        System.out.println(goodStr);

        int goodStrLength = goodStr.length();
        System.out.println("Длина строки: " +goodStrLength);
        sb.insert (10, "(метод inser)"); //добавить с 10го символа фразу: "Длина строки: ", потом продолжет выводить нашу строку

        System.out.println(sb);
        System.out.println(sb.delete(3,5));

        sb.setCharAt (0, 'x'); //заменить 0-ую позицию на 'x'
        sb.setCharAt(1, ch);
        System.out.println(sb.toString());

    }
}
