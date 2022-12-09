package seminar_3.view;

import seminar_3.exceptions.ConsoleException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleData {
    BufferedReader reader;

    /**
     * Интерфейс консольного ввода.console
     */
    public ConsoleData() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getData() throws IOException {
        String text = """
                Введите данные в произвольном порядке, разделенные пробелом:
                Фамилия Имя Отчество датарождения номертелефона пол.

                Форматы данных:
                Фамилия, имя, отчество - строки.
                Дата_рождения - строка формата dd.mm.yyyy.
                Номер_телефона - целое беззнаковое число без форматирования.
                Пол - символ латиницей f или m.
                """;
        System.out.println(text);
        System.out.print("Введите данные: ");
        String data = "";
        try {
            data = this.reader.readLine();
        } catch (IOException e) {
            throw new ConsoleException(new IOException());
        }
        return data;
    }
}