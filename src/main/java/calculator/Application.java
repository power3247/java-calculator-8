package calculator;

import calculator.domain.StringCalculator;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        String inputText = readLine();
        StringCalculator calculator = new StringCalculator();
        int answer = calculator.add(inputText);
        System.out.println("결과 : " + answer);
    }
}
