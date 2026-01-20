package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class test {

    public static void main(String[] args) throws IOException {
       Path dir = Paths.get("C:\\project");

        Files.createDirectories(dir);

        Path file = dir.resolve("data.txt");

        if(Files.notExists(file)){
            Files.createFile(file);
        }

        System.out.println(file.toString());
        System.out.println(Files.size(file));
    }

}

