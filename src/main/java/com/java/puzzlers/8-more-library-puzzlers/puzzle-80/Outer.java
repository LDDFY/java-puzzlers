public class Outer {
    public static void main(String[] args) throws Exception {
        new Outer().greetWorld();
    }

    private void greetWorld() throws Exception {
        // 1. Constructor constructor = Inner.class.getConstructor(Outer.class);
        //    System.out.println(constructor.newInstance(Outer.this));
        System.out.println(Inner.class.newInstance());
    }

    public /* 2. static*/ class Inner {
        public String toString() {
            return "Hello world";
        }
    }
}
