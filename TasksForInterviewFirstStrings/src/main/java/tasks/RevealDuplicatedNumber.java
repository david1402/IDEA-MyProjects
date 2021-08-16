package tasks;
//there is integer array of N. the elements can be digits from 1 to N+1. so one digit is encounted twice.Find it
import java.util.Arrays;

public class RevealDuplicatedNumber {
    public int reveal(int... numbers) {
        int length = numbers.length;

        if (length == 0)
            throw new WrongInputError();

        for (int number : numbers)
            if (number >= length || number < 0)
                throw new WrongInputError();

        Arrays.sort(numbers);

        int prev = 0;

        for (int number : numbers) {
            if (number == prev)
                return prev;
            prev = number;
        }

        return 0;
    }
}
