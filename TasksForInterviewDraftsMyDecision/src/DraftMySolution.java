public class DraftMySolution {
    public static void main(String[] args) {
        int n =1;

       System.out.println(minDigit(n));
    }

    public static int minDigit(int n){
        String s = String.valueOf(n);
        String result="0";
        int output =0;
        int length = s.length();

        //if (length >=1&&length<=9) return 0;
        if(length>1&&length<10) {
            for (int i = 0; i < length - 2; i++) {result = result + "0";}
            output=Integer.parseInt("1" + result);
        }
        if (length==10) output =1000000000;
        return  output;
    }
}
