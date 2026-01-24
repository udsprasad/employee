package com.example.employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EmployeeApplication {

	public static void main(String[] args) {

        // create a file
		Path path = Paths.get("output/text.json");

        try {
            // important use createDirectories instead of createDirectory
            Files.createDirectories(path.getParent());
            if (Files.notExists(path)) {
                Files.createFile(path);
                System.out.println("if");
            } else {
                Files.deleteIfExists(path);
                Files.createFile(path);
                System.out.println("else");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
