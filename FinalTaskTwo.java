import java.util.Objects;
import java.util.Scanner;

public class FinalTaskTwo {
    public static void main(String[] args) {
        System.out.println("Программа принимает на вход строку длиной 5 символов.\n" +
                "Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] array = str.split("");
        int number = 0;
        String sing = "";
        for (int i = 0; i < array.length; i++){
           switch (array[i]){
               case "x":
                   number = i;
                   break;
               case "-", "+":
                   sing = array[i];
                   break;
               default:
                   break;
           }
        }
        boolean a = Objects.equals(sing, "+");
        int result;
        switch (number){
            case 0:
                if (a)
                    result = Integer.parseInt(array[array.length - 1]) - Integer.parseInt(array[array.length - 3]);
                else
                    result = Integer.parseInt(array[array.length - 1]) + Integer.parseInt(array[array.length - 3]);
                System.out.println(result);
                break;
            case 2:
                if (a)
                    result = Integer.parseInt(array[array.length - 1]) - Integer.parseInt(array[0]);
                else
                    result = Integer.parseInt(array[array.length - 1]) + Integer.parseInt(array[0]);
                System.out.println(result);
                break;
            case 4:
                if (a)
                    result = Integer.parseInt(array[0]) + Integer.parseInt(array[array.length - 3]);
                else
                    result = Integer.parseInt(array[0]) - Integer.parseInt(array[array.length - 3]);
                System.out.println(result);
                break;
            default:
                break;
        }
    }
}
