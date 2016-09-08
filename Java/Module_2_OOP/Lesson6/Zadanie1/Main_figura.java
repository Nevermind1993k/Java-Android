package Module_2_OOP.Lesson6.Zadanie1;

import Module_2_OOP.Lesson6.Zadanie1.vershini_3.PriamTriangle;
import Module_2_OOP.Lesson6.Zadanie1.vershini_3.RavnTriangle;
import Module_2_OOP.Lesson6.Zadanie1.vershini_4.*;

/**
 * Created by Roman on 30.11.2015.
 */
//Создать новый проект, в нем 2 пакета,
// в одном пакете должны быть классы 3-х вершинных фигур,
// во 2-м –4-х вершинных фигур. Класс mainв корне.
// Каждая фигура -отдельный класс. Для всех фигур посчитать площадь и периметр.
// Фигуры: равносторонний тр-ник, прямоугольный тр-ник, квадрат, прямоугольник, параллелограмм, трапеция, ромб.
// Работа с параметрами объектов через гетер и сетер. Распечатать результат.

public class Main_figura {
    public static void main(String[] args) {

        RavnTriangle rt = new RavnTriangle(3, 4);
        rt.setP(rt.perimetr());
        rt.setS(rt.square());
        System.out.println("Равносторонний треугольник: \n " + "P :" + rt.getP() + " ; \t" + " S :" + rt.getS() + "\n");

        PriamTriangle pt = new PriamTriangle(4, 5, 2);
        pt.setP(pt.perimetr());
        pt.setS(pt.square());
        System.out.println("Прямоугольный треугольник: \n" + "P :" + pt.getP() + " ; \t" + " S :" + pt.getS() + "\n");

        Square sq = new Square(4);
        sq.setP(sq.perimetr());
        sq.setS(sq.square());
        System.out.println("Квадрат: \n" + "P :" + sq.getP() + " ; \t" + " S :" + sq.getS() + "\n");

        Rectangle rc = new Rectangle(4, 5);
        rc.setP(rc.perimetr());
        rc.setS(rc.square());
        System.out.println("Прямоугольник: \n" + "P :" + rc.getP() + " ; \t" + " S :" + rc.getS() + "\n");

        Parallelogram pr = new Parallelogram(3, 4, 5);
        pr.setP(pr.perimetr());
        pr.setS(pr.square());
        System.out.println("Паралелограм: \n" + "P :" + pr.getP() + " ; \t" + " S :" + pr.getS() + "\n");

        Trapeze tr = new Trapeze(3, 4, 3, 4, 5);
        tr.setP(tr.perimetr());
        tr.setS(tr.square());
        System.out.println("Трапеция: \n" + "P :" + tr.getP() + " ; \t" + " S :" + tr.getS() + "\n");

        Rhombus rn = new Rhombus(6);
        rn.setP(rn.perimetr());
        rn.setS(rn.square());
        System.out.println("Ромб: \n" + "P :" + rn.getP() + " ; \t" + " S :" + rn.getS() + "\n");
    }
}
