package org.example;

public class LogManager {

    private AbstractLogger loggerChain;

    public LogManager(AbstractLogger loggerChain) {
        this.loggerChain = loggerChain;
    }

    public void logMessage(int level, String message) {
        loggerChain.logMessage(level, message);
    }

    public static AbstractLogger buildChain() {


        ConsoleLogger consoleLogger = new ConsoleLogger(1); // Info и выше
        FileLogger fileLogger = new FileLogger("log.txt", 2); // warn и error

        consoleLogger.setNextLogger(fileLogger);

        return consoleLogger;
    }
}
