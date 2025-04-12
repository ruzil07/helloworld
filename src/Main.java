public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");
        int[] payments = {1, 2, 3, 4, 5};
        payments[0] = 3;
        payments[1] = 5;
        payments[2] = 6;
        payments[3] = 8;
        payments[4] = 1;
        int sum = 0;
        for (int element : payments) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();
        System.out.println("Задание 2");
        int maxPayments = -1;
        for (int i = 0; i < payments.length; i++) {
            if (payments[i] > maxPayments) {
                maxPayments = payments[i];

            }
        }

        int minPayents = payments[0];
        for (int i = 0; i < payments.length; i++) {
            if (payments[i] < minPayents) ;
            minPayents = payments[i];
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayents + " рублей. Максимальная сумма" +
                " трат за неделю составила " + maxPayments + " рублей ");

        System.out.println();
        System.out.println("Задание 3");

        // Переменная для хранения суммы всех трат
        int totalPayents = 0;
        for (int i : payments) {
            totalPayents += i;
        }
        double averagePayents = (double) totalPayents / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayents + " рублей");

        System.out.println();
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            int index = reverseFullName.length - 1 - i;

            char value = reverseFullName[i];
            reverseFullName[i] = reverseFullName[index];
            reverseFullName[index] = value;
        }

        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}








