package trabalho.antlr.dice.app;

public class Main {
    public static void main(String[] args) throws Exception {
        Game game = new Game(new Player("Mangan"), new Player("Dotti"));
        game.play("player1.txt", "player2.txt");
        System.out.println(game);
    }
}