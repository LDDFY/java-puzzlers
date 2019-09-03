public class BeerBlast {
    static final String COMMAND = "java BeerBlast slave";

    public static void main(String[] args) throws Exception {
        if (args.length == 1 && args[0].equals("slave")) {
            for (int i = 99; i > 0; i--) {
                System.out.println(i + " bottles of beer on the wall");
                System.out.println(i + " bottles of beer");
                System.out.println("You take one down, pass it around,");
                System.out.println((i - 1) + " bottles of beer on the wall");
                System.out.println();
            }
        } else {
            // Master

            /**
             *由于某些本地平台只提供有限大小的缓冲，所以如果未能迅速的读取子进程的输出流，就有可能会导致子进程的阻塞甚至死锁
             */
            Process process = Runtime.getRuntime().exec(COMMAND);
            int exitValue = process.waitFor();
            System.out.println("exit value = " + exitValue);
        }
    }
}
