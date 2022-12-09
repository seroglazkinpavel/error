package seminar_3.fileSystem;

import java.io.File;

public class FindFile {
    private File folder;

    public boolean findTheSameFileName(String lastName, String folderName) {
        this.folder = new File(folderName);
        boolean found = false;

        for (File file : this.folder.listFiles()) {
            String fileName = file.getName().split("\\.")[0];

            if (fileName.equals(lastName)) {
                found = true;
                break;
            }
        }
        return found;
    }
}