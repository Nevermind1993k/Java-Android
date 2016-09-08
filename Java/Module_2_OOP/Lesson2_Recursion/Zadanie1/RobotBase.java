package Module_2_OOP.Lesson2_Recursion.Zadanie1;

/**
 * Created by Roman on 24.11.2015.
 */
public class RobotBase {
    public static void main(String[] args) {

        Robot R2D2 = new Robot(); // Новый робот с именем Р2Д2
        R2D2.name = "R2D2";
        R2D2.material = "Metal/plastic";
        R2D2.work = "Space engineering";
        R2D2.weight = 100;
        R2D2.movement= "Rolling";
        R2D2.printallifo(); // Печатет всю инфу про робота
        R2D2.spaceengineering(); // Чтото делает

        System.out.println();

        Robot C3P0 = new Robot();
        C3P0.name = "C3PO";
        C3P0.material = "Gold";
        C3P0.movement = "Walking";
        C3P0.work = "Translate";
        C3P0.weight = 200;
        C3P0.printallifo();


    }
}
