package programers.level2;

import java.util.HashMap;

public class 전화번호목록 {
    static class Solution {
        public boolean solution(String[] phone_book) {
            HashMap<String,Integer> hashMap=new HashMap<>();
            for (int i=0; i<phone_book.length;i++){
                hashMap.put(phone_book[i],i);
            }
            for (int i=0;i< phone_book.length;i++){
                for (int j=0;j<phone_book.length;j++){
                    if (hashMap.containsKey(phone_book[i].substring(0,j)))
                        return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String[] arr={"119", "97674223", "1195524421"};
        solution.solution(arr);
    }
}



/*
//배울만한 코드
import java.util.Arrays;

class Solution {
    public boolean solution(String[] phoneBook) {
        // 1. phoneBook을 sorting한다.
        Arrays.sort(phoneBook);

        // 2. 1중 Loop을 돌며 앞 번호가 뒷 번호의 접두어인지 확인한다.
        for (int i = 0; i < phoneBook.length - 1; i++)
            if (phoneBook[i + 1].startsWith(phoneBook[i]))
                return false;

        // 3. 여기까지 오면 접두어가 없다는 것이다.
        return true;
    }
}
출처: https://coding-grandpa.tistory.com/entry/프로그래머스-전화번호-목록-해시-Lv-2-자바-Java [개발자로 취직하기:티스토리]
 */