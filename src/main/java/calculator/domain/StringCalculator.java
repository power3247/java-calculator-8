package calculator.domain;

import java.util.List;

public class StringCalculator {
    private static final String CUSTOM_DELIMITER_PREFIX = "//";
    private static final String CUSTOM_DELIMITER_SUFFIX = "\n";

    public int add(String inputText) {
        Delimiters delimiters = Delimiters.createDelimiters(inputText);

        String[] stringNumbers = splitNumbers(inputText, delimiters);
        List<Integer> numbers = parseNumbers(stringNumbers);

        return sum(numbers);
    }

    private String[] splitNumbers(String inputText, Delimiters delimiters) {
        String extractedNumbersText = extractNumbersText(inputText);
        String regex = delimiters.getRegex();
        return extractedNumbersText.split(regex);
    }
    private String extractNumbersText(String inputText) {
        return "";
    }
    private List<Integer> parseNumbers(String[] stringNumbers) {
        return null;
    }

    private int sum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }


}


