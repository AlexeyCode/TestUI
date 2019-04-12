import Pages.MainPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import DriverFactory.DriverFactory;
import DriverFactory.DriverType;
import Steps.*;

public class TestUI {
    private WebDriver driver;
    private MainPage mainPage;
    private StepsDefs steps;

    @Test
    void test(){
        driver = DriverFactory.getDriver(DriverType.CHROME);
        steps = new StepsDefs();

        System.out.println("SOme");
    }

}
