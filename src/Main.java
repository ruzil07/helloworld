public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
        System.out.println("Задание 2");

        int clientOS2 = 0;
        int clientDeviceYear = 2014;

        if (clientDeviceYear < 2015) {
            if (clientOS2 == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS2 == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        }
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
        int deliveryDistance = 101;
        int deliveryTime = 1;
        if (deliveryDistance > 100) {
            System.out.println("нет доставки");
        } else if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 100) {
            deliveryTime = deliveryTime + deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        System.out.println();
        System.out.println("Задание 5");

        int monthNumber = 13;

        switch (monthNumber) {
            case 1:
                System.out.println("Принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Принадлежит к сезону лета");
                break;
            case 7:
                System.out.println("Принадлежит к сезону лета");
                break;
            case 8:
                System.out.println("Принадлежит к сезону лета");
                break;
            case 9:
                System.out.println("Принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}





