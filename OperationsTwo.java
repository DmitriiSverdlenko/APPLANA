import java.util.Scanner;

public class OperationsTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Перед вами простой калькулятор");
        System.out.println("Введите первое число");
        double x = scan.nextDouble();
        System.out.println("Введите второе число");
        double y = scan.nextDouble();
        System.out.println("Введите один из предложенных операторов: + - * /");
        String z = scan.next();
        switch (z){
            case ("+"):
                System.out.println(x + y);
                break;
            case ("-"):
                System.out.println(x - y);
                break;
            case ("*"):
                System.out.println(x * y);
                break;
            case ("/"):
                System.out.println(x / y);
                break;
            default:
                System.out.println("Введен не верный символ");
                break;
        }
    }
}
