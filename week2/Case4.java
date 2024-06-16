package week2;

public class Case4 {
    public static void main(String[] args) {
        final double PI = 3.141592;
        double radius = 23.12;
        double area = PI * radius * radius;
        int integerPart = (int) area;

        System.out.println("Area of the Circle = " + integerPart);
    }
}
