package Module_1_Basic.Lesson5_Loop;

/**
 * Created by Roman on 09.11.2015.
 */
public class TestOr {

    public static void main(String[] args) {

        int s =1;
        if (s==1 || s/0 ==1){ //Проверяет первое условие, дальше не идёт
            System.out.println("1");
        }
        if (s==1 | s/0 ==1){ //Проверяет и первое условие и второе
            System.out.println("1");
        }
    }
}
