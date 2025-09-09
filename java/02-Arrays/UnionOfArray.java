import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfArray {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        Set<Integer> s = new TreeSet<>();

        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }

        for (int j = 0; j < b.length; j++) {
            s.add(b[j]);
        }

        return new ArrayList<Integer>(s);
    }
}
