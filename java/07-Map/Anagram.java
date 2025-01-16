import java.util.Map;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "bare";
        String s2 = "bear";
        System.out.println(checkAnagram(s1, s2));

    }

    public static boolean checkAnagram(String s1, String s2) {
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            mp.put(s1.charAt(i), i);
        }
        for (int j = 0; j < s2.length(); j++) {
            if (!mp.containsKey(s2.charAt(j))) {
                return false;
            } else
                continue;
        }
        return true;
    }
}
