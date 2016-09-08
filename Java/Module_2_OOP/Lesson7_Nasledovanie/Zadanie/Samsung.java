package Module_2_OOP.Lesson7_Nasledovanie.Zadanie;

/**
 * Created by Roman on 01.12.2015.
 */
public class Samsung extends Nokia {
    private double camera;
    private double screen;


    public Samsung(String name, int battery, String os, int memory, double camera, double screen) {
        super(name, battery, os, memory);
        this.camera = camera;
        this.screen = screen;
    }


    public double getCamera() {
        return camera;
    }

    public void setCamera(double camera) {
        this.camera = camera;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }
}
