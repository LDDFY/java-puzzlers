public class MyThing extends Thing {
    private final int arg;

    /*
     * This constructor is illegal. Rewrite it so that it has the same
     * effect but is legal.
     */
    public MyThing() {
        //  super(arg=(int) System.currentTimeMillis());
        this((int) System.currentTimeMillis());
    }

    private MyThing(int i) {
        super(i);
        arg = i;
    }
}
