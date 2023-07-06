import java.util.Scanner;

public class CyclesThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во элементов в массиве");
        double[] array = new double[scan.nextInt()];
        double sum = 0;
        for(int i = 0; i < array.length; i++ ){
            System.out.println("Введите элемент массива. Число с плавающей точкой");
            array[i] = scan.nextDouble();
            sum += array[i];

        }
        double agv = sum / array.length;
        for (int i = 0; i < array.length; i ++){
            System.out.println("Элемент массива * среднее арифмитическое = " + array[i] * agv);
        }
    }
}
