package Module_1_Basic.Lesson2_Peremennie;

/**
 * Created by Roman on 29.10.2015.
 */

public class Peremennie {

    public static void main(String[] args) {
        /*
        int age, height, length;
        age = 22;
        height = 100;
        length = 99;
        System.out.println("Age=" + age);
        System.out.println("Height=" + height);
        System.out.println("Length=" + length);
        */

        /*
        byte b = 123;
        short s = 1280;
        int i = 232132; //в памяти выделяется 4 байта и записывается 232132
        long l = 3232424242L;
        */

        /*
      //float f = 3.14;//Ошибка
        float f = 3.14F;
        double d = 3.14;
        */

        /*
        char ch = 'П'; // Символ всегда должен быть один, если больше то это строка.
        */

        /*
        int x;
        int a = 1;
        double b = 7.5;
        long c = 1000000, d = 33333;
        char d1 = 'A';
        boolean e = true;
        short f = 500;
        short g = (short) (f + 300);  //short g = f + 300; //Ошибка
        x = 55;
        */


        //*************Переполнение целочисленный переменных******************
        /*
        byte b1 = (byte) (127 + 1); // Переполнение
        System.out.println(b1 - 1);
        */


        //*************Переполнение целочисленный переменных (Пример 2)******************
        /*
        int x = 2147483647;
        System.out.println("x=" + x);
        x++;
        System.out.println("x=" + x);
        */


        //*************Повторить Дома*****************
        //**************Префиксный/Постфиксный инкремент**********************
        /*
        int a = 5;
        System.out.println(a);  //5
        int x = a++;            //5+1=6
        System.out.println(a);  //6
        int y = ++a;            //6+1=7
        System.out.println(a);  //7
        System.out.println(x);  //5???(6)
        System.out.println(y);  //7
        */



        /*
        int i1=12; // переменной присвоить значение 12в десятичной системе счисления
        int i2=0x12;// переменной присвоить значение 12в шестнадцатеричной системе счисления
        int i3=012;// переменной присвоить значение 12в восьмеричной системе счисления
        int i4=0b1011;// переменной присвоить значение 1011 в двоичной системе счисления(работает, начиная с Java 7)
        */

        /*
        //*********Сравнивание примитивных типов************
        //=(Присвоение)
        //==(Сравнивание)
        int age = 5;
        int length = 5;
        System.out.println(age == length);
        */


        /*
        //*********Сравнивание ссылочных типов************
        String s1 = "java";
        String s2 = new String("java")
        String s3 = "java";
        System.out.println("7" == "7"); //true
        System.out.println(s1 == s2); //false
        System.out.println(s1 == "java"); //true
        System.out.println(s3 == "java"); //true
        System.out.println(s2 == s3); //false
        */


        //**********************Ввод с клавиатуры********************************
        /*
        Scanner scannerRoma = new Scanner(System.in); //Обьект Сканнер типа сканнерРома, с именем Сканнер

        System.out.println("Enter string");
        String s = scannerRoma.nextLine(); //Создаем обьект стринг с именем s, и реализуем ввод данных
        System.out.println("You printed: " + s);

        System.out.println("Enter integer: ");
        int i = scannerRoma.nextInt();
        System.out.println("You printed: " + i);
        */












    }
}
