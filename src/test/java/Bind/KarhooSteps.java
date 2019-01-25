package Bind;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class KarhooSteps extends Base{

    private Base Base;

    public KarhooSteps(Base base) {
        this.Base = base;
    }
    @Given("^The URL in QA Test Environment$")
    public void theURLInQATestEnvironment() {
        Base.driver.get("https://flit.tech");
        Assert.assertEquals(Base.driver.getTitle(),"Flit Technologies");
    }

    @When("^Navigates from the homepage to the Karhoo team pagee$")
    public void navigatesFromTheHomepageToTheKarhooTeamPagee() {
        PageFactory.initElements(Base.driver,this);
        About.click();
        KarhooTeam.click();
    }

    @And("^Clicks the apply buttons$")
    public void clicksTheApplyButtons() {
        ((JavascriptExecutor) Base.driver).executeScript("window.scrollBy(0,3000)");
        Apply.click();
    }

    @Then("^Checks that you are on the bamboohr vacancies pages$")
    public void checksThatYouAreOnTheBamboohrVacanciesPages() {
        ArrayList<String> win_counts = new ArrayList<String> (Base.driver.getWindowHandles());
        Base.driver.switchTo().window(win_counts.get(1));
        Assert.assertEquals(Base.driver.getTitle(),"BambooHR");
    }
}
