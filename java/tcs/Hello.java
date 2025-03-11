import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Hello {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);

        al.set(2, 10);

        System.out.println(al.get(2));
        Collections.sort(al, Collections.reverseOrder());

        Collections.frequency(al, 3);
        Collections.addAll(al, 2, 2, 2, 2);

        Collections.Integer[] arr = al.toArray(new Integer[0]);

        // Arrays.asList(al);
        // System.out.println();
        // for (Integer ele : al) {
        // System.out.println(ele);
        // }
    }
}