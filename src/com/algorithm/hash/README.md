# Hash

--- 

## 1. 학급 회장(해쉬)([Test1.class](https://github.com/90mansik/codingTest-inflearn/blob/master/src/com/algorithm/hash/Test1.java))
- 설명
    - 학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.  
    - 투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
    - 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성
- 입력
  - 첫 줄에는 반 학생수 N(5<=N<=50)
  - 두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력
- 출력
  - 학급 회장으로 선택된 기호를 출력
- 제한조건
  - 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정

> #입력  
> 15  
> BACBACCACCBDEDE
>
> #출력  
> C


## 2. 아나그램(HashMap)([Test2.class](https://github.com/90mansik/codingTest-inflearn/blob/master/src/com/algorithm/hash/Test2.java))
- 설명
  - 길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.
- 입력
  - 첫 줄에 첫 번째 단어가 입력
  - 두 번째 줄에 두 번째 단어
- 출력
  - 학급 회장으로 선택된 기호를 출력
- 제한조건
  - 단어의 길이는 100을 넘지 않는다.

> #입력  
> AbaAeCe  
> baeeACA
>  
> #출력  
> YES
>  
> #입력  
> abaCC  
> Caaab
>   
> #출력  
> NO

