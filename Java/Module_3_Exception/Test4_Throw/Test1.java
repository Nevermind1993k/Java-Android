package Module_3_Exception.Test4_Throw;

/**
 * Created by Roman on 07.12.2015.
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                if (i == 5) throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("Перехват сгенерированного исключения");
        } finally {
            System.out.println("finally");
        }
        System.out.println("Конец программы");
    }
}
