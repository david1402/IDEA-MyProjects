package repeat_myself;

public class CycleMyself {

    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ACB";
        System.out.println(isRotation(str1,str2));

    }
    public static boolean isRotation(String s,String s1){
        boolean flag = true;
    if (s.length()!=s1.length()) return !flag;
    String sum = s + s;
    if (sum.contains(s1)) {return flag;}
    return !flag;


}}

