import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");
        // как будь то китаец написпал условие этого задания. Не по русский написано. очень сложно понять какой
        // ответ хотите увидеть.
        float[] floatArr = new float[3];
        floatArr[0] = 1.57f;
        floatArr[1] = 7.654f;
        floatArr[2] = 9.986f;

        System.out.println();
        System.out.println("Задание 2");
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки
        // запятую ставить не надо.- Какого массива ? Откуда взять какой массив? Я взял с первого задания.
        System.out.println(Arrays.toString(floatArr));

        System.out.println();
        System.out.println("Задание 3");
        int[] numbers = {1, 2, 3};
        System.out.print(numbers[2] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.println(numbers[0]);
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(floatArr[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }
        System.out.println();
        System.out.println("Задание 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}



