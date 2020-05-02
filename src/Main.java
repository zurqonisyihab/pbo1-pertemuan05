public class Main {
    public static void main(String[] args) {
        Football player1 = new Football();
        Football player2 = new Football();

        player1.userName = "BARITO PUTERA";
        player1.score = 2;
        player1.time = 10;

        player2.userName = "BORNEO FC";
        player2.score = 4;
        player2.time = 10;

        player1.playingFootball();

        System.out.println(player1.score);
        player1.PlayingOthers(player2);
        System.out.println(player1.score);

    }
}
