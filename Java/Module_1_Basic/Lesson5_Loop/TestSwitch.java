package Module_1_Basic.Lesson5_Loop;

/**
 * Created by Roman on 09.11.2015.
 */
public class TestSwitch {

    public static void main(String[] args) {

        int x = 2;

        switch (x) { // работает до брейка
            case 2:
                System.out.println("first");
            case 1:
                System.out.println("second");
                break;
            case 3:
                System.out.println("third");
                break;
            default:
                System.out.println("otherwise");
                break;
        }
    }
}
