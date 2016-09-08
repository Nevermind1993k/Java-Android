package Module_1_Basic.Lesson5_Loop;

/**
 * Created by Roman on 09.11.2015.
 */
public class TestTernarOperator {

    public static void main(String[] args) {

        int h,d;
        h=3;
        d=4;

        //1-й вариант
        int r=(h<d)?44:33;//Присваивает цифру 44 переменной r
        System.out.println(r);

        /*
        //2-й вариант
        if (h<d){
            r=44; //Присваиваем 44 переменной r
        } else {
            r=33;
        }
        System.out.println(r);
        */
    }
}
