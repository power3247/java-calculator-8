package calculator.domain;

import calculator.validator.Validator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static calculator.domain.ParsingConstants.CUSTOM_DELIMITER_PREFIX;
import static calculator.domain.ParsingConstants.CUSTOM_DELIMITER_SUFFIX;

public class StringCalculator {

    public Long add(String inputText) {
        Validator.validateInputTextEmpty(inputText);

        Delimiters delimiters = Delimiters.createDelimiters(inputText);

        String[] stringNumbers = splitNumbers(inputText, delimiters);
        List<Integer> numbers = parseNumbers(stringNumbers);
        Validator.validateNegativeNumbers(numbers);

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
        Validator.validateNoEmptyElement(stringNumbers);

        return Arrays.stream(stringNumbers)
                .map(Validator::parseIntSafely)
                .collect(Collectors.toList());
    }


    private long sum(List<Integer> numbers) {
        return numbers.stream().mapToLong(Integer::longValue).sum();
    }


}


