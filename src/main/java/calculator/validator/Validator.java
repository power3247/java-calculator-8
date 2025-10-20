package calculator.validator;

import java.util.List;

public class Validator {

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

}
