import java.util.HashSet;
import java.util.Set;

/**
 * 重写equals后需要重写hashCode方法，否则将使用Object中的hashCode 方法
 */
public class Name {
    private String first, last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Name))
            return false;
        Name n = (Name) o;
        return n.first.equals(first) && n.last.equals(last);
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Name)) return false;
//
//        Name name = (Name) o;
//
//        if (!first.equals(name.first)) return false;
//        return last.equals(name.last);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = first.hashCode();
//        result = 31 * result + last.hashCode();
//        return result;
//    }


    public static void main(String[] args) {
        Set<Name> s = new HashSet<Name>();
        s.add(new Name("Mickey", "Mouse"));
        System.out.println(
                s.contains(new Name("Mickey", "Mouse")));
    }
}
