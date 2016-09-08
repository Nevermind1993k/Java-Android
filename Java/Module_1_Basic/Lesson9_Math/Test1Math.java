package Module_1_Basic.Lesson9_Math;

/**
 * Created by Roman on 18.11.2015.
 */
public class Test1Math {

    public static void main(String[] args) {

        //Модуль числа
        System.out.println(Math.abs(-34.5)); //34.5

        //Округляет числа
        System.out.println(Math.round(34.5)); //35
        System.out.println(Math.round(34.499)); //34

        //Округление к ближайшему целому числу справа
        System.out.println(Math.ceil(34.4)); //35.0
        System.out.println(Math.ceil(34.39)); //35.0

        //Округление к ближайшему целому числу слева
        System.out.println(Math.floor(55.99)); //55.0

        //Большее и меньшее из 2-х чисел
        System.out.println(Math.max(10, 3)); //10
        System.out.println(Math.min(10, 3)); //3

        //Возвращает -1 если число меньше 0, 1 если больше 0 и 0 если 0
        System.out.println(Math.signum(-107.77)); //-1.0

        //Корень квадртаный
        System.out.println("Корень квадратный " + Math.sqrt(9)); // 3

        //Корень кубический
        System.out.println("Корень кубический " + Math.cbrt(27)); // 3

        //2 в степени 3
        System.out.println(Math.pow(2, 3)); //8

        //гипотенуза или квадратный корень из сусы
        // аргументов sqrt (x^2 + y^2) (Пифагор)
        int a=3, b=4;
        System.out.println(Math.hypot(a,b)); //5

        //2й вариант записи
        int c = (int) Math.pow(a,2);
        int d = (int) Math.pow(b,2);
        System.out.println(Math.sqrt(c+d)); //5

        //3й вариант
        System.out.println(Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));//5

    }
}
