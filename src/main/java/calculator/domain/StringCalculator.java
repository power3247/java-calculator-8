package calculator.domain;

import java.util.List;

public class StringCalculator {
    public int add(String text) {
        Delimiters delimiters = new Delimiters(text);

        String[] stringNumbers = splitNumbers(text, delimiters);
        List<Integer> numbers = parseNumbers(stringNumbers);

        return sum(numbers);
    }

    private String[] splitNumbers(String numbersText, Delimiters delimiters) {
        return null;
    }

    private List<Integer> parseNumbers(String[] stringNumbers) {
        return null;
    }

    private int sum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
}


