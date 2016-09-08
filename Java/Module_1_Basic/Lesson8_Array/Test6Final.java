package Module_1_Basic.Lesson8_Array;

/**
 * Created by Roman on 17.11.2015.
 */
public class Test6Final {

    public static void main(String[] args) {

        final int A = 5; // final = Константа, её нельзя изменить, Обычно final пишут в большом регистре
        int b = 2;

        b += A;
        // A+=b; // Ошибка
        // A++; // Ошибка
    }
}
