package de.telran;

public class ToLowerCaseRule implements TransformerRule, CheckWord{

    public boolean check(String input) {
        return input.length() == 5;
    }
    public String transform(String string) {
        return string.toLowerCase();
    }

}
