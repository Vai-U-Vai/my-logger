package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        AbstractLogger chain = LogManager.buildChain();
        LogManager logger = new LogManager(chain);

        logger.logMessage(0, "This is an debug level information.");
        logger.logMessage(1, "This is an information.");
        logger.logMessage(2, "This is a warning information.");
        logger.logMessage(3, "This is an error information.");
    }
}