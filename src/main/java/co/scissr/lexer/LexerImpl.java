package co.scissr.lexer;

import co.scissr.structures.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by regardt on 17-10-14.
 */
public class LexerImpl extends Lexer {

    /**
     * Regex to split all
     * - WORDS [\\w]
     * - Closing Brackets )
     * - Opening Brackets (
     * - Commas ,
     */
    public static final String REGEX = "[\\w]+|[\\)]|[\\(]|[,]";

    @Override
    public List<Token> splitIntoTokens(final String content) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(content);
        List<Token> tokens = new ArrayList<Token>();

        while(matcher.find()) {
            tokens.add(Token.token(matcher.group()));
        }

        return tokens;
    }

}
