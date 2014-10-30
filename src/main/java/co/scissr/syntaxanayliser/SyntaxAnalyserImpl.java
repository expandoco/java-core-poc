package co.scissr.syntaxanayliser;

import co.scissr.structures.SyntaxNode;
import co.scissr.structures.SyntaxTree;
import co.scissr.structures.Token;

import java.util.List;
import java.util.Stack;

/**
 * Created by regardt on 17-10-14.
 */
public class SyntaxAnalyserImpl extends SyntaxAnalyser {

    @Override
    public SyntaxTree analiseSyntax(final List<Token> tokens) {
        SyntaxTree syntaxTree = new SyntaxTree();
        SyntaxNode root = syntaxTree.getRoot();

        Stack<SyntaxNode> stack = new Stack<SyntaxNode>();
        stack.push(root);

        for (Token token : tokens) {
            String value = token.getValue();

            if (value.equals(",") || value.equals(")")) {
                stack.pop();
            } else if (value.equals("(")) {
                // Do nothing
            } else {
                SyntaxNode node = SyntaxNode.createNode(token.getValue());
                stack.peek().addChild(node);
                stack.push(node);
            }
        }

        return syntaxTree;
    }
}
