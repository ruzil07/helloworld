import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");
        // как будь то китаец написпал условие этого задания. Не по русский написано. очень сложно понять какой
        // ответ хотите увидеть.
        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        float[] floatArr = {1.57f, 7.654f, 9.986f};
        int[] intArr1 = new int[9];
        intArr1[0] = 1;
        intArr1[1] = 2;
        intArr1[2] = 0;
        intArr1[3] = 1;
        intArr1[4] = 5;
        intArr1[5] = 1;
        intArr1[6] = 9;
        intArr1[7] = 1;
        intArr1[8] = 10;

        System.out.println();
        System.out.println("Задание 2");
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки
        // запятую ставить не надо.- Какого массива ? Откуда взять какой массив? Я взял с первого задания.
        for (int i = 0; i < intArr.length; i++) {
            if (i == intArr.length - 1) {
                System.out.println(intArr[i]);
                break;
            }
            System.out.print(intArr[i] + ", ");
        }
        for (int i = 0; i < floatArr.length; i++) {
            if (i == floatArr.length - 1) {
                System.out.println(floatArr[i]);
                break;
            }
            System.out.print(floatArr[i] + ", ");
        }
        for (int i = 0; i < intArr1.length; i++) {
            if (i == intArr1.length - 1) {
                System.out.println(intArr1[i]);
                break;
            }
            System.out.print(intArr1[i] + ", ");
        }

        System.out.println();
        System.out.println("Задание 3");
        for (int i = intArr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(intArr[i]);
                break;
            }
            System.out.print(intArr[i] + ", ");
        }
        for (int i = floatArr.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(floatArr[i]);
                break;
            }
            System.out.print(floatArr[i] + ", ");
        }
        for (int i = intArr1.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.println(intArr1[i]);
                break;
            }
            System.out.print(intArr1[i] + ", ");
        }

        System.out.println();
        System.out.println("Задание 4");
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 != 0) {
                intArr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(intArr));
    }
}



