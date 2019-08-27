/**
 * <p>Note that if the argument is equal to the value of
 * {@link Integer#MIN_VALUE}, the most negative representable
 * {@code int} value, the result is that same value, which is
 * negative.
 */
public class Mod {
    public static void main(String[] args) {
        // (-2^32)~(2^32-1)
        System.out.println(Math.abs(Integer.MIN_VALUE));

        final int MODULUS = 3;
        int[] histogram = new int[MODULUS];

        // Iterate over all ints (Idiom from Puzzle 25)
        int i = Integer.MIN_VALUE;
        do {
            histogram[Math.abs(i) % MODULUS]++;
        } while (i++ != Integer.MAX_VALUE);

        for (int j = 0; j < MODULUS; j++)
            System.out.println(histogram[j] + " ");
    }
}
