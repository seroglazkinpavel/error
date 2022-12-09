package seminar_3;

import seminar_3.fileSystem.FWriter;
import seminar_3.parseData.ParseData;
import seminar_3.validationData.CompareDataProcessor;
import seminar_3.view.ConsoleData;

import java.io.IOException;

public class Presenter {
    private final ConsoleData getData;
    private final ParseData parseData;

    private final CompareDataProcessor dataProcessor;
    private final FWriter fileWriter;

    /**
     * Объединяет в работу пользовательский интерфейс, парсер строки, проверку на
     * валидность элементов строки
     * Пишет в файлы инфо по заданному формату.
     * 
     * @param getData       - пользовательский интерфейс.
     * @param parseData     - парсер строки.
     * @param dataProcessor - проверка элементов на валидность
     * @param fileWriter    - пишет в файл согласно условию.
     */
    public Presenter(ConsoleData getData,
            ParseData parseData,
            CompareDataProcessor dataProcessor,
            FWriter fileWriter) {
        this.getData = getData;
        this.parseData = parseData;
        this.dataProcessor = dataProcessor;
        this.fileWriter = fileWriter;
    }

    public void run() throws IOException {
        parseData.disassemble(getData.getData());

        dataProcessor.checkFullName(parseData.getFullName());

        dataProcessor.checkBirthday(parseData.getBirthday());

        dataProcessor.checkPhoneNumber(parseData.getPhoneNumber());

        dataProcessor.checkSex(parseData.getSex());
        System.out.println("Проверка прошла успешно!");

        fileWriter.writeToFile(parseData.getInfoToWrite());
    }
}