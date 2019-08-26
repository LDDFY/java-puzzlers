public class GhostOfLooper {
    public static void main(String[] args) {
        // Place your declaration for i here

        // long i = -1;//-1L has all 64 bites set
        short i = -1;
        while (i != 0) {
            i >>>= 1;
            System.out.println(Long.toBinaryString(i));
        }
    }
}
