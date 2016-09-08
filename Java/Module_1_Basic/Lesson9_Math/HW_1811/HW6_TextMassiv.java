package Module_1_Basic.Lesson9_Math.HW_1811;

import java.util.Arrays;

/**
 * Created by Roman on 19.11.2015.
 */
public class HW6_TextMassiv {

    public static void main(String[] args) {

        //Есть строка «тел.:222-33-44, тел.моб.: +38 067 333 33 33».
        //Вытянуть из нее в разные ячейки массива текст и цифры.

        //*нам не известно сколько символов текстовых и сколько цифр,
        //нужно что бы текст был в одной ячейке, а цифры во второй,
        //если после цифр идет опять текст он также вносится в отдельную ячейку и т.д.

        String str = "тел.: 222-33-44, тел.моб.: +38 067 333 33 33";
        String [] arrStr = str.split(":");
        System.out.println(Arrays.toString(arrStr));

    }
}
