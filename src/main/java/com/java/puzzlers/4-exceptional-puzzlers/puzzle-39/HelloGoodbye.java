/**
 * 当线程被直接退出时候finally语句块中内容不会再执行
 */
public class HelloGoodbye {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                super.run();
                System.out.println("Goodbye world");
            }
        });

        try {
            System.out.println("Hello world");
            //停止当前线程和所有其他已经死亡的线程
            System.exit(0);
        } finally {
            System.out.println("Goodbye world");
        }
    }
}
