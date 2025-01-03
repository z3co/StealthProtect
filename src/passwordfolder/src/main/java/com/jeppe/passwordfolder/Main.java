package com.jeppe.passwordfolder;

import java.io.IOException;
import java.nio.file.Files;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        FileSystemView view = FileSystemView.getFileSystemView();
        File file = view.getHomeDirectory();
        String desktopPath = file.getPath();
        Path path = Paths.get(desktopPath + File.separator + "IAMHERE");

        try {
            // Sleep for 10 seconds
            Thread.sleep(10000);
            
            // Check if the folder exists
            if (Files.exists(path)) {
                System.out.println("File exists");
            } else {
                // Attempt to shut down the system
                Runtime runtime = Runtime.getRuntime();
                Process proc = runtime.exec("shutdown -s -t 1");
                proc.waitFor();  // Wait for the shutdown process to complete
                System.exit(0);
            }
        } catch (InterruptedException e) {
            System.err.println("Sleep interrupted: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO Exception: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}