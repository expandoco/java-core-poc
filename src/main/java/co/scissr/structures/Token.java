package co.scissr.structures;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by regardt on 17-10-14.
 */
public class Token {

    private final String value;

    private Token(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Token)) return false;

        Token token = (Token) o;

        if (!value.equals(token.value)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    /**
     * Factory Method
     * @param name
     * @return
     */
    public static Token token(final String name) {
        return new Token(name);
    }

    /**
     * Factory Method
     * @param name
     * @return
     */
    public static List<Token> tokens(final String... names) {
        List<Token> tokens = new ArrayList<Token>();
        for (String s : names) {
            tokens.add(token(s));
        }
        return tokens;
    }
}
