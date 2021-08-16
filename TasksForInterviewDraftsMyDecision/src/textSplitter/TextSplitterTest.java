package textSplitter;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class TextSplitterTest {

    private  TextSplitter textSplitter;


@Test
public void canDivide ()throws CannotSplitStringException{
    List<String> dict = Arrays.asList("d","b", "the","adfdr","a","fish","asdfghz");
    textSplitter=new TextSplitter(dict);
    assertEquals(Arrays.asList("the","a","fish"), textSplitter.split("thefisha"));

}


@Test(expected = CannotSplitStringException.class)
public void cannotDivide()throws Exception{
    List<String> dict = Arrays.asList("b","the","fish");
    textSplitter=new TextSplitter(dict);
    textSplitter.split("thefisha");



}


}
