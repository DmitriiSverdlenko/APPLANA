import java.sql.SQLOutput;
import java.util.Scanner;

public class DataTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввведите I like Java!!!");
        String str = scan.nextLine();
        if (str.contains("Java") & str.startsWith("I like") & str.endsWith("!!!")){
            System.out.println(str.toUpperCase());
        }
        System.out.println(str.replace("a", "o"));
    }
}
