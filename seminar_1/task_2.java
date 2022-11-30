/**
 * Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете
 * получить?
 */

// учесть деление на 0(в первом задании было учесть корень из отрицательного
// числа)
public class task_2 {
    public static void main(String[] arg) {
        // solution(5, 10, 1);
        // solution(5, 7, 9);
        // solution(0, 7, 9);
        System.out.println(helloMessage(null));
    }

    static void solution(double a, double b, double c) {
        double d; // дискриминант

        d = b * b - 4 * a * c;

        // учесть деление на 0
        if (a == 0)
            throw new ArithmeticException("Деление на 0."); // создать исключение

        double x1 = (-b - Math.sqrt(d)) / (2 * a);
        double x2 = (-b + Math.sqrt(d)) / (2 * a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

    }

    // учесть null(в первом задании было пустая строка)
    public static String helloMessage(String name) {
        if (name == null) {
            throw new RuntimeException("Имя не может быть null.");
        }
        return "Hello, " + name;
    }
}