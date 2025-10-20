package calculator.validator;

public class Validator {

    private Validator() {}
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
}
