
public class ToUpperCaseRule implements TransformerRule, CheckWord {

    public boolean check(String input) {
        return input.length() == 3;
    }
    public String transform(String string) {
        return string.toUpperCase();
    }

}
