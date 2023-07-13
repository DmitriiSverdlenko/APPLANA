import java.util.Scanner;

public class FinalTaskOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите курс доллора");
        String a = scan.next();
        double d = Double.parseDouble(String.valueOf(a));
        System.out.println("Введите кол-во рублей");
        int b = scan.nextInt();
        double c = (double) Math.round(b / d * 100) /100;
        System.out.println(c);
    }
}
