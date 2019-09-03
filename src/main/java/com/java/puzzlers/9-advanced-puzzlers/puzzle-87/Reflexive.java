public class Reflexive {
    public static void main(String[] args) throws Exception {
        /*
         * If you can come up with a primitive type and value
         * that causes this program to print "false", then
         * you have proven that the == operator is not reflexive.
         */
        System.out.println(Double.NaN == Double.NaN);
        System.out.println(Float.NaN == Float.NaN);
    }
}
