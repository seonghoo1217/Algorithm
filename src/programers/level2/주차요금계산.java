package programers.level2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 주차요금계산 {
    public static List<Integer> solution(int[] fees, String[] records) {
        HashMap<String, String> numberAndInTime = new HashMap<>(); // 차랑번호, In시간
        HashMap<String, Integer> timeOfParking = new HashMap<>(); // 누적 주차시간 (차량번호, 시간(분))
        HashMap<String, Integer> priceOfParking = new HashMap<>(); // 주차 비용 (차량번호, 비용)

        int baseTime = fees[0];
        int baseFee = fees[1];
        int addTime = fees[2];
        int addFee = fees[3];

        for (String record : records) {
            String[] split = record.split(" ");
            String time = split[0];
            String carNum = split[1];
            String type = split[2];

            if (type.equals("IN")) {
                numberAndInTime.put(carNum, time);
            } else if (type.equals("OUT")) {
                String inTime = numberAndInTime.get(carNum);
                timeOfParking.put(carNum,
                        timeOfParking.getOrDefault(carNum, 0) + getRecordParkingTime(inTime, time));
                numberAndInTime.remove(carNum);
            }
        }

        for (String record : records) {
            String[] recordArr = record.split(" ");
            String carNum = recordArr[1];
            if (numberAndInTime.containsKey(carNum)) {
                String inTime = numberAndInTime.get(carNum);
                timeOfParking.put(carNum,
                        timeOfParking.getOrDefault(carNum, 0) + getRecordParkingTime(inTime, "23:59"));
                numberAndInTime.remove(carNum);
            }
        }

        for (String key : timeOfParking.keySet()) {
            int parkingTime = timeOfParking.get(key); // 주차 시간
            priceOfParking.put(key, getPriceOfParking(parkingTime, fees));
        }


        return priceOfParking.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    public static int getRecordParkingTime(String inTime, String outTime) {
        String[] outTimes = outTime.split(":");
        String[] inTimes = inTime.split(":");

        int outMin = Integer.parseInt(outTimes[0]) * 60 + Integer.parseInt(outTimes[1]);
        int inMin = Integer.parseInt(inTimes[0]) * 60 + Integer.parseInt(inTimes[1]);

        return (outMin - inMin);

    }

    public static int getPriceOfParking(int parkingTime, int[] fees) {
        int price = 0;
        if (parkingTime <= fees[0]) {
            return fees[1];
        } else {
            parkingTime -= fees[0];
            price += fees[1];
            price += (Math.ceil(parkingTime / (fees[2] * 1.0)) * fees[3]);
        }
        return price;
    }
}
