/**
 * 本地变量声明语句不允许作为提交语句在for、while、或者do循环中重复执行
 */
public class Creator {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++)
            Creature creature = new Creature();
        //new Creature();
        System.out.println(Creature.numCreated());
    }
}

class Creature {
    private static long numCreated = 0;

    public Creature() {
        numCreated++;
    }

    public static long numCreated() {
        return numCreated;
    }
}
