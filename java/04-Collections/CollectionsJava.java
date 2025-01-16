import java.util.ArrayList;

public class CollectionsJava {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("vipul");
        list.add(1, "bhavesh");
        list.remove(1);
        list.get(0);
        System.out.print(list);
    }
}