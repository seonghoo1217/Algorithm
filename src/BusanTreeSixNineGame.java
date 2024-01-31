import java.util.Arrays;

public class BusanThreeSixNineGame extends ThreeSixNineGame {
    public String do369(int number) {
        int count = count369(number);
        if(count > 0) {
            String[] claps = new String[count];
            Arrays.fill(claps, "clap");
        }
        return String.valueOf(number);
    }


}