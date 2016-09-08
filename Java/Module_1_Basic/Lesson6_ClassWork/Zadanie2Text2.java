package Module_1_Basic.Lesson6_ClassWork;

/**
 * Created by Roman on 13.11.2015.
 */
public class Zadanie2Text2 {

    public static void main(String[] args) {

        //Есть строка. Вытянуть из нее в разные переменные текст (2-е переменные) и цифры (1-на переменная).

        //*нам не известно сколько символов текстовых и сколько цифр
        // (например: «тел.:234-59-02, тел.моб.: +38 067 333 33 33»),
        // нужно что бы текст был в одной переменной, а цифры во второй,
        // если после цифр идет опять текст он также вносится в отдельную переменную и т.д.

        String str = "тел.: 234-59-02";
        String num = "";
        String text = "";
        int a = str.length();

        for (int i = 0; i < a; i++) {
            char ai = str.charAt(i);

            if (Character.isLetter(ai)) {   // Если символ текст
                text = text + ai;           // Добавляем в text
            } else {                        //Остальное к цифрам
                num += num;
            }
        }
        System.out.println(text);
        System.out.println(num);
    }
}
