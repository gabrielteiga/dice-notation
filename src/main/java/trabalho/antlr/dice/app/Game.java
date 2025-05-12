package trabalho.antlr.dice.app;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import trabalho.antlr.dice.lexer.DiceNotationLexer;
import trabalho.antlr.dice.parser.DiceNotationParser;
import trabalho.antlr.dice.parser.visitor.DiceEvaluator;

public class Game {
    private Player player1;
    private Player player2;
    private Player winner;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getWinner() {
        return this.winner;
    }

    public void play(String dicesPlayer1, String dicesPlayer2) {
        int score1 = rollDice(dicesPlayer1);
        int score2 = rollDice(dicesPlayer2);

        player1.setScore(score1);
        player2.setScore(score2);

        if (score1 > score2) {
            winner = player1;
        } else if (score2 > score1) {
            winner = player2;
        } else {
            winner = null; // It's a tie
        }
    }

    private int rollDice(String dices) {
        int result = 0;
        try {
            CharStream input = CharStreams.fromFileName(dices);
            DiceNotationLexer lexer = new DiceNotationLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DiceNotationParser parser = new DiceNotationParser(tokens);

            ParseTree tree = parser.file_();

            boolean invalidEntry = parser.getNumberOfSyntaxErrors() > 0;
            if (invalidEntry) {
                if (Config.DEBUG)
                    System.out.println("Invalid entry: " + dices);
                return 0;
            }

            DiceEvaluator dice = new DiceEvaluator();
            result = dice.visit(tree);

            if (Config.DEBUG){
                System.out.println(tree.toStringTree(parser));
                System.out.println(result);
            }
        } catch (Exception e) {
            return 0;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Game{" +
                "player1=" + player1 +
                ", player2=" + player2 +
                ", winner=" + winner +
                '}';
    }
}
