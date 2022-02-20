public class CommandLineArgument1 {
    public static void main(String[] args) {
        int number, max = 0;
        if (args.length <= 0) {
            System.out.println("Enter at least 1 integer. Try again.");
            System.exit(0);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
            number = Integer.parseInt(args[i]);
            if (number > max) {
                max = number;
            }
        }
        System.out.println("\n\nMax = " + max);

    }

}
