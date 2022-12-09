/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

package seminar_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_4 {
    public static void main(String[] args) throws Exception {

        System.out.println(input());
    }

    public static String input() throws Exception {
        String s = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите любой текст кроме пустой строки");
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if (s.equals("")) {
            throw new Exception("Строка не может быть пустой!");
        }
        return s;
    }

}
