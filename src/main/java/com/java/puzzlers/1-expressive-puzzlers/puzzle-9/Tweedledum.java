/**
 * 当使用复合赋值操作符（+=、-=、*=、/=、%=、>>=、<<=、&=、^=、|=）时，会进行结果自动转型为左边变量类型；即
 * E1 op=E2 等价于 E1 =(T)(E1 op E2)其中T为E1的类型，除非E1只被计算一次
 */
public class Tweedledum {
    public static void main(String[] args) {
        // Put your declarations for x and i here
        short x = 0;
        int i = 123456;

        //结果： -7616
        x += i;     // Must be LEGAL 隐藏转型错误,丢失精度
        // x = x + i;  // Must be ILLEGAL 存在编译错误

        System.out.println(x);
    }
}
