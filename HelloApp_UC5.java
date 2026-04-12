public class HelloApp_UC5 {
    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use StringBuilder to build comma-separated names
        StringBuilder names = new StringBuilder();

        // Enhanced for loop
        for (String name : args) {
            if (names.length() > 0) {
                names.append(", ");
            }
            names.append(name);
        }

        // Print final greeting
        System.out.println("Hello, " + names + "!");
    }
}


