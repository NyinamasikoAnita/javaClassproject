public class Exception_OddNumber {
    public static void trynumber(int n) {
        try {
            if (n % 2 != 0) {
                System.out.println(n + " is even.");
            } else {
                System.out.println(n + " is odd.");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int n = 18;
        trynumber(n);
        n = 7;
        trynumber(n);
    }

}
