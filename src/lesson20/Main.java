package lesson20;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String sourses = "C:\\Users\\user\\IdeaProjects\\MyFirstProject1\\resourses\\tx.txt";
        String direction = "C:\\Users\\user\\IdeaProjects\\MyFirstProject1\\resourses\\tx5.txt";
//        FileCopyNIO fileCopy = new FileCopyNIO();
//
//        try {
//            fileCopy.copyFile(sourses,direction);
//        } catch (FileCopyFailedException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        FileCopyStream fileCopy1 = new FileCopyStream();
        try {
            fileCopy1.copyFile(sourses,direction);
        } catch (FileAlreadyExistsException e) {
            System.out.println("Файл уже существует");
        }catch (FileCopyFailedException e) {
            System.out.println("Файл не удалось скопировать");
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileCopyChannel fileCopyChannel = new FileCopyChannel();
        try {
            fileCopyChannel.copyFile(sourses,direction);
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileCopyJava7 fileCopyUtilsLib = new FileCopyJava7();
        try {
            fileCopyUtilsLib.copyFile(sourses,direction);
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
