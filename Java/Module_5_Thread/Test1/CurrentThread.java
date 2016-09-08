package Module_5_Thread.Test1;

/**
 * Created by Roman on 15.12.2015.
 */
public class CurrentThread {
    public static void main(String[] args) {
        // Получение главного потока
        Thread ct = Thread.currentThread();
        System.out.println(ct.getName());
        System.out.println(ct.getState());
        System.out.println(ct.getPriority());
        System.out.println(ct.isAlive());

        try {
            ct.sleep(3000);     // милисекунды
            System.out.println(ct.getState());
        } catch (InterruptedException e) {
            System.out.println("Поток поломался!");
        }
    }
}
