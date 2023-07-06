import java.util.Scanner;

public class CycleFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте параметры матрицы");
        System.out.println("Укажите кол-во строк");
        int one = scan.nextInt();
        System.out.println("Укажите кол-во столбцов");
        int two = scan.nextInt();
        int[][] array = new int[one][two];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < two; j++) {
                System.out.println("Ввведите элемент столбца");
                array[i][j] = scan.nextInt();
            }
        }
        System.out.println("Первая строка матрица * 3");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[0][i] * 3);
        }
    }

}
