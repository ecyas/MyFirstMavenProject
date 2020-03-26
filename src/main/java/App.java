import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите фигуру: ");
            System.out.println("------------------");
            showMenu();
            int menuNum = scanner.nextInt();
            if (menuNum == 0) {
                break;
            } else if (menuNum == 1) {
                new Circle();
            } else if (menuNum == 2) {
                new Square();
            } else if (menuNum == 3) {
                new Triangle();
            }

        }
    }
    private static void showMenu() {

        System.out.println("1. Круг\n" +
                "2. Квадрат\n" +
                "3. Треугольник\n" +
                "0. Прервать выбор");

    }


}
