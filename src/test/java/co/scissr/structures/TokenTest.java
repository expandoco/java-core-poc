package co.scissr.structures;

import org.junit.Test;

import static org.junit.Assert.*;

public class TokenTest {

    @Test
    /**
     * All thought test seems to be redundant, the functioning of the
     * application highly relies on the Token.equals.
     */
    public void testEquals() throws Exception {
        assertTrue(Token.token("Lorem").equals(Token.token("Lorem")));
        assertFalse(Token.token("Lorem").equals(Token.token("NotLorem")));
    }

}