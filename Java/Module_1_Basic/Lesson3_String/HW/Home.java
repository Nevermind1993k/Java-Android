package Module_1_Basic.Lesson3_String.HW;

/**
 * Created by Roman on 02.11.2015.
 */
public class Home {

    public static void main(String[] args) {

        //**************ДЗ**************
        //Использовать метод: charAt, compareTo, indexOf, lastIndexOf, replace, toLowerCase, toUpperCase, trim, startWith

        String str = "I'm Alive!";
        String str2 = "I'm Alive!";
        String str3="Hello world!";
        String str4="             I'm          Alive!           ";


        //charAt-показывает символ, по индексу
        System.out.println("charAt:");
        System.out.println(str.charAt(7));


        //compareTo-сравнивает строки, 0-если строки одинаковые,
        System.out.println("compareTo:");
        int result = str.compareTo(str2);
        System.out.println(result);

        result=str.compareTo(str3);
        System.out.println(result);

        result=str3.compareTo(str);
        System.out.println(result);


        //indexOf-если в строке 2 одинаковых символа, покажет первый найденный символ
        System.out.println("indexOf:");
        System.out.println(str.indexOf('A'));


        //lastIndexOf-если в строке 2 одинаковых символа, покажет второй найденный символ
        System.out.println("lastIndexOf:");
        System.out.println(str.lastIndexOf('e'));


        //replace-меняет местами буквы в строке
        System.out.println("replace:");
        System.out.println(str.replace('m', 'e'));
        System.out.println(str.replace('e', 'm'));


        //toLowerCase-заменяет все буквы в строке на маленькие
        System.out.println("toLowerCase:");
        System.out.println(str.toLowerCase());


        //toUpperCase-заменяет все буквы в строке на маленькие
        System.out.println("toUpperCase:");
        System.out.println(str.toUpperCase());


        //trim-исключает все начальные и конечные пробелы
        System.out.println("trim:");
        System.out.println(str4.trim());


        //startWith-булевая ф-ия, показывает значение true если строка начинаеться, с правильного слова
        System.out.println("StartsWith:");
        System.out.println(str.startsWith("I'm")); // true
        System.out.println(str.startsWith("Alive")); // false




    }
}
