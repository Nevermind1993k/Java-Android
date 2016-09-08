package Module_1_Basic.Lesson6_ClassWork;

/**
 * Created by Roman on 12.11.2015.
 */
public class Zadanie2Text {

    public static void main(String[] args) {

        //Есть строка «АА1458АВ». Вытянуть из нее в разные переменные текст (2-е переменные) и цифры (1-на переменная).

        //*нам не известно сколько символов текстовых и сколько цифр
        // (например: «тел.:234-59-02, тел.моб.: +38 067 333 33 33»),
        // нужно что бы текст был в одной переменной, а цифры во второй,
        // если после цифр идет опять текст он также вносится в отдельную переменную и т.д.

        String str = "АА1458АВ";
        String num = "";
        String text = "";
        int a = str.length();

        for (int i = 0; i < a; i++) {    // Работает пока меньше АА1458АВ
            char ai = str.charAt(i);     // Создаем переменную с символами, и заносим в нее каждый символ из строки по очереди

            if (Character.isDigit(ai)) { // Если символ цифра
                num += ai;               // Добавляем в num
            } else {
                text += ai;              // Остальное в текст
            }
        }
        System.out.println(num);
        System.out.println(text);

    }
}
