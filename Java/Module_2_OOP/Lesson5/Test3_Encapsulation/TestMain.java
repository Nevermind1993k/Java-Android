package Module_2_OOP.Lesson5.Test3_Encapsulation;

import Module_2_OOP.Lesson5.Test3_Encapsulation.beast.Animal;
import Module_2_OOP.Lesson5.Test3_Encapsulation.human.People;

/**
 * Created by Roman on 29.11.2015.
 */
public class TestMain {
    public static void main(String[] args) {

        Animal cow = new Animal();
        cow.setAge(2);
        cow.setName("Муська");
        cow.setType("Cow");

        People man = new People();
        man.setAge(3);
        man.setName("Jim");
        man.setType("Man");

        cow.say();
        man.say();
        System.out.println(man.getAge());
    }
}
