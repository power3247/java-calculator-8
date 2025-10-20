package calculator.domain;

import calculator.validator.Validator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Delimiters {
    private static final String CUSTOM_DELIMITER_PREFIX = "//";
    private static final String CUSTOM_DELIMITER_SUFFIX = "\\n";
    private static final String BASIC_DELIMITER_COMMA = ",";
    private static final String BASIC_DELIMITER_COLON = ":";

    private final Set<String> delimiters = new HashSet<>(List.of(BASIC_DELIMITER_COMMA, BASIC_DELIMITER_COLON));
    private final String inputText;


    private Delimiters(String inputText) {
        Validator.validateCustomDelimiterFormat(inputText);
        this.inputText = inputText;
    }

    public static Delimiters createDelimiters(String inputText) {
        Delimiters delimiters = new Delimiters(inputText);
        if (inputText.startsWith(CUSTOM_DELIMITER_PREFIX)) {
            delimiters.setCustomDelimiter();
        }
        return delimiters;
    }

    private void setCustomDelimiter() {
        String customDelimiter = extractCustomDelimiter();
        Validator.validateDelimiterNotEmpty(customDelimiter);
        delimiters.add(customDelimiter);
    }

    private String extractCustomDelimiter() {
        int startIndex = CUSTOM_DELIMITER_PREFIX.length();
        int suffixIndex = inputText.indexOf(CUSTOM_DELIMITER_SUFFIX);
        return inputText.substring(startIndex, suffixIndex);
    }

    public String getRegex() {
        return delimiters.stream().map(Pattern::quote).collect(Collectors.joining("|"));
    }
}
