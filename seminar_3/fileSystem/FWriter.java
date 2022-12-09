package seminar_3.fileSystem;

import seminar_3.exceptions.FileCreateException;
import seminar_3.exceptions.СhildFileCreateException;
import seminar_3.exceptions.FindFileException;

import java.io.FileWriter;
import java.io.IOException;

public class FWriter {
    private final String folderPath;
    private FileWriter fileWriter;
    private FileCreator fileCreator;
    private FindFile findFile;

    /**
     * Записывает информацию о пользователе в файл. Если файл с именем равен
     * фамилии, то записывает в него.
     * Если не равен, то создаст новый файл, с именем как фамилия, и запишет инфо
     * туда.
     * 
     * @param fileCreator - Создает новый файл
     * @param findFile    - Ищет файлы в директории с именем равным фамилии
     * @param folderPath  - путь к директории с файлами
     */
    public FWriter(FileCreator fileCreator, FindFile findFile, String folderPath) {
        this.fileCreator = fileCreator;
        this.findFile = findFile;
        this.folderPath = folderPath;
    }

    public boolean writeToFile(String[] infoToWrite) throws FindFileException, FileCreateException {
        String path = this.folderPath + infoToWrite[0] + ".txt";

        if (findFile.findTheSameFileName(infoToWrite[0], this.folderPath)) {
            System.out.println("Found the same last name");// Нашел ту же фамилию
            try {
                this.fileWriter = new FileWriter(path, true);
                this.fileWriter.write(infoToWrite[1] + "\n");
                this.fileWriter.close();
                System.out.println("The data wrote");// Данные, записанные
            } catch (IOException e) {
                throw new FindFileException(e.getMessage());
            }
        } else {
            try {
                fileCreator.createFile(path);
                System.out.println("Файл создан.");
            } catch (FileCreateException e) {
                throw new СhildFileCreateException(e.getMessage());
            }
            try {
                this.fileWriter = new FileWriter(path, true);
                this.fileWriter.write(infoToWrite[1] + "\n");
                this.fileWriter.close();
                System.out.println("Запись полученных данных готова.");
            } catch (IOException e) {
                throw new FindFileException(e.getMessage());
            }
        }
        return true;
    }
}