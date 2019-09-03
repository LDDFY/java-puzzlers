public class Greeter {
    public static void main(String[] args) {
        String greeting = "Hello world";
        for (int i = 0; i < greeting.length(); i++)
            //write 不会自动刷新
            System.out.write(greeting.charAt(i));

        // System.out.flush();
    }
}
