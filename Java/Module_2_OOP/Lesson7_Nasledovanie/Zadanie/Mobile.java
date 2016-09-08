package Module_2_OOP.Lesson7_Nasledovanie.Zadanie;

import java.util.Random;

/**
 * Created by Roman on 01.12.2015.
 */
public class Mobile {
    private String name;
    private int battery;


    public Mobile(String name, int battery) {
        this.name = name;
        this.battery = battery;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void sms () {
        Random rn = new Random();
        System.out.println(name + ": Ваш рахунок поповнено на " + rn.nextInt(100) + " грн\n");
    }
}
