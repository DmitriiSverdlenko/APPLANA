import java.util.Scanner;

public class OperationThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = scan.nextInt();
        switch (x){
            case (1):
                System.out.println("Выберите единицу измерения: 1 - киллограммы, 2 - центнеры, 3 - тонны");
                int y = scan.nextInt();
                System.out.println("Введите количество");
                double z = scan.nextDouble();
                switch (y){
                    case (1):
                        System.out.print("Результат:\n"
                                + "Киллограмм: " + z + "\n"
                        + "Центнеров: " + z / 100 + "\n"
                        + "Тонн: " + z / 1000);
                        break;
                    case (2):
                        System.out.print("Результат:\n"
                        + "Центнеров: " + z + "\n"
                        + "Киллограмм: " + z * 100 + "\n"
                        + "Тонн: " + z / 10);
                        break;
                    case (3):
                        System.out.print("Результат:\n"
                                + "Тонн: " + z + "\n"
                        + "Киллограмм: " + z * 1000 + "\n"
                        + "Центнеров: " + z * 10);
                        break;
                    default:
                        System.out.println("Введена неверная еденица измерения");
                        break;
                }
                break;
            case (2):
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                int q = scan.nextInt();
                System.out.println("Введите количество");
                double w = scan.nextDouble();
                switch (q){
                    case (1):
                        System.out.print("Результат:\n"
                                + "Метров: " + w + "\n"
                        + "Миль: " + w / 1609 + "\n"
                        + "Ярдов: " + w * 1.094 + "\n"
                        + "Фут: " + w * 3.281);
                        break;
                    case (2):
                        System.out.print("Результат:\n"
                                + "Миль: " + w + "\n"
                                + "Метров: " + w * 1609 + "\n"
                                + "Ярдов: " + w * 1760 + "\n"
                                + "Фут: " + w * 5280);
                        break;
                    case (3):
                        System.out.print("Результат:\n"
                                + "Ярд: " + w + "\n"
                                + "Метров: " + w / 1.094 + "\n"
                                + "Миль: " + w / 1760 + "\n"
                                + "Фут: " + w * 5280);
                        break;
                    case (4):
                        System.out.print("Результат:\n"
                                + "Фут: " + w + "\n"
                                + "Метров: " + w / 3.281 + "\n"
                                + "Миль: " + w / 5280 + "\n"
                                + "Ярдов: " + w * 5280);
                        break;
                    default:
                        System.out.print("Введена неверная еденица измерения");
                        break;
                }
                break;
            default:
                System.out.println("Введено неверное значение");
                break;
        }

    }
}
