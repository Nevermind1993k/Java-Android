package Module_2_OOP.Lesson2_Recursion;

/**
 * Created by Roman on 24.11.2015.
 */
public class Test3_Faktorial {
    public static void main(String[] args) {
        // 5! = 1*2*3*4*5=120

        int a = 3;
        int result = factorial(a);
        System.out.println(result);
    }
    //v1
    public static int factorial (int a) {
        if (a==1) return 1;
        if (a==2) return 2;
        return factorial(a-1)*a; // Сначало считает (а-1), а потом: *а
    }
    /*//v2
    public static int factorial2 (int a) {
        return a == 0 ? 1 : factorial2(a - 1) * a;
    }*/
}
