package calculator.validator;

import java.util.List;

public class Validator {
    private static final String CUSTOM_DELIMITER_PREFIX = "//";
    private static final String CUSTOM_DELIMITER_SUFFIX = "\\n";

    private Validator() {
    }

    public static void validateInputTextEmpty(String inputText) {
        if (inputText == null || inputText.isEmpty()) {
            throw new IllegalArgumentException("빈 문자열이나 공백은 입력값이 될수 없습니다");
        }
    }

    public static void validateNoEmptyElement(String[] stringNumbers) {
        for (String numberStr : stringNumbers) {
            if (numberStr.isEmpty()) {
                throw new IllegalArgumentException("빈 문자열이나 공백은 덧셈에 적합하지 않습니다.");
            }
        }
    }

    public static void validateNegativeNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            if (number < 0) {
                throw new IllegalArgumentException("음수는 허용되지 않습니다");
            }
        }
    }

    public static void validateCustomDelimiterFormat(String inputText) {
        if (inputText.startsWith(CUSTOM_DELIMITER_PREFIX) && !inputText.contains(CUSTOM_DELIMITER_SUFFIX)) {
            throw new IllegalArgumentException("커스텀 구분자 형식 오류: '//' 다음에는 '\\n'이 와야 합니다.");
        }
    }

    public static void validateDelimiterNotEmpty(String delimiter) {
        if (delimiter.isEmpty()) {
            throw new IllegalArgumentException("커스텀 구분자는 빈 문자열일 수 없습니다.");
        }
    }

    public static void validateDelimiterHasNoNumbers(String delimiter) {
        if (delimiter.matches(".*[0-9].*")) {
            throw new IllegalArgumentException("커스텀 구분자에는 숫자를 포함할 수 없습니다: " + delimiter);
        }
    }

}
