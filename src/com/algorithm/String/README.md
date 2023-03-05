# String(문자열)

--- 

## 1.문자 찾기([FindString.class](https://github.com/90mansik/codingTest-inflearn/blob/master/src/com/algorithm/String/FindString.java))
- 입력
  - 첫번째 줄 입력 : 검색할 문자열
  - 두번째 줄 입력 : 찾고자 하는 문자
- 출력 : 찾고자 하는 문자의 갯수
- 제한조건 : 대소문자는 구별하지 않음

> #입력  
> Tomato  
> t    
>
> #출력  
> 2

## 2.대소문자 변환([CaseConversion.java](https://github.com/90mansik/codingTest-inflearn/blob/master/src/com/algorithm/String/CaseConversion.java))
- 입력 : 대소문자가 같이 존재하는 문자열
- 출력 : 대문자는 소문자로, 소문자는 대문자로 변환된 문자열 출력
- 제한조건 
  - 문자열의 길이는 100을 넘지 않음
  - 문자열은 영어 알파벳으로 구성
> #입력  
> AlgoRithM  
>
> #출력
> aLGOrITHm


## 3.문장 속 단어([IndexOfString.java](https://github.com/90mansik/codingTest-inflearn/blob/master/src/com/algorithm/String/IndexOfString.java))
- 입력 : 공백이 존재하는 문자열
- 출력 : 입력받은 문자열에 공백을 구분하여 가장 긴 단어를 출력
> #입력  
> it is time to study  
> #출력  
> study


## 4.단어 뒤집기([ReverseString.java](https://github.com/90mansik/codingTest-inflearn/blob/master/src/com/algorithm/String/ReverseString.java))
- 입력
  - 첫번째 줄 입력 : 입력받을 알파벳 문자열의 횟수
  - 두번째 줄부터 입력 : 문자를 뒤집을 문자열
- 출력 : N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력
> #입력  
> 3  
> good  
> Time  
> Big  
> #출력  
> doog  
> emiT  
> eiB

## 5.특정 문자 뒤집기([ReverseString2.java](https://github.com/90mansik/codingTest-inflearn/blob/master/src/com/algorithm/String/ReversString2.java))
- 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, <br>
특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성
- 입력 : 길이가 100을 넘지 않는 문자열
- 출력 : 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
>#입력 </br>
> a#b!GE*T@S </br>
>#출력 </br>
> S#T!EG*b@a

## 6.중복문자제거
- 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램 </br>
  중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지
- 입력 : 문자열 입력, 길이는 100을 넘지 않음
- 출력 : 중복 문자가 제거된 문자열 출력
>#입력 </br>
> ksekkset </br>
>#출력 </br>
> kset


## 7. 회문 문자열([PalindromeCheck.java](https://github.com/90mansik/codingTest-inflearn/blob/master/src/com/algorithm/String/PalindromeCheck.java))
- 입력된 문자열이 회문 문자열이면 "YES", 아니면 "NO"를 출력하는 프로그램 </br>
- 제한조건 : 회문 검사 시 대소문자를 구분 하지 않음
- 입력 : 길이 100을 넘지 않는 공백 없는 문자열
- 출력 : 문자열이 회문이면 YES, 아니면 NO
>#입력 </br>
> gooG </br>
> #출력 </br>
> YES


## 8. 유효한 팰린드롬([PalindromeCheck.java](https://github.com/90mansik/codingTest-inflearn/blob/master/src/com/algorithm/String/PalindromeCheck.java))
- 입력된 문자열이 팰린드롬이면 YES, 아니면 NO를 출력
- 제한조건 : 알파벳만 가지고 회문을 검사, 대소문자 구분 X
- 입력 : 길이 100을 넘지 않는 공백이 없는 문자열
- 출력 : 문자열이 팰린드롬이면 YES, 아니면 NO
>#입력 </br>
> found7, time: study; Yduts; emit, 7Dnuof </br>
>#출력 </br>
> YES


## 9. 숫자만 추출([FindOnlyNumbers.java](https://github.com/90mansik/codingTest-inflearn/blob/master/src/com/algorithm/String/FindOnlyNumbers.java))
- 문자와 숫자가 섞여있는 문자열이 주어지면 숫자만 추출하여 순서대로 자연수를 만듬
- 0, 1, 2, 0 ,5를 추출 시 자연수 1205를 출력
- 제한조건 : 추출한 자연수는 100,000,000을 넘지 않는다.
- 입력 : 숫자가 섞인 문자열, 문자열 길이는 100 이하
- 출력 : 자연수 출력
>#입력 </br>
>g0en2T0s8eSoft </br>
>#출력 </br>
>208

## 10. 가장 짧은 문자거리([FindShortDistance.java](https://github.com/90mansik/codingTest-inflearn/blob/master/src/com/algorithm/String/FindShortDistance.java))
- 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성
- 입력 : 문자열 s, 문자 t
- 제한조건 : 문자열과 문자는 소문자로만 주어짐, 길이는 100 이하
- 출력 : 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력
>#입력 </br>
> teachermode e </br>
>#출력 </br>
> 1 0 1 2 1 0 1 2 2 1 0 </br>

## 11. 문자열 압축([]())
- 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
  문자 바로 오른쪽에 반복 회수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
  단 반복횟수가 1인 경우 생략 합니다.
- 제한조건 : 길이는 100 이하
- 입력 : 알파벳 대문자로 이루어진 문자열
- 출력 : 반복 회수가 추가된 문자열
>#입력1 </br>
>KKHSSSSSSSE </br>
> #출력1 </br>
> K2HS7E
> #입력2 </br>
> KSTTTSEEKFKKKDJJGG </br>
> #출력2 </br>
> KST3SE2KFK3DJ2G2

## 12. 암호 
- 입력 : 첫 줄에는 보낸 문자의 개수(10을 넘지 안습니다)가 입력된다. 다음 줄에는 문자의 개수의 일곱 배 만큼의 #또는 * 신호가 입력됩니다. </br>
- 출력 : 영희가 해석한 문자열을 출력합니다.
- 현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.
비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있습니다. </br>
비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있습니다. </br>
만약 현수가 “#*****#”으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과 같이 해석합니다.

   1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.
   2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.
   3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.
   참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가하여 ‘Z'는 90번입니다.
   4.현수가 4개의 문자를 다음과 같이 신호로 보냈다면

  #****###**#####**#####**##**

  이 신호를 4개의 문자신호로 구분하면

  #****## --> 'C' </br>
  #**#### --> 'O' </br>
  #**#### --> 'O' </br>
  #**##** --> 'L' </br>
  최종적으로 “COOL"로 해석됩니다. </br>
  현수가 보낸 신호를 해석해주는 프로그램을 작성해서 영희를 도와주세요.

> #입력 </br>
> 4 </br>
> #****###**#####**#####**##**   </br>
> #출력 </br>
> COOL


