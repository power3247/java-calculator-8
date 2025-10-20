package calculator.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {
    private static final String CUSTOM_DELIMITER_PREFIX = "//";
    private static final String CUSTOM_DELIMITER_SUFFIX = "\\n";

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
        if (inputText.startsWith(CUSTOM_DELIMITER_PREFIX)) {
            int suffixIndex = inputText.indexOf(CUSTOM_DELIMITER_SUFFIX) + CUSTOM_DELIMITER_SUFFIX.length();
            return inputText.substring(suffixIndex);
        }
        return inputText;
    }

    private List<Integer> parseNumbers(String[] stringNumbers) {
        List<Integer> numbers = Arrays.stream(stringNumbers)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return numbers;
    }

    private int sum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }


}


