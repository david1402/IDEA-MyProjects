package tasks;
//return min from any integer till 1000000000 inclusive.
// 0-10 -return 0; 10-99 -return min (i.e. 10), 100-999, 1000 -9999. for 1 000 000 000 return 1 000 000 000.
public class MinTenDegree {

    public int getTenDegree(int n) {
        String nString = Integer.toString(n);

        int length = nString.length();

        if (length == 1)
            return 0;

        return (int) Math.pow(10, length - 1);

    }
}
