package homework;

import lesson20.FileAlreadyExistsException;
import lesson20.FileCopyFailedException;
import lesson20.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileCopyJava7 implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException, IOException {
        File sourceFile = new File(source);
        File destFile = new File(destination);

        Files.copy(sourceFile.toPath(), destFile.toPath());

    }
}
