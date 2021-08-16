public class ToStarsRule implements TransformerRule, CheckWord {

    public boolean check(String input) {
        return input.length() == 3;
    }
    public String transform(String string) {
        String stars = "***";
        string = stars;
        return string;
    }
}
