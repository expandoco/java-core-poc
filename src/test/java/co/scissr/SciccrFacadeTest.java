package co.scissr;

import co.scissr.structures.Pipeline;
import org.junit.Test;

import static org.junit.Assert.*;

public class SciccrFacadeTest {

    @Test
    public void testRun() throws Exception {
        SciccrFacade sciccrFacade = SciccrFacade.createWithPipeline(Pipeline.createDefaultPipline());
        String output = sciccrFacade.run("Bob,Larry");
        assertNotNull("Output can not be null. Code generation failed.",output);
    }
}