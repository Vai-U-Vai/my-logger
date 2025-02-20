package org.example;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class FileLogger extends AbstractLogger {

    private String filePath;
    private int level;

    public FileLogger(String filePath, int level) {
        this.filePath = filePath;
        this.level = level;
    }

    @Override
    public void logMessage(int level, String message) {
        if (this.level <= level) {
            logToFile("[File] " + message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
    private void logToFile(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.append(message);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
