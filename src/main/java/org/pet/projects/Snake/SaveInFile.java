package org.pet.projects.Snake;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class SaveInFile {
    public static String path = "src/main/resources/saves/saves.txt";

    static void writeWithCreatingFolder(final String name, final int score, final LocalDate date) throws IOException {
        final String path = createDirectory();
        try (final FileWriter fileWriter = new FileWriter(path, true)) {
            fileWriter.write("\n" + "name:" + name + " score:" + score + " date:" + date);
        } catch (IOException exception) {
            System.err.println("Error with FileWriter❌");
        } finally {
            System.out.println("Record completed✅");
        }
    }

    private static String createDirectory() throws IOException {

        final Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) {
            Files.createDirectories(pathToFile.getParent());
        }
        return path;
    }

}
