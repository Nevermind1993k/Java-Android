package Module_5_Thread.Test2;

/**
 * Created by Roman on 15.12.2015.
 */
public class MainThread {
    public static void main(String[] args) {
        // Создание потоков:

        // 1)
        // Создание обьектов
        Thread thread1 = new MyThread("thread1", 1000);
        Thread thread2 = new MyThread("thread2", 750);
        Thread thread3 = new MyThread("thread3", 500);

        // Запуск потоков
        thread1.start();
        thread2.start();
        thread3.start();

        // 2)
        new MyThread2("MyThread 2.1", 1000);
        new MyThread2("MyThread 2.2", 1000);

        // 3) Массив потоков
        Thread[] ta = new Thread[5];
        for (int i = 0; i < ta.length; i++) {
            ta[i]= new MyThread("re" + i, 500);
            ta[i].start();
        }

    }
}
