import java.util.Scanner;

public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;
    private double halfPerimeter;

    public Triangle() {
        initializeShape();
        while ((halfPerimeter - getSideA() <= 0) || (halfPerimeter - getSideB() <= 0) || (halfPerimeter - getSideC() <= 0)) {
            System.out.println("Такого треугольника не существует. Задайте новые значения.");
            System.out.println("----------------------");
            initializeShape();
        }
        printAnswer();

    }

    private void initializeShape() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте сторону А: ");
        sideA = sc.nextDouble();
        while (sideA <= 0) {
            System.out.println("Значение должно быть больше 0. Повторите ввод.");
            sideA = sc.nextDouble();
        }
        System.out.println("Задайте сторону B: ");
        sideB = sc.nextDouble();
        while (sideB <= 0) {
            System.out.println("Значение должно быть больше 0");
            sideB = sc.nextDouble();
        }
        System.out.println("Задайте сторону C: ");
        sideC = sc.nextDouble();
        while (sideC <= 0) {
            System.out.println("Значение должно быть больше 0");
            sideC = sc.nextDouble();
        }
        halfPerimeter = getHalfPerimeter();
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

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    private double getHalfPerimeter() {
        return (getSideA() + getSideB() + getSideC()) / 2;
    }

    public double getArea() {
        if (isValid()) {
            return Math.sqrt(halfPerimeter * ((halfPerimeter - getSideA()) * (halfPerimeter - getSideB()) * (halfPerimeter - getSideC())));
        }
        return -1;
    }

    private boolean isValid() {
        if (getSideA() <= 0 || getSideB() <= 0 || getSideC() <= 0) {
            return false;
        }
        return true;
    }

    public void printAnswer() {
        System.out.println("Площадь треугольника = " + getArea());
        System.out.println("----------------------");
    }
}
