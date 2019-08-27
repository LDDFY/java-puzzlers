import java.util.HashSet;
import java.util.Set;

/**
 * 重写equals后需要重写hashCode方法，否则将使用Object中的hashCode 方法
 */
public class Name2 {
    private String first, last;

    public Name2(String first, String last) {
        this.first = first;
        this.last = last;
    }

    //equals(Object o)
    public boolean equals(Name2 n) {
        return n.first.equals(first) && n.last.equals(last);
    }

    public int hashCode() {
        return 31 * first.hashCode() + last.hashCode();
    }

    public static void main(String[] args) {
        Set<Name2> s = new HashSet<Name2>();
        s.add(new Name2("Donald", "Duck"));
        System.out.println(
                s.contains(new Name("Donald", "Duck")));
    }
}
