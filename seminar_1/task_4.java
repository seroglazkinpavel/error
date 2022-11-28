/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных
 * массива, и возвращающий новый массив,
 * каждый элемент которого равен частному элементов двух входящих массивов в той
 * же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 * Важно:
 * При выполнении метода единственное исключение, которое пользователь может
 * увидеть - RuntimeException, т.е. ваше
 */

public class task_4 {
    public static float[] division_mas(int[] arr1, int[] arr2) {
        float[] arr3 = new float[arr1.length];
        if (arr1.length != arr2.length)
            throw new RuntimeException("Длина массивов разная первого: " + arr1.length + ",второго: " + arr2.length);
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Нельзя делить на 0");
            }
            arr3[i] = arr1[i] / arr2[i];
        }
        return arr3;
    }

    public static void print_mas(float[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = { 3, 4, 6, 4 }, b = { 0, 3, 2, 1 }, c = { 1, 2, 3, 4, 5 };
        print_mas(division_mas(a, b));
        print_mas(division_mas(a, c));
    }
}