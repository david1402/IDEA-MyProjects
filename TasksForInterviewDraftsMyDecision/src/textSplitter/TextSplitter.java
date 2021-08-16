package textSplitter;

import java.util.ArrayList;
import java.util.List;

public class TextSplitter {
    private List<String> dictionary;

    public TextSplitter(List<String> dictionary) {
        this.dictionary = dictionary;
    }


    public List<String> split(String text) throws CannotSplitStringException {
        int fromIndex = 0;
        int count = 0;
        List<String> divided = new ArrayList<>();
        for (int i = 0; i < dictionary.size(); i++) {
            if (text.contains(dictionary.get(i))) {
                divided.add(dictionary.get(i));
                while ((fromIndex = text.indexOf(dictionary.get(i), fromIndex)) != -1) {
                    count = count + dictionary.get(i).length();
                    fromIndex++;
                }

            }
        }

        if (count != text.length()) {
            throw new CannotSplitStringException("There are fremd words,not from the dictionary.Can't divide");
        }
        System.out.println(count);
        return divided;

    }
}




