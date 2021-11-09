import java.util.*;

public class Main {
    public static char first_non_repeating_letter(String m) {
        String newstr = m.toLowerCase(Locale.ROOT);
        Map<Object, int[]> obj = new HashMap<Object, int[]>();
        for (int i = 0; i < newstr.length(); i++) {
            char element = newstr.charAt(i);
            if(!obj.containsKey(element)) {
                int[] arr = {i, 1};
                obj.put(element, arr);
            } else {
                int[] arr = obj.get(element);
                int[] newArr = {arr[0], ++arr[1]};
                obj.replace(element, newArr);
            }
        }
        for (int i = 0; i < newstr.length(); i++) {
            char element = newstr.charAt(i);
            if (obj.get(element)[1] == 1) {
                return m.charAt(i);
            }
        }
        return '!';
    }
    public static void main(String[] args) {
        String m = "sTreSS";
        System.out.println(first_non_repeating_letter(m));
    }
}