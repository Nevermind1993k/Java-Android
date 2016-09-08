package Module_3_Exception.Test6;

/**
 * Created by Roman on 07.12.2015.
 */
public class TestMainThrows {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
