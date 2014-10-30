package co.scissr.lexer;

import co.scissr.exceptions.lexer.LexerException;
import co.scissr.structures.Token;

import java.util.List;

/**
 * Created by regardt on 17-10-14.
 */
public abstract class Lexer {

    public abstract List<Token> splitIntoTokens(final String content) throws LexerException;

}
