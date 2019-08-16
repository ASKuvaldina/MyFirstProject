package homework;



import lesson20.FileAlreadyExistsException;
import lesson20.FileCopyFailedException;
import lesson20.FileCopyUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyNIO implements FileCopyUtils {

    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException, IOException {


            Path pathSource = Paths.get(source);
            Path pathDestination = Paths.get(destination);
            try {
                Path fileCopy1 =  Files.copy(pathSource, pathDestination, StandardCopyOption.REPLACE_EXISTING);

            }catch (IOException e){
                e.printStackTrace();
            }



    }
}
