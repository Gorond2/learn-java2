package org.example;

import org.example.transport.Plane;
import org.example.transport.Ship;
import org.example.database.Document;

public class App
{
    public static String timeOfYearFinder(int numMon){
        // case
        //int numMon = 2;
        String timeOfYear;

        switch(numMon){
            case 12:
            case 1:
            case 2:
                timeOfYear = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                timeOfYear = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                timeOfYear = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                timeOfYear = "Осень";
                break;
            default:
                timeOfYear = "нет такого месяца";
        }
        //System.out.println(timeOfYear);
        return timeOfYear;
    }

    public static void findSimpleNumber(int number){

        // Simple numbers
        //int number = 5;
        double del = number;
        boolean simple = true;

        for(int i = number - 1; i>1; i--){
            if ((number % i) == 0){
               simple = false;
               del = i;
            }
        }
        if (simple) {
            System.out.println(number + " простое");
        }
        else {
            System.out.println(number + " не простое");
            System.out.println("Наименьший делитель :" + del);
        }

    }


    public static String findSimpleNumber2(int number){

        // Simple in while
        //int number = 5679;
        String ansver;
        int delitel = 1;
        boolean simple = true;

        while(simple && delitel < (number / 2)){
            delitel++;
            if (number % delitel == 0){
                simple = false;
            }
        }
        //System.out.print("Число " + number);
        //System.out.print(simple ? " простое": " не простое, делится на "+ delitel);
        ansver = "Число " + number + (simple ? " простое": " не простое, делится на "+ delitel);

        return ansver;
    }

    public static int fibonachi(int i){
        if (i == 1 || i == 2) {
            return 1;
        }
        else{
            return fibonachi(i-1) + fibonachi(i-2);
        }
    }

    public static void main( String[] args )
    {
        // Создаём таблицы
        String[] suchkaCreate = {"create table jopa (name varchar2(20), color varchar2(30));",
                                 "create table colors(name varchar2, cod varchar2(30));"};
        Document doc1 = new Document();
        doc1.createDocument(suchkaCreate);

        // Селектим
        String[] suchkaSelect = {"select name from jopa;",
                                 "select cod from colors;"};
        Document doc2 = new Document();
        doc2.selectDocument(suchkaSelect);

        // Апдейтим таблицы
        String[] suchkaUpdate = {"update jopa set color='white';commit;",
                                 "update color set cod='#ffffff';commit;"};
        Document doc3 = new Document();
        doc3.updateDocument(suchkaUpdate);

        //System.out.println(fibonachi(25));
//        Transport samolet = new Transport("Самолет", 2000, 800, 100);
//        Transport ship = new Transport("Корабль", 800000, 60, 2);
//        Transport track = new Transport("Грузовик", 1000, 90, 10);
//
//        System.out.println("------- Из конструктора -------");
//        samolet.getSchet(2000, 18000);
//        ship.getSchet(2000, 18000);
//        track.getSchet(2000, 18000);

//        System.out.println("------- Меняю стоимость километра у всех -------");
//        samolet.setCostPerKilometr(120);
//        ship.setCostPerKilometr(2);
//        track.setCostPerKilometr(11);
//
//        // Запускаю расчёт заново
//        samolet.getSchet(2000, 18000);
//        ship.getSchet(2000, 18000);
//        track.getSchet(2000, 18000);
        /*
        Ship fuckenShip = new Ship("Лайнер", 8000000, 40,2, 10000000);
        fuckenShip.getSchet(2000, 18000);

        Plane realPlane = new Plane("Боинг", 2000, 900, 10, 30);
        realPlane.getSchet(5000, 100);
        */
        /*
        Cat cat1 = new Cat("Масик","Сиам");
        cat1.sayMeow(4);

        Cat cat2 = new Cat("Мурзик", "Дворовый", 4, true);
        cat2.sayMeow(2);
         */
//        System.out.println(timeOfYearFinder(5));
//        findSimpleNumber(6);
//        String outputString;
//
//        outputString = findSimpleNumber2(3687) + " Жопа";
//        System.out.println(outputString);
//
//        JagAss myJagAss = new JagAss();
//
//        System.out.println(myJagAss.name);
//        myJagAss.name = "Новое имя жопного класса";
//        System.out.println(myJagAss.name);
//        String str;
//        str = myJagAss.minMaxAvg();
//        System.out.println(str);
        /*
          System.out.println(JagAss.returnStr("Миша"));
          JagAss myJagAss = new JagAss();

          System.out.println(myJagAss.returnStr("Вася"));
        */
//        mas1[0] = 1;
//        mas1[1] = 1;
//        for(int i = 2; i <= 24; i++)
//        {
//            mas1[i] = mas1[i-1] + mas1[i-2];
//        }
//        System.out.println(mas1[24]);

    }
}
