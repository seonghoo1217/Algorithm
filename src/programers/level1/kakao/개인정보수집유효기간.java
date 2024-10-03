package programers.level1.kakao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 개인정보수집유효기간 {
    private Map<String, Integer> termsMap = new HashMap<>();

    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> expiredList = new ArrayList<>();
        LocalDate todayDate = parseDate(today);

        for (String term : terms) {
            String[] split = term.split(" ");
            String type = split[0];
            int duration = Integer.parseInt(split[1]);
            termsMap.put(type, duration);
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            LocalDate collectedDate = parseDate(split[0]);
            String type = split[1];

            LocalDate expirationDate = collectedDate.plusMonths(termsMap.get(type));
            if (expirationDate.isBefore(todayDate) || expirationDate.isEqual(todayDate)) {
                expiredList.add(i + 1);
            }
        }

        return expiredList.stream().mapToInt(i -> i).toArray();
    }

    private LocalDate parseDate(String date) {
        String[] split = date.split("\\.");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        return LocalDate.of(year, month, day);
    }
}
