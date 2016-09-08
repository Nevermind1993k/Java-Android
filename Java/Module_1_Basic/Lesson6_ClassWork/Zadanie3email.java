package Module_1_Basic.Lesson6_ClassWork;

/**
 * Created by Roman on 12.11.2015.
 */
public class Zadanie3email {

    public static void main(String[] args) {

        //Вытянуть из текста e-mail.
        //* Сделать проверка на наличие «.» после «@» .

        String str = "osobsokm kmsomhgso vasa@gmail.com aagagad";
        int sobaka = str.indexOf('@');//22
        int tochka = str.indexOf('.');//26

        int probel = str.indexOf(' ');
        String email=str.substring(probel,sobaka);

        System.out.println(email);

        /*if (sobaka<tochka) {

        }*/





    }
}
