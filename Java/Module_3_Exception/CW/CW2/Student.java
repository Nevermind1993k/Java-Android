package Module_3_Exception.CW.CW2;

/**
 * Created by Roman on 07.12.2015.
 */
public class Student {
    private String name;
    private int age;
    private int mark;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) throws StudyError {
        System.out.println("Получена оценка " + mark);
        this.mark = mark;
        if (mark < 3) {
            throw new StudyError();
        }
    }
}
