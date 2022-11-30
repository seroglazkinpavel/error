package seminar_2;

import java.util.Scanner;

/**
 * Задание 1 реализуйте метод, который запрашивает у пользователя ввод дробного
 * числа (типа float), и возвращает введенное значение. Ввод текста вместо числа
 * не должно приводить к падению приложения, вместо этого, необходимо повторно
 * запросить у пользователя ввод данных.
 */

public class task_1 {
    public static void main(String[] args) {
        myScanner();
    }

    public static void myScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробное число");
        try {
            float number = (float) sc.nextFloat();
            System.out.println("Спасибо! Вы ввели число " + number);
        } catch (Exception e) {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        } finally {
            sc.close();
        }
    }

}