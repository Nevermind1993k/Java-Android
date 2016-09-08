package Module_3_Exception.Test1;

/**
 * Created by Roman on 07.12.2015.
 */
public class Error1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        try {
            System.out.println(a);
            System.out.println(a / b);    // Намеренный вызов
            System.out.println(b);        // ошибки
        } catch (ArithmeticException e) { // Перехват исключения
            System.out.println("Деление на ноль");
        } finally {   // Участок кода который выполняется в любом случае
            System.out.println("Но программа все равно работает");
        }
        System.out.println("Конец программы");
    }
}
