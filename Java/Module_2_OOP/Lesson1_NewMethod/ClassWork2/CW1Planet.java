package Module_2_OOP.Lesson1_NewMethod.ClassWork2;

/**
 * Created by Roman on 23.11.2015.
 */
public class CW1Planet {
    public static void main(String[] args) {
        //Написать метод который считает на сколько длиннее или короче год на планете Земля
        //в сравнении с остальными планетами нашей солнечной системы.
        //Результат должен быть либо «минус» либо «плюс». (По количеству секунд с переводом в дни).

        //Перевести в наши секунды ихнее количество дней

        //Чтобы вычеслить задержку, нужно расстояние между планетами разделить на скорость света

        final double lightspeed = 300000.0; //300 000 км/сек

        double DistanceToMars = 225300000.0; //225 300 000 км
        double DistanceToMercury = 91600000.0;  //91,6 млн км
        double DistanceToVenera = 41400000.0; //41.4
        double DistanceToJupiter = 628400000.0; //628.4
        double DistanceToSaturn = 1277400000.0; //1277.4
        double DistanceToUran = 2721400000.0 ;//2721.4
        double DistanceToNeptune = 4347400000.0;//4347.4


        double DelayToMars = Mars(DistanceToMars, lightspeed);
        System.out.println("Задержка сигнала до Марса в сек: " + DelayToMars);

        double DelayToMercury = Mercury(DistanceToMercury, lightspeed);
        System.out.println("Задержка сигнала до Меркурия в сек: " + DelayToMercury);

        double DelayToVenera = Venera(DistanceToVenera, lightspeed);
        System.out.println("Задержка сигнала до Венеры в сек: " + DelayToVenera);

        double DelayToJupiter = Jupiter(DistanceToJupiter, lightspeed);
        System.out.println("Задержка сигнала до Юпитера в сек: " + DelayToJupiter);

        double DelayToSaturn = Saturn(DistanceToSaturn, lightspeed);
        System.out.println("Задержка сигнала до Сатурна в сек: " + DelayToSaturn);

        double DelayToUran = Uran(DistanceToUran, lightspeed);
        System.out.println("Задержка сигнала до Урана в сек: " + DelayToUran);

        double DelayToNeptune = Neptune (DistanceToNeptune, lightspeed);
        System.out.println("Задержка сигнала до Нептуна в сек: " + DelayToNeptune);

    }


    static double Mars (double d, double ls ) { //d-distance, ls-lightspeed
        return d / ls;
    }

    static double Mercury (double d, double ls) {
        return d / ls;
    }

    static double Venera (double d, double ls) {
        return d / ls;
    }

    static double Jupiter (double d, double ls) {
        return d / ls;
    }

    static double Saturn (double d, double ls) {
        return d / ls;
    }

    static double Uran (double d, double ls) {
        return d / ls;
    }

    static double Neptune (double d, double ls) {
        return d / ls;
    }

}
