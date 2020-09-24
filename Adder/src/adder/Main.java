package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (java.lang.NumberFormatException e) {
            System.err.println(e);
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        }
    }

    private static int addArguments(String[] args) {
        int res = 0;
        if (args.length >= 1) {
            for (int i = 0; i < args.length; i++) {
                res += Integer.valueOf(args[i]);
            }
        } else {
            throw new IllegalArgumentException("Not enough args");
        }
        return res;
    }
}
