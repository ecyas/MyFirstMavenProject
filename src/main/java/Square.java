import java.util.Scanner;

public class Square extends Shape{
    private double sideA;
    private double sideB;

    public Square() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте сторону А: ");
        sideA = sc.nextDouble();
        while (sideA <= 0) {
            System.out.println("Значение должно быть больше 0");
            sideA = sc.nextDouble();
        }
        System.out.println("Задайте сторону B: ");
        sideB = sc.nextDouble();
        while (sideB <= 0) {
            System.out.println("Значение должно быть больше 0");
            sideB = sc.nextDouble();
        }

        printAnswer();
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void printAnswer() {
        System.out.println("Площадь квадрата = " + getArea());
        System.out.println("----------------------");
    }

    public double getArea() {
        return sideA * sideB;
    }
}
