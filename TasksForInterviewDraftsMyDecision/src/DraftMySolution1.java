public class DraftMySolution1 {

    public static void main(String[] args) {
        int n = 1000000000;

        System.out.println(minDigit(n));
    }

    public static int minDigit(int n) {
        String s = String.valueOf(n);
        if( s.length()>1) return (int)(Math.pow(10, s.length()-1));
        return 0;

    }
}


