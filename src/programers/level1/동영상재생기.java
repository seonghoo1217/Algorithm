package programers.level1;


public class 동영상재생기 {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int count = 0;

        pos = opening(op_start, op_end, pos); //초기 pos 오프닝 건너뛰기 실행
        while (count < commands.length) {
            String command = commands[count];
            pos = beforeSec(command, pos, op_start, op_end); //prev 로직 실행
            pos = afterSec(command, video_len, pos, op_start, op_end); //next 로직 실행
            pos = opening(op_start, op_end, pos); //구간 이동 후 오프닝 건너뛰기실행
            count++;
        }
        return pos;
    }

    private String opening(String op_start, String op_end, String pos) {
        String[] posSplit = pos.split(":");
        int posLength = Integer.parseInt(posSplit[0]) * 60 + Integer.parseInt(posSplit[1]);

        String[] osSplit = op_start.split(":");
        int osLength = Integer.parseInt(osSplit[0]) * 60 + Integer.parseInt(osSplit[1]);

        String[] oeSplit = op_end.split(":");
        int oeLength = Integer.parseInt(oeSplit[0]) * 60 + Integer.parseInt(oeSplit[1]);

        if (posLength >= osLength && posLength < oeLength) {
            pos = op_end;
        }

        return pos;
    }

    private String beforeSec(String command, String pos, String op_start, String op_end) {
        if ("prev".equals(command)) {
            String[] timeSplit = pos.split(":");
            int m = Integer.parseInt(timeSplit[0]);
            int s = Integer.parseInt(timeSplit[1]) - 10;

            if (s < 0) {
                m -= 1;
                s += 60;
            }

            if (m < 0) {
                m = 0;
                s = 0;
            }

            String mm = m < 10 ? "0" + m : "" + m;
            String ss = s < 10 ? "0" + s : "" + s;

            pos = mm + ":" + ss;
        }
        return pos;
    }

    private String afterSec(String command, String video_len, String pos, String op_start, String op_end) {
        if ("next".equals(command)) {
            String[] timeSplit = pos.split(":");
            int m = Integer.parseInt(timeSplit[0]);
            int s = Integer.parseInt(timeSplit[1]) + 10;

            if (s >= 60) {
                m += 1;
                s -= 60;
            }

            String[] videoSplit = video_len.split(":");
            int vm = Integer.parseInt(videoSplit[0]);
            int vs = Integer.parseInt(videoSplit[1]);
            if ((vm == m && vs < s) || vm < m) { //10초 앞으로 갔는데 비디오길이보다 크다면 비디오 길이만큼
                m = vm;
                s = vs;
            }

            String mm = m < 10 ? "0" + m : "" + m;
            String ss = s < 10 ? "0" + s : "" + s;

            pos = mm + ":" + ss;
        }
        return pos;
    }
}
