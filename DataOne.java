import java.util.Scanner;

public class DataOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        String a = scan.next();
        System.out.println("Введите второе число");
        Integer b = scan.nextInt();
        int result = a.compareTo(String.valueOf(b));
        if(result == 1){
            System.out.println("Большее число - " + a + " меньшее число - " + (double)b);
        } else if (result == -1) {
            System.out.println("Большее число - " + b + " меньшее число - " + Double.valueOf(a));
        } else
            System.out.println("Числа равны");
    }
}
