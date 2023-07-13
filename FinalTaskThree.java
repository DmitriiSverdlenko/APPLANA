import java.util.Objects;
import java.util.Scanner;

public class FinalTaskThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во строк");
        int countWords = scan.nextInt();
        String[] words = new String[countWords];
        for (int i = 0; i < words.length; i++) {
            System.out.println("Введите строку");
            words[i] = scan.next();
        }
        int counter = 0;
        int counterReady = 1;
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            String[] array = words[i].split("");
            for (int j = 0; j < array.length - 1; j++) {
                if (!(Objects.equals(array[j], array[j + 1]))){
                counter++;
                }
            }
            if (counterReady < counter) {
                counterReady = counter;
                index = i;
            }
            counter = 0;
        }
        System.out.println(words[index]);
    }
}
