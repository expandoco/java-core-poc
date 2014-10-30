package co.scissr;

/**
 * Created by regardt on 10-10-14.
 */
public class Application {

    public static void main(String[] args) {
        ApplicationFacade mainFacade = ApplicationFacade.createFacade();
        mainFacade.run();
    }
}
