package co.scissr.lexer;

import co.scissr.structures.Token;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LexerImplTest {

    @Test
    public void testSplitIntoTokens() throws Exception {
        Lexer lexer = new LexerImpl();
        List<Token> actual = lexer.splitIntoTokens("a,bc,cd,d");
        List<Token> expected = Token.tokens("a",",","bc",",","cd",",","d");
        assertThat(actual, is(expected));
    }

    @Test
    public void testSplitIntoTokensBrackets() throws Exception {
        Lexer lexer = new LexerImpl();
        List<Token> actual = lexer.splitIntoTokens("()");
        List<Token> expected = Token.tokens("(",")");
        assertThat(actual, is(expected));
    }
}