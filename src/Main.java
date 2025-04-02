public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задание 2");
        for (int i = 10; i >= 0; i = i - 2) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задание 4");
        for (int i = -10; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i = i + i) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задание 8");
        int save = 29000;
        int savings = 0;
        for (int i = 1; i <= 12; i++) {
            savings = savings + save;
            System.out.println("Месяц " + i + " сумма накоплений равна " + savings + " рублей");
        }
        System.out.println();
        System.out.println("Задание 9");
        int save1 = 29000;
        int savings1 = 0;
        for (int i = 1; i <= 12; i++) {
            savings1 = savings1 + savings1 / 100;
            savings1 = savings1 + save1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + savings1 + " рублей");
        }
        System.out.println();
        System.out.println("Задание  10");
        int constant = 2;
        int number = 0;
        for (int i = 1; i <= 10; i++) {
            number = constant + number;
            System.out.println("2 * " + i + " = " + number);

        }
    }
}

