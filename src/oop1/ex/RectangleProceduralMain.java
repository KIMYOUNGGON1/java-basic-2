package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        int area = calculateArea(width, height);
        System.out.println("넓이: " + area);

        int perimeter = calculaterPerimeter(width, height);
        System.out.println("perimeter = " + perimeter);

        boolean square = isSquare(width, height);
        System.out.println("square = " + square);
    }

    static int calculateArea(int width, int height) {
        return width * height;
    }

    static int calculaterPerimeter(int width, int height) {
        return 2 * (width + height);
    }

    static boolean isSquare(int width, int height) {
        return width == height;
    }
}
