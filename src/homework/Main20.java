package homework;

import lesson20.FileAlreadyExistsException;
import lesson20.FileCopyChannel;
import lesson20.FileCopyFailedException;
import lesson20.FileCopyJava7;
import lesson20.FileCopyNIO;
import lesson20.FileCopyStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        String sourses = "C:\\Users\\zimny\\myFirstProject\\resourses\\tx.txt";
//        String direction = "C:\\Users\\zimny\\myFirstProject\\resourses\\tx1.txt";
        lesson20.FileCopyNIO fileCopyNIO = new FileCopyNIO();


        try {
            fileCopyNIO.copyFile("resourses/tx.txt", "resourses/tx1.txt");
        } catch (lesson20.FileCopyFailedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        lesson20.FileCopyStream fileCopy1 = new FileCopyStream();
        try {
            fileCopy1.copyFile("resourses/tx.txt", "resourses/tx2.txt");
        } catch (FileAlreadyExistsException e) {
            System.out.println("Файл уже существует");
        } catch (lesson20.FileCopyFailedException e) {
            System.out.println("Файл не удалось скопировать");
        } catch (IOException e) {
            e.printStackTrace();
        }

        lesson20.FileCopyChannel fileCopyChannel = new FileCopyChannel();
        try {
            fileCopyChannel.copyFile("resourses/tx.txt", "resourses/tx3.txt");
        } catch (lesson20.FileCopyFailedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        lesson20.FileCopyJava7 fileCopyUtilsLib = new FileCopyJava7();
        try {
            fileCopyUtilsLib.copyFile("resourses/tx.txt", "resourses/tx4.txt");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
