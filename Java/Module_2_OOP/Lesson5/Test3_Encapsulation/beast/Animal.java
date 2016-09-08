package Module_2_OOP.Lesson5.Test3_Encapsulation.beast;

/**
 * Created by Roman on 29.11.2015.
 */
public class Animal {
    private int age;
    private String name;
    private String type;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 5) {
            this.age = age;
        } else {
            System.out.println("Слишком маленький возраст");
        }
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }

    public void say() {
        System.out.println("Муууу");
    }
}
