/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных
 * массива, и возвращающий новый массив,
 * каждый элемент которого равен разности элементов двух входящих массивов в той
 * же ячейке. Если длины массивов
 * не равны, необходимо как-то оповестить пользователя.
 */

public class task_3 {
    public static int[] diff_mas(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        if (arr1.length != arr2.length)
            throw new RuntimeException("Длина массивов разная первого: " + arr1.length + ",второго: " + arr2.length);
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] - arr2[i];
        }
        return arr3;
    }

    public static void print_mas(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 }, b = { 4, 3, 2, 1 }, c = { 1, 2, 3, 4, 5 };
        print_mas(diff_mas(a, b));
        print_mas(diff_mas(a, c));
    }
}
