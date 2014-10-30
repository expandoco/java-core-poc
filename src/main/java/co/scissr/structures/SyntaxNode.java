package co.scissr.structures;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by regardt on 18-10-14.
 */
public class SyntaxNode {

    private String name;
    private List<SyntaxNode> childern;

    private SyntaxNode(final String name) {
        this.name = name;
        childern = new ArrayList<SyntaxNode>();
    }

    public void addChild(final SyntaxNode child) {
        childern.add(child);
    }

    public static SyntaxNode createNode(final String name) {
        return new SyntaxNode(name);
    }
}
