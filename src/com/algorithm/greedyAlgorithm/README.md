# Greedy Algorithm

--- 

## 1. 씨름 선수([Test1.class](https://github.com/90mansik/codingTest-inflearn/blob/master/src/com/algorithm/greedyAlgorithm/Test1.java))
- 설명
  - N명의 지원자가 지원을 했을때 아래 선발 조건에 따라 최대 몇명의 선수가 선발 될 수 있는지 알아내는 프로그램을 작성
  - A라는 지원자를 다른 모든 지원자와 일대일 비교해서 키와 몸무게 모두 A지원자 보다 높은(크고, 무겁다) 지원자가
- 입력
    - 첫째 줄에 지원자의 수 N(5<=N<=30,000)
    - 두 번째 줄부터 N명의 키와 몸무게 정보가 차례대로 주어짐
- 출력
    - 씨름 선수로 뽑히는 최대 수 출력

> #입력  
> 5  
> 172 67  
> 183 65  
> 180 70  
> 170 72  
> 181 60  
> #출력  
> 3
