package trabalho.antlr.dice.parser.visitor;

import trabalho.antlr.dice.app.Config;
import trabalho.antlr.dice.parser.DiceNotationParser;

import java.util.concurrent.ThreadLocalRandom;

public class DiceEvaluator extends DiceNotationParserBaseVisitor<Integer> {
    @Override
    public Integer visitFile_(DiceNotationParser.File_Context ctx) {
        return visit(ctx.notation());
    }

    @Override
    public Integer visitAddOp(DiceNotationParser.AddOpContext ctx) {
        int acc = visit(ctx.multOp(0));
        for (int i = 1; i < ctx.multOp().size(); i++) {
            String op   = ctx.ADDOPERATOR(i - 1).getText();
            int rhs     = visit(ctx.multOp(i));
            acc         = op.equals("+") ? acc + rhs : acc - rhs;
        }
        return acc;
    }

    @Override
    public Integer visitOperand(DiceNotationParser.OperandContext ctx) {
        if(ctx.number() != null)    return visit(ctx.number());
        if(ctx.dice() != null)      return visit(ctx.dice());
        return visit(ctx.notation());
    }

    @Override
    public Integer visitNumber(DiceNotationParser.NumberContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    @Override
    public Integer visitDice(DiceNotationParser.DiceContext ctx) {
        String txt = ctx.getText();
        boolean neg = txt.startsWith("-");

        txt = txt.replaceFirst("^[+-]", "");
        String[] parts = txt.split("[dD]");
        int dicesCount = parts[0].isEmpty() ? 1 : Integer.parseInt(parts[0]);
        int sides = Integer.parseInt(parts[1]);

        int sum = 0;
        for (int i = 0; i < dicesCount; i++) {
            int num = ThreadLocalRandom
                    .current()
                    .nextInt(1, sides + 1);
            if (Config.DEBUG)
                System.out.println("somando: " + num);
            sum += num;
        }
        return neg ? -sum : sum;
    }
}
