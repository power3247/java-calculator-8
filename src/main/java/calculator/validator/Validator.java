package calculator.validator;

public class Validator {
    public static void validateInputTextEmpty(String inputText) {
        if (inputText == null || inputText.trim().isEmpty()) {
            throw new IllegalArgumentException("빈 문자열이나 공백은 입력값이 될수 없습니다");
        }
    }
}
