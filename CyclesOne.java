import java.util.Scanner;

public class CyclesOne {
    public static void main(String[] args) {
        final int x = 2;
        final int y = 3;
        final int z = 4;
        Scanner scan = new Scanner(System.in);
        int[] array = new int[scan.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
            if (array[i] == x || array[i] == y || array[i] == z){
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}
