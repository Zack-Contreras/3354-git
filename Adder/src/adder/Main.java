package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private static int addArguments(String[] args) {
        int res = 0;

        if (args[0].contains("-")) {
            for (int i = 1; i < args.length; i++) {
                res -= Integer.valueOf(args[i]);
            }
        } else {
            for (int i = 0; i < args.length; i++) {
                res += Integer.valueOf(args[i]);
            }
        }
        return res;
    }
}
