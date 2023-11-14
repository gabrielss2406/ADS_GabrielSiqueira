package singleton;

/**
 * The LogManager class represents a singleton logger for logging information, errors, and warnings.
 *
 * This class follows the singleton design pattern, ensuring that only one instance of the LogManager is created
 * throughout the application.
 *
 * @author Gabriel Siqueira
 * @version 1.0
 */
public class LogManager {

    private static LogManager instance;

    /**
     * Private constructor to prevent instantiation from outside the class.
     */
    private LogManager() {}

    /**
     * Retrieves the instance of the LogManager, creating it if it doesn't exist.
     *
     * @return the LogManager instance
     */
    public static LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager();
        }
        return instance;
    }

    /**
     * Logs an information message.
     *
     * @param msg the information message to log
     */
    public void info(String msg) {
        System.out.println("info: " + msg);
    }

    /**
     * Logs an error message.
     *
     * @param msg the error message to log
     */
    public void error(String msg) {
        System.out.println("error: " + msg);
    }

    /**
     * Logs a warning message.
     *
     * @param msg the warning message to log
     */
    public void warn(String msg) {
        System.out.println("warn: " + msg);
    }
}
