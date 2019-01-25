package Bind;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks extends Base {

    private Base Base;

    public Hooks(Base base) {
        this.Base = base;
    }
    @Before
    public void InitializeTest(){

        System.out.println("Setting up the system property");
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        Base.driver = new ChromeDriver();
        Base.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Base.driver.manage().window().maximize();

    }
    @After
    public void TearDown(Scenario scenerio){
        if (scenerio.isFailed())
        {
            System.out.println("Scenerio failed");
        }
        System.out.println("\n Test is executed");
        this.Base.driver.quit();
    }

}
