public class Main {

    public static void main(String[] args) {
        String input = "Big BROWN fox";
        TransformerRule rule = new ToLowerCaseRule();
        String output = transform(input, rule);
        String expected = "Big brown fox";

        System.out.println(expected.equals(output));
        System.out.println(input);
        System.out.println(output);


        String input2 = "Big brown fox";
        TransformerRule rule2 = new ToUpperCaseRule();
        String output2 = transform(input2, rule2);
        String expected2 = "BIG brown FOX";

        System.out.println(expected2.equals(output2));
        System.out.println(input2);
        System.out.println(output2);


        String input3 = "Big BRown fox";
        TransformerRule rule3 = new ToLowerCaseRule();
        String output3 = transform(input3, rule3);
        String expected3 = "Big brown fox";

        System.out.println(expected3.equals(output3));
        System.out.println(input3);
        System.out.println(output3);




        String input4 = "Big brown fox";
        TransformerRule rule4 = new ToStarsRule();
        String output4 = transform(input4, rule4);
        String expected4 = "*** brown ***";

        System.out.println(expected4.equals(output4));
        System.out.println(input4);
        System.out.println(output4);
    }


    public static String transform (String sentence, TransformerRule rule){
        String[] word = sentence.split(" ");
        for (int i = 0; i < word.length; i++) {
            if (rule.check(word[i])) {
                word[i] = rule.transform(word[i]);
            }
        }
        return String.join(" ", word);
    }

}


