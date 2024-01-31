public class SeoulThreeSixNineGame extends ThreeSixNineGame {
    public String do369(int number) {
        int count = count369(number);
        if (count > 0) {
            return "clap";
        }
        return String.valueOf(number);
    }
}
