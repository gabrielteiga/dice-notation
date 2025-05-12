package trabalho.antlr.dice.app;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import trabalho.antlr.dice.lexer.DiceNotationLexer;
import trabalho.antlr.dice.parser.DiceNotationParser;
import trabalho.antlr.dice.parser.visitor.DiceEvaluator;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("input.txt");
        DiceNotationLexer lexer = new DiceNotationLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DiceNotationParser parser = new DiceNotationParser(tokens);

        ParseTree tree = parser.file_();

        DiceEvaluator dice = new DiceEvaluator();
        int resultado = dice.visit(tree);

        System.out.println(tree.getText());
        System.out.println(tree.toStringTree(parser));
        System.out.println(resultado);
    }
}