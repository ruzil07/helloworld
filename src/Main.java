public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");
        int desiredSun = 2_459_000;
        int piggyBank = 0;
        int savings = 15000;
        double persent = 1D / 100;
        int month = 0;
        while (piggyBank < desiredSun) {
            piggyBank += savings;
            piggyBank = (int) (piggyBank * (1 + persent));
            month++;
            System.out.println("Месяц " + month + ". сумма накоплений равна " + piggyBank + " рублей");
        }

        System.out.println();
        System.out.print("Задание 2");
        System.out.println();
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();
        int start1 = 10;
        for (; start1 > 0; start1--) {
            System.out.print(start1 + " ");
        }
        System.out.println();
        System.out.println("Задание 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * fertility / 1000 - population * mortality / 1000;
            System.out.println("Год " + year + ", чесленность населения составляет " + population);
        }
        System.out.println();
        System.out.println("Задание 4");
        persent = 7D / 100;
        desiredSun = 12000000;
        piggyBank = savings;
        month = 0;
        while (piggyBank < desiredSun) {
            piggyBank = (int) (piggyBank * (1 + persent));
            month++;
            System.out.println("Месяц " + month + ". сумма накоплений равна " + piggyBank + " рублей");
        }
        System.out.println();
        System.out.println("Задание 5");
        persent = 7D / 100;
        desiredSun = 12000000;
        piggyBank = savings;
        month = 0;
        while (piggyBank < desiredSun) {
            piggyBank = (int) (piggyBank * (1 + persent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ". сумма накоплений равна " + piggyBank + " рублей");
            }
        }
        System.out.println();
        System.out.println("Задание 6");
        persent = 7D / 100;
        desiredSun = 12000000;
        piggyBank = savings;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            piggyBank = (int) (piggyBank * (1 + persent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ". сумма накоплений равна " + piggyBank + " рублей");
            }
        }
        System.out.println();
        System.out.println("Задание 7");
        int firstFridey=4;
        for ( int day= firstFridey; day<=31; day+=7) {
            System.out.println("Сегодня пятница, " + day+ " -ечисло. Необходимо подготовить отчет");
        }
        System.out.println();
        System.out.println("Задание 8");
        // Я тне понимаю как это рондомный набор выводит 1896 1975 и 2054. Я смотрел видео как он обьяснял это но не
        // понял . Тупо переписал и все
        int period=79;
        int startSeeing=0;
        start = currentYear - 200;
        int end = currentYear+100;
        for (int year = startSeeing; year < end; year+= period ) {
            if (year> start){
                System.out.println(year);
            }
        }
    }
}

