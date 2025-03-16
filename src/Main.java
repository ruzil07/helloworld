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
        byte LyudmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkaterinaAndreevna = 30;
        short totalSheetsOfPaper = 480;
        short totalStudents = (short) (LyudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna);
        byte sheetsForEachStudent = (byte) (totalSheetsOfPaper / totalStudents);
        System.out.println("На каждого ученика рассчитано " + sheetsForEachStudent + " листов бумаги");

        System.out.println();
        System.out.println("Задание 4");
        byte MachinePerformanceIn2Minutes = 16;
        byte MachinePerformanceIn1Minutes = (byte) 16 / 2;
        byte TwentyMinutes = 20;
        short MachinePerformanceIn20Minutes = (short) (MachinePerformanceIn1Minutes * TwentyMinutes);
        System.out.println("За " + TwentyMinutes + " машина произвела " + MachinePerformanceIn20Minutes + " штук");

        byte hoursInADday = 24;
        byte howManyMinutesInOneHour = 60;
        short perDayMinutes = (short) (hoursInADday * howManyMinutesInOneHour);
        short MachinePerformanceInPerDay = (short) (MachinePerformanceIn1Minutes * perDayMinutes);
        System.out.println("В сутки" + " машина произвела " + MachinePerformanceInPerDay + " штук");

        byte NumberOfDays = 3;
        short inThreeDaysMinutes = (short) (NumberOfDays * perDayMinutes);
        int MachinePerformanceinThreeDays = MachinePerformanceIn1Minutes * inThreeDaysMinutes;
        System.out.println("За 3 дня" + " машина произвела " + MachinePerformanceinThreeDays + " штук");

        byte totalDaysInOneMonth = 30;
        int inOneMonthOnlyMinutes = totalDaysInOneMonth * perDayMinutes;
        int inOneMonth = inOneMonthOnlyMinutes * MachinePerformanceIn1Minutes;
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

        short TotalMilkInLiters = 200;
        byte oneHundredGramsOfMilk = 100;
        byte amountOfOneHundredGramsOfMilk = (byte) (TotalMilkInLiters / oneHundredGramsOfMilk);
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
        short LosesFewDays = (short) (needToResetGram / athleteLittleLose);
        short LosesManyDays = (short) (needToResetGram / athleteLoseLot);
        System.out.println("Eсли спортсмен будет терять каждый день по 250 грамм " + LosesFewDays
                + " дней уйдет на похудение.");
        System.out.println("Eсли спортсмен будет терять каждый день по 500 грамм " + LosesManyDays
                + " дней уйдет на похудение.");
        byte averageDays = (byte) ((LosesFewDays + LosesManyDays) / 2);
        System.out.println("В среднем может потребоваться " + averageDays
                + " дней, чтобы добиться результата похудения!");

        System.out.println();
        System.out.println("Задание 8");
        int MashaGets = 67760;
        int DenisGets = 83690;
        int ChristinaGets = 76230;

        float tenPercent = 1.1f;
        float MashaIncreased = (MashaGets * (float) tenPercent);
        float DenisIncreased = (DenisGets * (float) tenPercent);
        float ChristinaIncreased = (ChristinaGets * (float) tenPercent);


        byte billingPeriod = 12;
        int MashaAnnualCurrent = (MashaGets * billingPeriod);
        int DenisAnnualCurrent = (DenisGets * billingPeriod);
        int ChristinaAnnualCurrent = (ChristinaGets * billingPeriod);


        float MashaAnnualIncreased = (float) (MashaIncreased * billingPeriod);
        float DenisAnnualIncreased = (float) (DenisIncreased * billingPeriod);
        float ChristinaAnnualIncreased = (float) (ChristinaIncreased * billingPeriod);


        float MashaIncomeDifference = (float) MashaAnnualIncreased % MashaAnnualCurrent;
        System.out.println("Маша теперь получает " + MashaIncreased + " рублей. Годовой доход вырос на "
                + MashaIncomeDifference + " рублей.");

        float DenisIncomeDifference = (float) (DenisAnnualIncreased % DenisAnnualCurrent);
        System.out.println("Денис теперь получает " + DenisIncreased + " рублей. Годовой доход вырос на "
                + DenisIncomeDifference + " рублей.");

        float ChristinaIncomeDifference = (float) (ChristinaAnnualIncreased % ChristinaAnnualCurrent);
        System.out.println("Кристин теперь получает " + ChristinaIncreased + " рублей. Годовой доход вырос на "
                + ChristinaIncomeDifference + " рублей.");


    }
}