import java.util.Scanner;

public class DataThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввести строку из слов, разделенных пробелами");
        String str = scan.nextLine();
        String regex = "[а-яА-Я+]*";
        String[] array = str.split(" ");
        int counter = 0;
        for (String string : array){
            if (string.matches(regex)){
                System.out.println(string);
                counter++;
            }
        }
        System.out.println("Кол-во слов кирилицы = " + counter);
    }
}
