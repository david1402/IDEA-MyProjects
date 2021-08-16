package repeat_myself;




public class ReversedStringMyself {




    public  String reverseString (String str){
        StringBuilder sb = new StringBuilder(str);
      System.out.print(sb.reverse());
        return sb.toString();

    }
}
