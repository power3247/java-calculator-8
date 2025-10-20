package calculator;

import calculator.domain.StringCalculator;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String inputText = readLine();
        StringCalculator calculator = new StringCalculator();
        Long answer = calculator.add(inputText);
        System.out.println("결과 : " + answer);
    }
}
