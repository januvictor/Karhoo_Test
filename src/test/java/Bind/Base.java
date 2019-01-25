package Bind;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Base {
    public WebDriver driver;

    @FindBy(xpath = "//span[contains(text(),'About')]")
    WebElement About;

    @FindBy(linkText = "Karhoo team")
    WebElement KarhooTeam;

    @FindBy(linkText="Apply")
    WebElement Apply;

}
