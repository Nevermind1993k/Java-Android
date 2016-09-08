package Module_3_Exception.Test6;

import java.io.PrintStream;

/**
 * Created by Roman on 07.12.2015.
 */
public class MyException extends Exception {
    @Override
    public void printStackTrace(PrintStream s) {
        System.err.println("Это моя ошибка !");
    }

    @Override
    public String getMessage() {
        return "Отработал getMessage";
    }
}
