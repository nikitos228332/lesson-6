public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4)
            System.out.println(i + " год является високосным");
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2)
            System.out.println(i);
        System.out.println("Задача 8");
        int total = 0;
        int salary = 29000;
        int month = 12;
        for (int i = 0; i <= month; i = i + 1) {
            total = total + salary;
            System.out.println("Месяц " + i + " итого " + total + " рублей");
        }

        System.out.println("Задача 9");
        int salary1 = 29000;
        int total1 = 0;
        int month1 = 12;
        for (int i = 1; i <= month1; i = i + 1) {
            total1 = total1 + total1 / 100;
            total1 = total1 + salary1;
            System.out.println(total1 + " рублей получилось на счете в " + i + " месяц");
        }
        System.out.println("Задача 10");
        int finish = 0;
        for (int i = 1; i <= 10; i = i + 1) {
            finish = finish + 2;
            System.out.println("2*" + i + "=" + finish);
        }
    }
}