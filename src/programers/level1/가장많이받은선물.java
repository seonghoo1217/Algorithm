package programers.level1;

import java.util.HashMap;

public class 가장많이받은선물 {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        int N = friends.length;
        int[] giftDegree = new int[N];
        int[][] giftGraph = new int[N][N];

        for (int i = 0; i < N; i++) {
            map.put(friends[i], i);
        }

        for (String gift : gifts) {
            String[] giftName = gift.split(" ");
            giftDegree[map.get(giftName[0])]++;
            giftDegree[map.get(giftName[1])]--;
            giftGraph[map.get(giftName[0])][map.get(giftName[1])]++;
        }
        for (int i = 0; i < N; i++) {
            int num = 0;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }

                if (giftGraph[i][j] > giftGraph[j][i] ||
                        (giftGraph[i][j] == giftGraph[j][i] && giftDegree[i] > giftDegree[j])) {
                    num++;
                }
            }

            if (answer < num) {
                answer = num;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        String[] f = {"muzi", "ryan", "frodo", "neo"};
        String[] g = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        가장많이받은선물 가장많이받은선물 = new 가장많이받은선물();
        가장많이받은선물.solution(f, g);
    }
}
