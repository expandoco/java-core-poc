package co.scissr;

import co.scissr.components.MainWindow;
import co.scissr.components.listereners.TabListener;
import co.scissr.exceptions.SciccrException;
import co.scissr.structures.Pipeline;

/**
 * Created by regardt on 10-10-14.
 */
public class ApplicationFacade {

    /** Main window, all component resides in this frame. */
    private final MainWindow mainWindow;

    /** */
    private final SciccrFacade sciccrFacade;

    /**
     * Private Constructor. Use static factory method.
     */
    private ApplicationFacade() {
        sciccrFacade = SciccrFacade.createWithPipeline(Pipeline.createDefaultPipline());
        mainWindow = new MainWindow(createTabListener());
    }

    /**
     * Create a listerer which is executed on the tab key in the text area box.
     * @return TabListener
     */
    private TabListener createTabListener() {
        return new TabListener() {
            @Override
            public String onTabPressed(String lineContent) {
                String output = null;
                try {
                    output = sciccrFacade.run(lineContent);
                } catch (SciccrException e) {
                    output = e.getMessage();
                }
                return output;
            }
        };
    }

    /**
     * Facade main entry point.
     */
    public void run() {
        mainWindow.setVisible(true);
    }

    /**
     * Factory method for facade.
     */
    public static ApplicationFacade createFacade() {
        return new ApplicationFacade();
    }

}
