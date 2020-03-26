import java.util.Scanner;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте радиус круга:");
        radius = sc.nextDouble();
        while (radius <= 0) {
            System.out.println("Неверное значение радиуса!");
            radius = sc.nextDouble();
        }
        printAnswer();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return getPI() * (radius * radius);
    }

    public void printAnswer() {
        System.out.println("Площадь круга = " + getArea());
        System.out.println("----------------------");
    }


}
