package Module_1_Basic.Lesson10_Printf;

/**
 * Created by Roman on 19.11.2015.
 */
public class Test2_Primeri {

    public static void main(String[] args) {

        //1й пример
        Integer a = 675;
        double root;
        root = Math.sqrt(a);
        System.out.println("Корень числа " +a + " равен " + root);        //старый вариант
        System.out.printf("Корень числа %d равен %f \n \n", a, root);   //новый вариант

        //2й пример
        int [][] multiplyTab = new int [10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplyTab [i][j] = (i+1)*(j+1);
                //вывод ряда чисел разделенных знаком табуляции
                //System.out.print(multiplyTab[i][j] + "\t"); //1й вариант (старый)
                System.out.printf("%5d", multiplyTab[i][j]);  //2й вариант (с форматированием)
            }
            System.out.println();
        }

    }
}
