package de.telran;

public interface TransformerRule {

    String transform(String string);

    boolean check(String s);
}
