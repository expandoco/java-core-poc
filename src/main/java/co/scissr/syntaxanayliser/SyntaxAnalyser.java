package co.scissr.syntaxanayliser;

import co.scissr.exceptions.syntaxanaliser.SyntaxAnaliserException;
import co.scissr.structures.SyntaxTree;
import co.scissr.structures.Token;

import java.util.List;

/**
 * Created by regardt on 17-10-14.
 */
public abstract class SyntaxAnalyser {

    public abstract SyntaxTree analiseSyntax(final List<Token> tokens) throws SyntaxAnaliserException;

}
