package org.example;

public class ConsoleLogger extends AbstractLogger {

    private int level; // Уровень, выше которого этот логгер будет обрабатывать сообщения

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    public void logMessage(int level, String message) {
        if (this.level <= level) {
            System.out.println("Console::" + message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
}
