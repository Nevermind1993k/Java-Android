package Module_2_OOP.Lesson7_Nasledovanie.Zadanie;

/**
 * Created by Roman on 01.12.2015.
 */
public class Nokia extends Mobile {
    private String os;
    private int memory;


    public Nokia(String name, int battery, String os, int memory) {
        super(name, battery);
        this.os = os;
        this.memory = memory;
    }


    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
