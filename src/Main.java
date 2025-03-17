public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");
        int apple = 1000;
        byte orange = 100;
        short pear = 30000;
        long potato = 1000L;
        float cucumbers = 3.6f;
        double plum = 1.3;
        System.out.println();
        System.out.println("Задание 2");
        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short n = 27897;
        byte k = 67;
        System.out.println();
        System.out.println("Задание 3");
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int totalSheetsOfPaper = 480;
        short totalStudents = (short) (lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        byte sheetsForEachStudent = (byte) (totalSheetsOfPaper / totalStudents);
        System.out.println("На каждого ученика рассчитано " + sheetsForEachStudent + " листов бумаги");

        System.out.println();
        System.out.println("Задание 4");
        byte machinePerformanceIn2Minutes = 16;
        byte machinePerformanceIn1Minutes = (byte) 16 / 2;
        byte twentyMinutes = 20;
        short machinePerformanceIn20Minutes = (short) (machinePerformanceIn1Minutes * twentyMinutes);
        System.out.println("За " + twentyMinutes + " машина произвела " + machinePerformanceIn20Minutes + " штук");

        byte hoursInADday = 24;
        byte howManyMinutesInOneHour = 60;
        short perDayMinutes = (short) (hoursInADday * howManyMinutesInOneHour);
        short machinePerformanceInPerDay = (short) (machinePerformanceIn1Minutes * perDayMinutes);
        System.out.println("В сутки" + " машина произвела " + machinePerformanceInPerDay + " штук");

        byte numberOfDays = 3;
        short inThreeDaysMinutes = (short) (numberOfDays * perDayMinutes);
        int machinePerformanceinThreeDays = machinePerformanceIn1Minutes * inThreeDaysMinutes;
        System.out.println("За 3 дня" + " машина произвела " + machinePerformanceinThreeDays + " штук");

        byte totalDaysInOneMonth = 30;
        int inOneMonthOnlyMinutes = totalDaysInOneMonth * perDayMinutes;
        int inOneMonth = inOneMonthOnlyMinutes * machinePerformanceIn1Minutes;
        System.out.println("За 1 месяц" + " машина произвела " + inOneMonth + " штук");

        System.out.println();
        System.out.println("Задание 5");
        byte totalColors = 120;
        byte oneClassWhite = 2;
        byte oneClassBrown = 4;
        byte totalPaintsForOneClass = (byte) (oneClassBrown + oneClassWhite);
        byte totalClass = (byte) (totalColors / totalPaintsForOneClass);
        byte classWhite = (byte) (oneClassWhite * totalClass);
        byte classBrown = (byte) (oneClassBrown * totalClass);
        System.out.println("В школе, где " + totalClass + " классов, нужно " + classWhite + " банок белой краски и "
                + classBrown + " банок коричневой краски");
        System.out.println();
        System.out.println("Задание 6");
        byte bananas = 5;
        byte weightOfOneBanana = 80;
        short totalWeightBanana = (short) (bananas * weightOfOneBanana);

        short totalMilkInLiters = 200;
        byte oneHundredGramsOfMilk = 100;
        byte amountOfOneHundredGramsOfMilk = (byte) (totalMilkInLiters / oneHundredGramsOfMilk);
        byte oneHundredLitersInGams = 105;
        short numberOfGramsOfMilk = (short) (amountOfOneHundredGramsOfMilk * oneHundredLitersInGams);

        byte allIceCream = 2;
        byte weightOfOneIceCream = 100;
        short totalWeightCream = (short) (weightOfOneIceCream * allIceCream);

        byte totalEggs = 4;
        byte weightOfOneEgg = 70;
        short weightOfEggs = (short) (totalEggs + weightOfOneEgg);

        short mixtureGrams = (short) (totalWeightBanana + numberOfGramsOfMilk + totalWeightCream + weightOfEggs);
        float kilogramСonversion = 0.001f;
        float mixtureKilogram = (float) (mixtureGrams * kilogramСonversion);
        System.out.println(mixtureGrams + " грамм");
        System.out.println(mixtureKilogram + " килограмм");

        System.out.println();
        System.out.println("Задание 7");
        byte needToReset = 7;
        short conversionToGramWeight = 1000;
        short needToResetGram = (short) (needToReset * conversionToGramWeight);
        short athleteLittleLose = 250;
        short athleteLoseLot = 500;
        short losesFewDays = (short) (needToResetGram / athleteLittleLose);
        short losesManyDays = (short) (needToResetGram / athleteLoseLot);
        System.out.println("Eсли спортсмен будет терять каждый день по 250 грамм " + losesFewDays
                + " дней уйдет на похудение.");
        System.out.println("Eсли спортсмен будет терять каждый день по 500 грамм " + losesManyDays
                + " дней уйдет на похудение.");
        byte averageDays = (byte) ((losesFewDays + losesManyDays) / 2);
        System.out.println("В среднем может потребоваться " + averageDays
                + " дней, чтобы добиться результата похудения!");

        System.out.println();
        System.out.println("Задание 8");
        int mashaGets = 67760;
        int denisGets = 83690;
        int christinaGets = 76230;

        float tenPercent = 1.1f;
        float mashaIncreased = (mashaGets * (float) tenPercent);
        float denisIncreased = (denisGets * (float) tenPercent);
        float christinaIncreased = (christinaGets * (float) tenPercent);


        byte billingPeriod = 12;
        int mashaAnnualCurrent = (mashaGets * billingPeriod);
        int denisAnnualCurrent = (denisGets * billingPeriod);
        int christinaAnnualCurrent = (christinaGets * billingPeriod);


        float mashaAnnualIncreased = (float) (mashaIncreased * billingPeriod);
        float denisAnnualIncreased = (float) (denisIncreased * billingPeriod);
        float christinaAnnualIncreased = (float) (christinaIncreased * billingPeriod);


        float mashaIncomeDifference = (float) mashaAnnualIncreased - mashaAnnualCurrent;
        System.out.println("Маша теперь получает " + mashaIncreased + " рублей. Годовой доход вырос на "
                + mashaIncomeDifference + " рублей.");

        float denisIncomeDifference = (float) (denisAnnualIncreased - denisAnnualCurrent);
        System.out.println("Денис теперь получает " + denisIncreased + " рублей. Годовой доход вырос на "
                + denisIncomeDifference + " рублей.");

        float christinaIncomeDifference = (float) (christinaAnnualIncreased - christinaAnnualCurrent);
        System.out.println("Кристин теперь получает " + christinaIncreased + " рублей. Годовой доход вырос на "
                + christinaIncomeDifference + " рублей.");


    }
}