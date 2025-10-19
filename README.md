# 문자열 덧셈 계산기
## 구현할 기능 목록
- [ ] 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환한다.
  - [ ] 쉼표, 콜론 구분자 저장용 자료 Delimiter
  - [ ] 그 구분자를 활용해서 문자열을 구분해서 쪼개기 NumericStringParser
    - [ ] 숫자+구분자 문자열을 구분후 정수형 배열로 반환 NumericStringParser.stringSpliter()
  - [ ] 문자열 타입의 숫자를 정수형으로 변환 Numbers.stringToNumber()
  - [ ] 숫자의 합을 구하기 Numbers.sum()
- [ ] 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 
커스텀 구분자는 문자열 앞부분의 "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용한다. Delimiters
  - [ ] 입력받은 문자열을 커스텀 구분자 부분과, 합할 숫자 부분을 나누기 Delimiters.splitCustomDelimiter()
    - [ ] 입력받은 문자열 앞부분 에서 "//"와 "\n" 사이의 문자(커스텀 구분자) 파악및 저장 Delimiters.findCustomDelimiter()
  - [ ] 커스텀 구분자를 쉼표와 콜론과 함께 구분자가 저장된 자료구조에 저장 Delimiters.delimiters[]
- [ ] 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.
  - [ ] 올바른 값인지 체크
  - [ ] 잘못된 값 정의 (값의 정의)
- [ ] 입출력
  - [ ] 입력
  - [ ] 출력



