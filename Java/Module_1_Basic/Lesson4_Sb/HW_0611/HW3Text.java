package Module_1_Basic.Lesson4_Sb.HW_0611;

/**
 * Created by Roman on 08.11.2015.
 */
public class HW3Text {

    public static void main(String[] args) {

        //привести текст к виду «Кто то написал, а Мне исправлять !».

        String str = "кТо то НаПиСал, а мНе иСправляТь !";

        str = str.toLowerCase();
        str = str.replace('м', 'М');

        String first = str.substring(0, 1);
        first = first.toUpperCase();

        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(0);
        sb.insert(0, first);

        System.out.println(sb);


    }
}
