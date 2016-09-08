package Module_2_OOP.Lesson6.Zadanie2.Worker;

/**
 * Created by Roman on 30.11.2015.
 */
public class Sotrudnik {
    private String name;
    private String vacation; // Doljnost'
    private int age;
    private double workExp; // Work Exp
    private double workExpComp; // Work Exp in Company
    private double zp = 5000; // ZarPlata

    public Sotrudnik(String name, String vacation, int age, double workExp, double workExpComp) {
        this.name = name;
        this.vacation = vacation;
        this.age = age;
        this.workExp = workExp;
        this.workExpComp = workExpComp;
    }

    public double ZarPlata() {
        if (workExp >= 10 && workExpComp >= 5) {
            if (vacation.equals("Грузчик")) {
                System.out.println("ЗП Грузчика: " + zp);
            } else if (vacation.equals("Кладовщик")) {
                System.out.println("ЗП Кладовщика: " + zp + 1000);
            } else if (vacation.equals("Водитель")) {
                System.out.println("ЗП Водителя: " +zp + 2000);
            } else if (vacation.equals("Менеджер")) {
                System.out.println("ЗП Менеджера: " +zp + 3000);
            } else if (vacation.equals("Программист")) {
                System.out.println("ЗП Программиста: " +zp + 10000);
            } else if (vacation.equals("Руководитель отдела")) {
                System.out.println("ЗП Руководителя отдела: "  +zp + 7000);
            } else if (vacation.equals("Директор")) {
                System.out.println("ЗП Директора: "  +zp + 11000);
            }
        }
        return zp;
    }
}
