package co.scissr.syntaxanayliser;

import co.scissr.structures.SyntaxTree;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import static co.scissr.syntaxanayliser.SyntaxAnalyserTestHelper.BASIC_INPUT_TOKENS;

public class SyntaxAnalyserImplTest {

    @Test
    public void testAnaliseSyntax() throws Exception {
        SyntaxAnalyser analyser = new SyntaxAnalyserImpl();
        SyntaxTree syntaxTree = analyser.analiseSyntax(BASIC_INPUT_TOKENS);

        assertNotNull(syntaxTree);
    }
}