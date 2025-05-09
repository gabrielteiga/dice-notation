import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("input.txt");
        DiceNotationLexer lexer = new DiceNotationLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DiceNotationParser parser = new DiceNotationParser(tokens);

        ParseTree tree = parser.file_();
        System.out.println(tree.toStringTree(parser));
    }
} 