package programers.level1;

import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> score = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            score.put(players[i], i);
        }

        for (String calling : callings) {
            int index = score.get(calling);
            if (index > 0) {
                String frontPlayer = players[index - 1];
                players[index] = frontPlayer;
                players[index - 1] = calling;
                score.put(calling, index - 1);
                score.put(frontPlayer, index);
            }
        }
        return players;
    }
}
