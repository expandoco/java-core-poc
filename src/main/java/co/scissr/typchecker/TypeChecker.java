package co.scissr.typchecker;

import co.scissr.exceptions.typechecker.TypeCheckerException;
import co.scissr.structures.SyntaxTree;

/**
 * Created by regardt on 17-10-14.
 */
public abstract class TypeChecker {

    public abstract SyntaxTree isTypesValid(final SyntaxTree syntaxTree) throws TypeCheckerException;

}
