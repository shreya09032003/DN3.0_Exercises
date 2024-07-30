package WEEK1_DesignPattern.Singleton;

public class Logger {
    // Private static instance of the class
    private static Logger instance;
    
    // Private constructor to prevent instantiation
    private Logger() { }
    
    // Public static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    // Example method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
