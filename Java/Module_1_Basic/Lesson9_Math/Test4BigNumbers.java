package Module_1_Basic.Lesson9_Math;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Roman on 18.11.2015.
 */
public class Test4BigNumbers {

    public static void main(String[] args) {


        int num = 500;

        //*****Преобразование в большие числа*****
        BigInteger bi1 = BigInteger.valueOf(300);
        BigInteger bi2 = BigInteger.valueOf(num);
        // BigInteger больше чем Integer


        BigInteger bi3 = bi1.add(bi2); //800 300+500=800
        System.out.println(bi3);
        int num3 = bi3.intValue();
        System.out.println(num3);

        System.out.println(bi1.multiply(BigInteger.valueOf(3)));//900   300*3
        System.out.println(bi1.subtract(bi2)); //-200                   300-500
        System.out.println(bi3.divide(bi1)); //2                        800/300

        BigDecimal bd1 = BigDecimal.valueOf(22434.465797803); // как double только больше
        System.out.println(bd1);

        BigInteger bigInteger = BigInteger.valueOf(10);
        int b = bigInteger.signum(); // 1 если значение плюсовое, -1 если минусовое, 0 если значение = 0
        System.out.println(b);
        boolean b1 = bigInteger.testBit(1); //Проверка бита
        System.out.println(bigInteger.testBit(1));


    }
}
