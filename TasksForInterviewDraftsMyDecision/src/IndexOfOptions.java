public class IndexOfOptions {
    public static void main(String[] args) {
        String string = "indexbitchfghhindexghjkrotindexi";
        String substr ="index";
        int i = string.indexOf('i');
        System.out.println(i);

        int i1 = string.indexOf('i',1);
        System.out.println(i1);

      int  fromIndex=0;
      int i2=0;
        while ((fromIndex=string.indexOf('i',fromIndex))!=-1) {
            System.out.println(fromIndex);
            fromIndex++;
        }

        System.out.println("____________NOW SUBSTRINGS");

        int i3 = string.indexOf(substr);
        System.out.println(i3);

        int i4=string.indexOf(substr,1);
        System.out.println(i4);

        int fromIndex1=0;
        while((fromIndex1=string.indexOf(substr,fromIndex1))!=-1){
            System.out.println(fromIndex1);
            fromIndex1++;

        }

        System.out.println("*******NOW lastIndexOf");
        String string1 = "indexbitchfghhindexghjkrotindexigkg";
        String substr1 ="index";

        int i5 = string1.lastIndexOf(substr1);
        System.out.println(i5);

        int i6=string.lastIndexOf(substr,25);
        System.out.println(i6);

        int fromIndex2=string.length()-1;
        while ((fromIndex2=string1.lastIndexOf(substr,fromIndex2))!=-1){
            System.out.println(fromIndex2);
            fromIndex2--;
        }
        int fromIndex3 = string.length()-1;
        while ((fromIndex3=string1.lastIndexOf('i',fromIndex3))!=-1){
            System.out.println("last index char "+fromIndex3);
            fromIndex3--;

        }


    }
}
