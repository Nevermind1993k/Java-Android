package Module_3_Exception.Test6;

/**
 * Created by Roman on 07.12.2015.
 */
public class TestMainThrows2 {
    public static void main(String[] args) throws MyException {
        int a = 2;
        a = 2 + 2;
        if (a == 4) {
            throw new MyException();
        }
    }
}
