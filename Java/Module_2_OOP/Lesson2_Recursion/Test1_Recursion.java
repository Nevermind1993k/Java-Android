package Module_2_OOP.Lesson2_Recursion;

/**
 * Created by Roman on 24.11.2015.
 */
public class Test1_Recursion {
    //Рекурсия–это возможность внутри вашего метода вызвать ваш метод (метод вызывает сам себя).
    public static void main(String[] args) {
        int a = recursionMethod(2, 4);//Передали 2 и 4 в recursionMethod
        System.out.println("a = " + a); //2
    }

    public static  int recursionMethod(int a, int b) {
        int c = a + b; // 6; 2
        if (c == 6) {
            c = recursionMethod(1, 1); // Если 6, то recursionMethod(1,1)
        }
        return c;
    }
}
