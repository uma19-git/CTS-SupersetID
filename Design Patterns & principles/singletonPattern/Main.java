public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Start the app...");

        Logger logger2 = Logger.getInstance();
        logger2.log("App is running...");

        System.out.println("Are both same? " + (logger1 == logger2));
    }
}