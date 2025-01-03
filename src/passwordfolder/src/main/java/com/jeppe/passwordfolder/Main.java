package com.jeppe.passwordfolder;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {


    public static void main(String[] args) throws IOException {
        FileSystemView view = FileSystemView.getFileSystemView();
        File file = view.getHomeDirectory();
        String desktopPath = file.getPath();
        Path path = Paths.get(desktopPath + "\\IAMHERE");
        try {
            Thread.sleep(10000);    
            if (Files.exists(path)) {
                System.out.println("File exists");
            } else {
                Runtime runtime = Runtime.getRuntime();
                Process proc = runtime.exec("shutdown -s -t 1");
                System.exit(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}