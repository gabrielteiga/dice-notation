package trabalho.antlr.dice.parser.visitor;

// Generated from DiceNotationParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import trabalho.antlr.dice.parser.DiceNotationParser;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DiceNotationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DiceNotationParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DiceNotationParser#file_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_(DiceNotationParser.File_Context ctx);
	/**
	 * Visit a parse tree produced by {@link DiceNotationParser#notation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotation(DiceNotationParser.NotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceNotationParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(DiceNotationParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceNotationParser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOp(DiceNotationParser.MultOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceNotationParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(DiceNotationParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceNotationParser#dice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDice(DiceNotationParser.DiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceNotationParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DiceNotationParser.NumberContext ctx);
}