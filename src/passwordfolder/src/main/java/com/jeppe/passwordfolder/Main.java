package com.jeppe.passwordfolder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {


    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Jeppe\\Desktop\\Jeppe");
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