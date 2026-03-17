public class HelloAppUC2 {
    public static void main(String[] args) {
        
        // Check if command-line argument is provided
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello " + name);
        } 
        else {
            System.out.println("Please provide your name as a command-line argument.");
        }
    }
}
