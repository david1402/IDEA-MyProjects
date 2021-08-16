package textSplitter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> dict = Arrays.asList("d","b", "the","adfdr","a","fish","asdfghz");
        TextSplitter textSplitter = new TextSplitter(dict);
        try {
           System.out.println(textSplitter.split("fishbthethefishathe")) ;
            }
         catch (CannotSplitStringException e) {
            System.out.println(e.getMessage());
        }
    }
}
