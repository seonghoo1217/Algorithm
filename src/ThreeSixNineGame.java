import java.util.Random;

public abstract class ThreeSixNineGame {
    public int count369(int number) {
        String numStr = String.valueOf(number);
        int count = 0;
        for (char ch : numStr.toCharArray()) {
            if (ch == '3' || ch == '6' || ch == '9') {
                count++;
            }
        }
        return count;
    }

    public void playGame(Player[] players) {
        int i = 1;
        Random rand = new Random();
        while(true) {
            Player player = players[(i - 1) % players.length];
            double chance = rand.nextDouble();
            if(chance < player.getWrongAnswerRate()) {
                System.out.println(player.getName() + ": 오답");
                break;
            }
            System.out.println(player.getName() + ": " + count369(i));
            i++;
        }
    }

    static class Player {
        private String name;
        private double wrongAnswerRate;

        public Player(String name, double wrongAnswerRate) {
            this.name = name;
            this.wrongAnswerRate = wrongAnswerRate;
        }

        public String getName() {
            return this.name;
        }

        public double getWrongAnswerRate() {
            return this.wrongAnswerRate;
        }
    }

    public static void main(String[] args) {
        Player[] players = {
                new Player("영수", 0.01),
                new Player("광수", 0.02),
                new Player("영철", 0.03),
                new Player("영기", 0.04)
        };
        new SeoulThreeSixNineGame().playGame(players);
        new BusanThreeSixNineGame().playGame(players);
    }
}
