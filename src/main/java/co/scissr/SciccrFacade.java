package co.scissr;

import co.scissr.codegenerator.CodeGenerator;
import co.scissr.exceptions.SciccrException;
import co.scissr.exceptions.lexer.LexerException;
import co.scissr.lexer.Lexer;
import co.scissr.structures.Pipeline;
import co.scissr.structures.SyntaxTree;
import co.scissr.structures.Token;
import co.scissr.syntaxanayliser.SyntaxAnalyser;
import co.scissr.typchecker.TypeChecker;

import java.util.List;

/**
 * Created by regardt on 17-10-14.
 */
public final class SciccrFacade {

    private final Lexer lexer;
    private final SyntaxAnalyser syntaxAnalyser;
    private final CodeGenerator codeGenerator;
    private final TypeChecker typeChecker;

    private SciccrFacade(final Pipeline pipeline) {
        lexer = pipeline.getLexer();
        syntaxAnalyser = pipeline.getSyntaxAnalyser();
        typeChecker = pipeline.getTypeChecker();
        codeGenerator = pipeline.getCodeGenerator();
    }

    public String run(final String input) throws SciccrException {
        List<Token> tokens = lexer.splitIntoTokens(input);
        SyntaxTree syntaxTree = syntaxAnalyser.analiseSyntax(tokens);
        SyntaxTree validSyntaxTree = typeChecker.isTypesValid(syntaxTree);
        return codeGenerator.generatorCode(validSyntaxTree);
    }

    public static SciccrFacade createWithPipeline(final Pipeline pipeline) {
        return new SciccrFacade(pipeline);
    }

}
