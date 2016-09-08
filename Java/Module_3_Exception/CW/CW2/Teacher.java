package Module_3_Exception.CW.CW2;

import java.util.Random;

/**
 * Created by Roman on 07.12.2015.
 */
public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void testStudent(Student student) throws StudyError {
        Random rn = new Random();
        student.setMark(rn.nextInt(4) + 1);
    }
}
