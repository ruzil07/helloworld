public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();
        System.out.println("Задание 2");

        int clientOS2 = 0;
        int clientDeviceYear = 2014;

        if (clientDeviceYear < 2015) {
            if (clientOS2 == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

        } else if (clientOS2 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            System.out.println("Установите версию приложения для Android по ссылке");


        System.out.println();
        System.out.println("Задание 3");

        int year = 2109;

        if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else if (year > 1584) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println("Год не может быть меньше 1585");
        }
        System.out.println();
        System.out.println("Задание 4");
        int deliveryDistance = 70;
        int deliveryTime = 1;
        if (deliveryDistance > 100) {
            System.out.println("нет доставки");
        } else if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 100) {
            // Доставка в пределах 60 км до 100 км добавляет еще одни сутки. Ну три же должна быть и выходит цифра ТРИ!?
            deliveryTime = deliveryTime + deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        System.out.println();
        System.out.println("Задание 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Принадлежит к сезону лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}





