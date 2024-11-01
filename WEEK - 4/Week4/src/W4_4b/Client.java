package W4_4b;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        // Setup chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create logger
        Logger logger = new Logger();

        while (true) {
            System.out.print("Enter log level (INFO, DEBUG, ERROR): ");
            String logLevelStr = scanner.next();
            LogLevel logLevel = LogLevel.valueOf(logLevelStr.toUpperCase());

            System.out.print("Enter log message: ");
            String message = scanner.next();

            // Create command
            Command command = new LogCommand(getHandler(logLevel, infoHandler), logLevel, message);

            // Add command to logger
            logger.addCommand(command);

            System.out.print("Do you want to add another log message? (y/n): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("n")) {
                break;
            }
        }

        // Execute commands
        logger.executeCommands();
    }

    private static LogHandler getHandler(LogLevel logLevel, LogHandler handler) {
        switch (logLevel) {
            case INFO:
                return new InfoHandler();
            case DEBUG:
                return new DebugHandler();
            case ERROR:
                return new ErrorHandler();
            default:
                return handler;
        }
    }
}