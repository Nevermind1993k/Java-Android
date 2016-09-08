package Module_6_Files.Lesson2.CW2;

/**
 * Created by Roman on 18.12.2015.
 */
public class Humans {
    private String name;
    private int age;
    private int phone;
    private String mail;

    public Humans(String name, int age, int phone, String mail) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + phone + " " + mail;

    }
}
