package co.scissr.structures;

import co.scissr.codegenerator.CodeGenerator;
import co.scissr.codegenerator.CodeGeneratorImpl;
import co.scissr.lexer.Lexer;
import co.scissr.lexer.LexerImpl;
import co.scissr.syntaxanayliser.SyntaxAnalyser;
import co.scissr.syntaxanayliser.SyntaxAnalyserImpl;
import co.scissr.typchecker.TypeChecker;
import co.scissr.typchecker.TypeCheckerImpl;

/**
 * Created by regardt on 17-10-14.
 */
public class Pipeline {

    private Lexer lexer;
    private SyntaxAnalyser syntaxAnalyser;
    private TypeChecker typeChecker;
    private CodeGenerator codeGenerator;

    private Pipeline() {
        lexer = new LexerImpl();
        syntaxAnalyser = new SyntaxAnalyserImpl();
        typeChecker = new TypeCheckerImpl();
        codeGenerator = new CodeGeneratorImpl();
    }

    public Lexer getLexer() {
        return lexer;
    }

    public SyntaxAnalyser getSyntaxAnalyser() {
        return syntaxAnalyser;
    }

    public TypeChecker getTypeChecker() {
        return typeChecker;
    }

    public CodeGenerator getCodeGenerator() {
        return codeGenerator;
    }

    public static Pipeline createDefaultPipline() {
        return new Pipeline();
    }
}
