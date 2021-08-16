package repeat_myself;

public class StringsInvertedMyself {

    public String invertString (String str){
        char[] chars = str.toCharArray();
        for (int i=0; i<chars.length;i++){
            if(Character.isLowerCase(chars[i])){
                chars[i]= Character.toUpperCase(chars[i]);
            }
            else if (Character.isUpperCase(chars[i])){
                chars[i]=Character.toLowerCase(chars[i]);
            }

        }
        return  new String(chars);
    }
}
