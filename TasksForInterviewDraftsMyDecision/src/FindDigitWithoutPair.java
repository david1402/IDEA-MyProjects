import java.util.HashMap;
import java.util.Map;

public class FindDigitWithoutPair {
    //there is an odd array of integers 2n+1 length. All but one digits are pairs.Find the one that does not have a pair.
    //2,2,5,5,130;  2,2,2 ;  2,2,2,2,5

      public  int findSingle(int[] ints) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < ints.length; i++) {
            if (map.containsKey(ints[i])) {
                map.put(ints[i], map.get(ints[i]) + 1);

            } else {
                map.put(ints[i], 1);

            }
        }
             for (Map.Entry<Integer, Integer> entry : map.entrySet())
                if (entry.getValue() % 2 != 0) return entry.getKey();
        return -1;
        }


    }



