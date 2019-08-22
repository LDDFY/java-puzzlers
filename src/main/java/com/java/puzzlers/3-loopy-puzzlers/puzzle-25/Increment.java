public class Increment {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++)
            j = j++;
        System.out.println(j);

        /**
         * j = j++:
         *
         * int tem=j
         * j=j+1;
         * j=temp;
         */
    }
}
