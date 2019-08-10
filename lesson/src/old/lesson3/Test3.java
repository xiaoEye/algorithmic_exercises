package old.lesson3;

import java.util.HashMap;
import java.util.Map;

public class Test3 {

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 0, 2, 5, 3};

        if (a.length <= 0 || a == null) {
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int length = a.length;
        int repeatNum = a[0];
        for (int i = 0; i < length; i++) {
            if (!map.containsKey(a[i])) {
                repeatNum = a[i];
                break;
            } else {
                map.put(a[i], a[i]);
            }
        }

        System.out.println(repeatNum);
    }
}
