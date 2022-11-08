public class Main {
    public static void main(String[] args) {
        // Задание 6
        System.out.println("Задание 6");
        var boxer1Weight = 78.2;
        System.out.println(boxer1Weight);
        var boxer2Weight = 82.7;
        System.out.println(boxer2Weight);
        System.out.println("общий вес двух бойцов: " + (boxer1Weight + boxer2Weight));
        System.out.println("Разница весов двух бойцов: " + (boxer2Weight - boxer1Weight));

        // Задание 7
        System.out.println("Задание 7");
        System.out.println("Разница весов двух бойцов: " + (boxer2Weight - boxer1Weight));
        System.out.println("Разница весов двух бойцов: " + (boxer2Weight % boxer1Weight));

        // Задание 8
        System.out.println("Задание 8");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalEmployees = totalWorkingHours / hoursPerDay;
        System.out.println("Всего работников в компании – " + totalEmployees + "человек");

        totalEmployees = totalEmployees + 94;
        totalWorkingHours = totalEmployees * hoursPerDay;
        System.out.println("Если в компании работает " + totalEmployees + "человека, то всего " + totalWorkingHours + "часа работы может быть поделено между сотрудниками");

    }
}