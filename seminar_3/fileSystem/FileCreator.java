package seminar_3.fileSystem;

import seminar_3.exceptions.FileCreateException;

import java.io.File;
import java.io.IOException;

public class FileCreator {
    private File file;

    /**
     * Создает новый файл по указанному пути.
     * 
     * @param path - путь плюс имя файла и расширение.
     * @return - возвращает true в случае удачного создания.
     */
    // @Override
    public boolean createFile(String path) throws FileCreateException {
        this.file = new File(path);
        try {
            return this.file.createNewFile();
        } catch (IOException e) {
            throw new FileCreateException(e.getMessage());

        }
    }
}