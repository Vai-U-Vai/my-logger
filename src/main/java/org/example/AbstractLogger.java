package org.example;

public abstract class AbstractLogger implements Logger {

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public abstract void logMessage(int level, String message);

    @Override
    public void info(String message) {
        logMessage(1, message);
    }

    @Override
    public void warn(String message) {
        logMessage(2, message);
    }

    @Override
    public void error(String message) {
        logMessage(3, message);
    }

    @Override
    public void debug(String message) {
        logMessage(0, message);
    }
}
