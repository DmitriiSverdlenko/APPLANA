import java.util.Scanner;

public class FinalTaskFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String answer = "Заархивированный вирус";
        final String help = "Подсказка";
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите ответ или запросите подсказку");
            String str = scan.nextLine();
            if (str.matches(answer)) {
                System.out.println("Правильно!");
                break;
            } else if (str.matches(help) & i == 0) {
                System.out.println("Перед вами подсказка");
                str = scan.nextLine();
                if (str.matches(answer)) {
                    System.out.println("Правильно!");
                } else {
                    System.out.println("Обидно, приходи в другой раз");
                }
                break;
            } else if (str.matches(help) & i != 0) {
                System.out.println("Подсказка уже недоступна");
                i--;
            } else if (!str.matches(answer) & i == 2) {
                System.out.println("Обидно, приходи в другой раз");
            } else
                System.out.println("Подумай еще!");
        }
    }
}
