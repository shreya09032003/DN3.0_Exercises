package WEEK1_DesignPattern.Singleton;

public class TestLogger {
    public static void main(String[] args) {
        // Get instances of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        // Verify that both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Logger instances are the same.");
        } else {
            System.out.println("Logger instances are different.");
        }
        
        // Test logging
        logger1.log("This is a test message.");
    }
}
