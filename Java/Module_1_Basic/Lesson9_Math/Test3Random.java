package Module_1_Basic.Lesson9_Math;

/**
 * Created by Roman on 18.11.2015.
 */
public class Test3Random {

    public static void main(String[] args) {

        //Случайные числа от 0 до 1
        int a = (int) Math.random();
        System.out.println("С приведением типа: " + a);
        System.out.println("Без приведения типа: " + Math.random());

        //случайные числа от 0 до 3
        System.out.println((int) Math.random() * 3);

        //Случайные числа от 1 до 3
        System.out.println((int) (1 + Math.random() * 3));

        //Случайные числа от -3 до 3
        System.out.println((int) (Math.random() * 7) - 3);


    }
}
