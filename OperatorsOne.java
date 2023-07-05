import java.util.Scanner;

public class OperatorsOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        double x = scan.nextDouble();
        System.out.println("Введите второе число");
        double y = scan.nextDouble();
        System.out.println("Введите третье число");
        double z = scan.nextDouble();
        double agv = (x + y + z) / 3;
        System.out.println("Среднее Арифмитическое = " + agv);
        int action = (int) Math.floor(agv / 2);
        if(action > 3)
            System.out.println("Программа выполнена корректно");
    }
}
