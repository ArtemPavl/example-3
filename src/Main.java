public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание!");
        // Задача 1
        System.out.println("Задача 1");
        int apple = 10000;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        byte pear = 126;
        System.out.println("Значение переменной pear с типом byte равно " + pear);
        short cherry = 130;
        System.out.println("Значение переменной cherry с типом short равно " + cherry);
        long watermelon = 9965534L;
        System.out.println("Значение переменной watermelon с типом long равно " + watermelon);
        float fraction = 3.14f;
        System.out.println("Значение переменной fraction с типом float равно " + fraction);
        double constant = 3.1415926535;
        System.out.println("Значение переменной constant с типом double равно " + constant);

        // Задача 2
        System.out.println("Задача 2");
        int salary = 27897;
        System.out.println("Значение переменной salary с типом int равно " + salary);
        int length = 569;
        System.out.println("Значение переменной length с типом int равно " + length);
        byte bananes = 67;
        System.out.println("Значение переменной bananes с типом byte равно " + bananes);
        short corner = -159;
        System.out.println("Значение переменной corner с типом short равно " + corner);
        long budget = 987678965549L;
        System.out.println("Значение переменной budget с типом long равно " + budget);
        float temperature = 27.12f;
        System.out.println("Значение переменной temperature с типом float равно "
                + temperature);
        double digger = 2.786;
        System.out.println("Значение переменной digger с типом double равно " + digger);
        boolean comparison = false;
        System.out.println("Значение переменной comparison с типом boolean равно "
                + comparison);

        // Задача 3
        System.out.println("Задача 3");
        int classLyudmilaPavlovna = 23;
        int classAnnaSergeevna = 27;
        int classEkaterinaAndreevna = 30;
        int studentsInClasses = classEkaterinaAndreevna + classAnnaSergeevna
                + classLyudmilaPavlovna;
        int paper = 480;
        System.out.println("На каждого ученика расчитано " + paper/studentsInClasses
                + " листов бумаги" );

        // Задача 4
        System.out.println("Задача 4");
        int bottles = 16;
        int time = 2;
        int performance = bottles / time;
        time = 20;
        bottles = performance * time;
        System.out.println("За 20 минут машина произвела бутылок "
                + bottles + " штук");
        time = 24 * 60;
        bottles = performance * time;
        System.out.println("За сутки машина произвела бутылок "
                + bottles + " штук");
        time = 3 * 24 * 60;
        bottles = performance * time;
        System.out.println("За 3 дня машина произвела бутылок "
                + bottles + " штук");
        time = 30 * 24* 60;
        bottles = performance * time;
        System.out.println("За месяц машина произвела бутылок "
                + bottles + " штук");

        // Задача 5
        System.out.println("Задача 5");
        int dye = 120;
        int witeOnClassroom = 2;
        int brownOnClassroom = 4;
        int classroom =  dye / (witeOnClassroom + brownOnClassroom);
        int dyeWhite = witeOnClassroom * classroom;
        int dyeBrown = brownOnClassroom * classroom;
        System.out.println("В школе, где " + classroom + " классов, нужно " + dyeWhite
                + " банок белой краски и " + dyeBrown + " банок коричневой краски.");

        // Задача 6
        System.out.println("Задача 6");
        bananes = 5;
        int weightBanana = 80;
        int milk = 200;
        double weightMilk = 105.0 / 100.0;
        int cream = 2;
        int weightCrem = 100;
        int eggs = 4;
        int weightEgg = 70;
        double weightBreakfast = (bananes * weightBanana + milk * weightMilk
                + cream * weightCrem + eggs * weightEgg)/1000;
        System.out.println("Вес спорт-завтрака равен " + weightBreakfast + " кг");

        // Задача 7
        System.out.println("Задача 7");
        int deltaWeight = 7;
        int deltaWeightInDay = 250;
        int days1 = deltaWeight * 1000 / deltaWeightInDay;
        System.out.println(days1 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по "
                + deltaWeightInDay + " грамм.");
        deltaWeightInDay = 500;
        int days2 = deltaWeight * 1000 / deltaWeightInDay;
        System.out.println(days2 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по "
                + deltaWeightInDay + " грамм.");
        int daysAverage = (days1 + days2)/2;
        System.out.println(daysAverage + " день в среднем уйдёт на похудение.");

        // Здача 8
        System.out.println("Задача 8");
        salary = 67760;
        int incomeInYearNow = salary * 12;
        int promotion = 10;
        salary = salary + salary/promotion;
        int incomeInYearPromotion = salary * 12;
        int deltaIncomeInYear = incomeInYearPromotion - incomeInYearNow;
        System.out.println("Маша теперь получает " + salary + " рублей. Годовой доход вырос на "
                + deltaIncomeInYear + " рублей.");

        salary = 83690;
        incomeInYearNow = salary * 12;
        salary = salary + salary/promotion;
        incomeInYearPromotion = salary * 12;
        deltaIncomeInYear = incomeInYearPromotion - incomeInYearNow;
        System.out.println("Денис теперь получает " + salary + " рублей. Годовой доход вырос на "
                + deltaIncomeInYear + " рублей.");

        salary = 76230;
        incomeInYearNow = salary * 12;
        salary = salary + salary/promotion;
        incomeInYearPromotion = salary * 12;
        deltaIncomeInYear = incomeInYearPromotion - incomeInYearNow;
        System.out.println("Кристина теперь получает " + salary + " рублей. Годовой доход вырос на "
                + deltaIncomeInYear + " рублей.");
    }
}