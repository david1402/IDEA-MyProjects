import java.util.Arrays;

public class FindrepeatDigit1 {

    public static void main(String[] args) {

        int N = 2;
        int[] nArr = {1,5,4,5,6};
        System.out.println(findDouble(nArr));
    }

    public static int findDouble(int[] arr) {
        Arrays.sort(arr);

            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] == arr[i+1]) {
                    return arr[i];
                }
            }
        return -1;
        }

    }


