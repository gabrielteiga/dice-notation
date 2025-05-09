// Generated from DiceNotationParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DiceNotationParser}.
 */
public interface DiceNotationParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#file_}.
	 * @param ctx the parse tree
	 */
	void enterFile_(DiceNotationParser.File_Context ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#file_}.
	 * @param ctx the parse tree
	 */
	void exitFile_(DiceNotationParser.File_Context ctx);
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#notation}.
	 * @param ctx the parse tree
	 */
	void enterNotation(DiceNotationParser.NotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#notation}.
	 * @param ctx the parse tree
	 */
	void exitNotation(DiceNotationParser.NotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(DiceNotationParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(DiceNotationParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(DiceNotationParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(DiceNotationParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(DiceNotationParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(DiceNotationParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#dice}.
	 * @param ctx the parse tree
	 */
	void enterDice(DiceNotationParser.DiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#dice}.
	 * @param ctx the parse tree
	 */
	void exitDice(DiceNotationParser.DiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DiceNotationParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DiceNotationParser.NumberContext ctx);
}