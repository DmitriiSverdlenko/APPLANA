import java.util.Scanner;

public class CyclesTwo {
    public static void main(String[] args) {
        System.out.println("Введите любое положительное, целое число");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            counter++;
            if (counter % 2 != 0) {
                sum += counter;
            }
        }
        System.out.println(sum);
    }
}
