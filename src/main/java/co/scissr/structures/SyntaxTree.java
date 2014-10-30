package co.scissr.structures;

/**
 * Created by regardt on 17-10-14.
 */
public class SyntaxTree {

    private SyntaxNode root;

    public SyntaxTree() {
        root = SyntaxNode.createNode("");
    }

    public SyntaxNode getRoot() {
        return root;
    }

}
