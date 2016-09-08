package Module_1_Basic.Lesson7_ClassWork;

/**
 * Created by Roman on 13.11.2015.
 */
public class Zadanie4Pifagor {

    public static void main(String[] args) {

        //Вывести таблицу Пифагора 10х10.

        int sum = 0; // Результат
        int a = 10;
        int b = 10;

        for (int i = 1; i < a; i++) {
            for (int j = 1; j < b; j++) {
                sum = i * j;
                System.out.print(sum + "\t");
            }
            System.out.println();
        }
    }
}
