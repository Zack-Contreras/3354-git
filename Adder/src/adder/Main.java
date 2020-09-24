package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide a list of integers to add");
        }
    }

    private static int addArguments(String[] args) {
        int res = 0;
        for (int i = 0; i < args.length; i++) {
            res += Integer.valueOf(args[i]);
        }
        return res;
    }
}
