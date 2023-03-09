# Array(1,2차원 배열)

--- 

## 1.큰 수 출력하기 ([FindLargerNumberThanPreviousOne.java](https://github.com/90mansik/codingTest-inflearn/blob/master/src/com/algorithm/array/FindLargerNumberThanPreviousOne.java))
- N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성
- 첫 번째 수는 무조건 출력
- 입력
    - 첫번째 줄 입력 : 입력받을 숫자의 갯수(n)
    - 두번째 줄 입력 : 비교하고자 하는 n개의 정수
- 출력 : 자신의 바로 앞 수보다 큰 수를 한줄로 출력
- 제한조건 : 

> #입력  
> 6 </br>  
> 7 3 9 5 6 12 </br>
> #출력 </br>  
> 7 9 6 12


## 2.보이는 학생 ([FindViewCntStudent.java](https://github.com/90mansik/codingTest-inflearn/blob/master/src/com/algorithm/array/FindViewCntStudent.java))
- 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서있는 </br>
  선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성
- 앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.
- 입력
  - 첫번째 줄 입력 : 입력받을 학생의 수(n)
  - N명의 학생의 키가 앞에서부터 순서대로 주어짐.
- 출력 : 선생님이 볼 수 있는 최대 학생수 출력

> #입력  
> 8 </br>  
> 130 135 148 140 145 150 150 153 </br>
> #출력 </br>  
> 5


//

## 3.가위바위보 ([FindLargerNumberThanPreviousOne.java](https://github.com/90mansik/codingTest-inflearn/blob/master/src/com/algorithm/array/FindLargerNumberThanPreviousOne.java))
- A, B 두 사람이 가위바위보 게임을 진행.
- 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력. 비길 경우에는 D를 출력
- 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보
- 각 회의 승자를 출력하는 프로그램 작성
- 입력
  - 첫 번째 줄 : 게임 횟수인 자연수 N(1<=N<=100)
  - 두 번째 줄 : A가 낸 가위, 바위, 보 정보가 N개
  - 세 번째 줄 : B가 낸 가위, 바위, 보 정보가 N개
- 출력 : 각 줄에 각 회의 승자를 출력 비겼을 경우는 D를 출력

> #입력  
> 5 </br> 
> 2 3 3 1 3 </br>
> 1 1 2 2 3 </br>  
> 
> #출력 </br> 
> A </br>
> B </br>
> A </br>
> B </br>
> D </br>

## 4.피보나치수열([FibonacciNumbers.java](https://github.com/90mansik/codingTest-inflearn/blob/master/src/com/algorithm/array/FibonacciNumbers.java))
- 수열의 총 항의 수 N을 입력 받아 앞의 2개의 수를 합하여 다음 숫자가 되는 피보나치 수열을 생성
- 입력
  - 첫 번째 줄 : 총 항수 N(3<=N<=45)
- 출력 
  - 피보나치 수열을 출력

> #입력  
> 10 </br>  
> 
> #출력 </br> 
> 1 1 2 3 5 8 13 21 34 55 </br>


