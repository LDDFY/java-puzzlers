public class Strange1 {
    public static void main(String[] args) {
        try {
            Missing m = new Missing();
        } catch (java.lang.NoClassDefFoundError ex) {
            ex.printStackTrace();
            System.out.println("Got it!");
        }
    }
}
