package co.scissr;

import co.scissr.SciccrFacade;
import co.scissr.structures.Pipeline;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UseCaseTesting {

    private SciccrFacade sciccrFacade = SciccrFacade.createWithPipeline(Pipeline.createDefaultPipline());

    @Test
    public void testParseCase1() throws Exception {
        String actual = sciccrFacade.run("Joe");

        String expected = "{\n" +
                "\t\"Joe\" : \"Joe\"\n" +
                "}";

        assertEquals("String values should match", actual, expected);
    }

    @Test
    public void testParseCase3() throws Exception {
        String actual = sciccrFacade.run("Joe,Sam,Lenny");

        String expected = "{\n" +
                "\t\"Joe\" : \"Joe\",\n" +
                "\t\"Sam\" : \"Sam\",\n" +
                "\t\"Lenny\" : \"Lenny\"\n" +
                "}";

        assertEquals("String values should match", actual, expected);
    }

    @Test
    public void testParseCase2() throws Exception {
        String actual = sciccrFacade.run("Name:Joe");

        String expected = "{\n" +
                "\t\"Name\" : \"Joe\"\n" +
                "}";

        assertEquals("String values should match", actual, expected);
    }
}

