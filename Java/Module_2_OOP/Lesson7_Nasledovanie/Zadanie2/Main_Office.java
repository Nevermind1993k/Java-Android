package Module_2_OOP.Lesson7_Nasledovanie.Zadanie2;

/**
 * Created by Roman on 01.12.2015.
 */
//Создать сотрудников: грузчик, кладовщик, водитель, менеджер, программист, руководитель отдела, директор.
// У каждого должны быть обязательные поля: имя, возраст, общий стаж работы, стаж работы в компании, должность.
// Разработать систему начисления заработной платы в зависимости от полей:
// возраст, общий стаж работы, стаж работы в компании, должность. Распечатать результат.

public class Main_Office {
    public static void main(String[] args) {

        Gruzchik gruzchik = new Gruzchik("Степаныч", 0, 10, 5, "Грузчик");
        Kladovshik kladovshik = new Kladovshik("Валера" , 25 , 5 , 2, "Кладовщик");
        Voditel voditel = new Voditel("Радион", 35, 7, 2, "Водитель" );
        Manager manager = new Manager("Свелана", 32, 3, 1, "Менеджер");
        Programist programist = new Programist("Колян", 28, 9, 3, "Программист");
        Rukovod_Otdela rukovod_otdela = new Rukovod_Otdela("Иванович", 45, 25, 12, "Руководитель отдела");
        Director director = new Director("Иван Валерьевич", 45, 35, 30, "Директор");


    }
}
