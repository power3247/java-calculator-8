package calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class Delimiters {
    private static final String CUSTOM_DELIMITER_PREFIX = "//";
    private static final String CUSTOM_DELIMITER_SUFFIX = "\n";
    private static final String BASIC_DELIMITER_COMMA = ",";
    private static final String BASIC_DELIMITER_COLON = ":";

    private final List<String> delimiters = new ArrayList<>(List.of(BASIC_DELIMITER_COMMA, BASIC_DELIMITER_COLON));
    private final String inputText;

    private Delimiters(String inputText) {
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
    }

    private String extractCustomDelimiter() {
        return "";
    }

    public String getRegex() {
        return "";
    }
}
