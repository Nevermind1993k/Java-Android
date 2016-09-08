package Module_3_Exception.CW.CW2;

/**
 * Created by Roman on 07.12.2015.
 */
public class Main_Student {
    public static void main(String[] args) {
        Student student1 = new Student("Вася", 19);
        Teacher teacher1 = new Teacher("Татьяна Николаевна");
        try {
            teacher1.testStudent(student1);
        } catch (StudyError studyError) {
            studyError.printStackTrace();
        }
    }
}
