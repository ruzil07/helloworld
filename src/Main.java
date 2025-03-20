public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");
        int age = 12;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ",он не достиг совершеннолетия," +
                    " нужно немного подождать");
        }
        System.out.println();
        System.out.println("Задание 2");
        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку ");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки ");
        }
        System.out.println();
        System.out.println("Задание 3");
        int speed = 65;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + "," + " то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + "," + " можно ездить спокойно.");
        }
        System.out.println();
        System.out.println("Задание 4");
        int age1 = 30;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + "," + " то ему нужно ходить в детский сад.");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + "," + " то ему нужно ходить в школу.");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + "," + " то его место в университете.");
        }
        if (age1 >= 25) {
            System.out.println("Если возраст человека равен " + age1 + "," + " то ему пора ходить на работу.");
        }
        System.out.println();
        System.out.println("Задание 5");
        int age5 = 2;
        if (age5 < 5) {
            System.out.println("Если возраст ребенка равен " + age5 + "," + " то ему нельзя кататься на аттракционе");
        }
        if (age5 >= 5 && age5 < 14) {
            System.out.println("Если возраст ребенка равен " + age5 + "," + " то ему можно кататься на аттракционе" +
                    " в сопровождении");
        }
        if (age5 >= 14) {
            System.out.println("Если возраст ребенка равен " + age5 + "," + " то он может кататься без " +
                    "сопровождения взрослого");
        }
        System.out.println();
        System.out.println("Задание 6");
        int human = 102;
        if (human <= 60) {
            System.out.println("Вагоне есть сидщее места.");
        } else if (human > 60 && human <= 102) {
            System.out.println("Вагоне есть стоящее места.");
        } else if (human > 102) {
            System.out.println("Вагон уже полностью забит.");
        }
        System.out.println();
        System.out.println("Задание 7");
        int one = 30;
        int two = 22;
        int three = 10;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else if (three > one && three > two) {
            System.out.println(three);
        }
    }
}