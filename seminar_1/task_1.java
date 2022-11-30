
/**
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */

public class task_1 {
    public static void main(String[] arg) {
        solution(5, 10, 1);
        // solution(5, 7, 9);
        // solution(0, 7, 9);

        System.out.println(helloMessage("Pavel"));

        System.out.println(area(-5, -8));
    }

    public static void solution(double a, double b, double c) {
        double d; // дискриминант

        d = b * b - 4 * a * c;

        // учесть корень из отрицательного числа
        if (d < 0)
            throw new ArithmeticException("Уравнение не имеет корней."); // создать исключение

        double x1 = (-b - Math.sqrt(d)) / (2 * a);
        double x2 = (-b + Math.sqrt(d)) / (2 * a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

    }

    public static String helloMessage(String name) {
        if (name == "") {
            throw new RuntimeException("Пустая строка.");
        }
        return "Hello, " + name;
    }

    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
        return width * height;
    }
}