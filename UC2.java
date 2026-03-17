public class HelloAppUC3 {
    public static void main(String[] args) {
        String name;

        // Check if user provided an argument
        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World"; // default value
        }

        // Print greeting
        System.out.println("Hello, " + name + "!");
    }
}