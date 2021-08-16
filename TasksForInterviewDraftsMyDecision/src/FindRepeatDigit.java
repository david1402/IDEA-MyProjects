public class FindRepeatDigit {
    public static void main(String[] args) {

        int N = 2;
        int[] nArr = {1,2,2,1,1};
        System.out.println(findDouble(nArr));
    }

    public static int findDouble(int[] arr) {
        for (int j=0;j<arr.length;j++){
        for (int i = j; i < arr.length-1; i++) {
            if (arr[j] == arr[i+1]) {
                  return arr[j];
            }
                 }

            }
        return -1;
        }

    }

