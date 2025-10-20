# 문자열 덧셈 계산기
## 구현할 기능 목록
- [x] 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환한다.
  - [x] 그 구분자를 활용해서 문자열을 구분해서 합구하기 StringCalculator.add()
    - [x] 숫자 문자열과 구분자를 받아 구분 StringCalculator.splitNumbers() 
    - [x] 구분된 문자열 배열을 정수형 리스트로 변환 StringCalculator.parseNumbers() 
    - [x] 숫자의 합을 구하기 StringCalculator.sum() 
- [x] 입력받은 문자열을 커스텀 구분자 부분과, 합할 숫자 부분을 나누기 StringCalculator.extractNumbersText()
커스텀 구분자는 문자열 앞부분의 "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용한다. Delimiters
  - [x] Delimiters 객체 생성, 각종상태표현, 좀더 명시적인 이름 Delimiters.createDelimiters()
  - [x] 입력받은 문자열 앞부분 에서 "//"와 "\n" 사이의 커스텀 구분자 추가 Delimiters.setCustomDelimiter()
  - [x] 구분자 리스트를 정규식 형태로 반환하는 기능 Delimiters.getRegex()
    - [x] 입력받은 문자열에서 커스텀 구분자 추출 Delimiters.extractCustomDelimiter()
  - [x] 커스텀 구분자를 저장한 리스트 Delimiters.delimiters
- [ ] 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다. Validator
  - [x] 사용자 입력자체가 빈 문자열이나 공백인경우 Validator.validateInputTextEmpty()
- [x] 입출력
  - [x] 입력
  - [x] 출력



