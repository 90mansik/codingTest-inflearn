import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N = 3;
        int K = 2;

        HashMap<Character, Integer> hashMap = createRandomAlphabet(K);
        char[] result = new char[N];

        int endPoint = N - 1;
        int k = 0;      // 랜덤 알파벳을 가져오기 위함
        for (int startPoint = 0; startPoint < N / 2; startPoint++) {
            if(k == hashMap.size()){
                k = 0;
            }

            if ( startPoint != endPoint ){
                result[startPoint] = getAlphabet(hashMap, k);
                result[endPoint--] = getAlphabet(hashMap, k);
            }

            if( (startPoint+1) == endPoint){
                result[startPoint+1] = getAlphabet(hashMap, k+1);
            }

            k++;
        }

        System.out.println(Arrays.toString(result));

    }

    public static HashMap<Character, Integer> createRandomAlphabet(int alphabetCnt) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        int i = 0;
        while (alphabetCnt > hashMap.size()) {
            char ch = (char) ((Math.random() * 26) + 97);
            if (!hashMap.containsKey(ch)) {
                hashMap.put(ch, i++);
            }
        }

        return hashMap;
    }

    public static Character getAlphabet(HashMap<Character, Integer> hashMap, int value) {
        for (Character key : hashMap.keySet()) {
            // 키와 매핑된 값이랑 equals() 메서드에 전달된 값이랑 일치하면 반복문을 종료합니다.
            if (hashMap.get(key).equals(value)) { // 키가 null이면 NullPointerException 예외 발생
                return key;
            }
        }
        return ' ';
    }

}
