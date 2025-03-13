public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var kat = 3.6;
        System.out.println(kat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        kat = kat + 4;
        System.out.println(kat);
        paper = paper + 4;
        System.out.println(paper + 4);
        System.out.println("Задача 3");
        dog = dog + 3.5;
        System.out.println(dog);
        kat = kat + 1.6;
        System.out.println(kat);
        paper = paper + 7639;
        System.out.println(paper);
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задача 6");
        var MassOfOneBoxer = 78.2;
        var MassOfTheSecondBoxer = 82.7;
        var TotalMassOfTwoFighters = MassOfOneBoxer + MassOfTheSecondBoxer;
        System.out.println("Общая масса двух бойцов " + TotalMassOfTwoFighters + " кг");
        var TheDifferenceBetweenTheMassesOfFighters = MassOfTheSecondBoxer - MassOfOneBoxer;
        System.out.println("Разницу между массами бойцов " + TheDifferenceBetweenTheMassesOfFighters + " кг");
        System.out.println("Задача 7");
        var RemainderFromSeparation = MassOfTheSecondBoxer % MassOfOneBoxer;
        System.out.println("Остаток от деления " + RemainderFromSeparation);
        System.out.println("Задача 8");
        var on = 640;
        var two = 8;
        var three = on / two;
        System.out.println("1) Всего работников в компании- " + three + " человек");
        var four = 94;
        var sixth = three + four;
        var fifth = two * sixth;
        System.out.println("2) Если в компании работает " + sixth + " человек, то всего " + fifth + " часов работы может быть поделено между сотрудниками ");


    }
}