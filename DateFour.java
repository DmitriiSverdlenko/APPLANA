import java.util.*;

public class DateFour {
    public static void main(String[] args) {
        int[] array = new int[15];
       for (int i = 0; i < array.length; i++ ){
            Random rand = new Random();
            array[i] = rand.nextInt(-20,21);
        }
        Arrays.sort(array);
        System.out.println("Максимальное значение = " + array[0] + " Минимальное значение = " + array[array.length - 1]);
        if (Math.abs(array[0]) > array[array.length - 1])
        System.out.println("Наибольшее по модулю " + array[0]);
        else
            System.out.println("Наибольшее по модулю " + array[array.length - 1]);
    }
}
