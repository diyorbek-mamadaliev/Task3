import org.epam.testing.google.cloud.HomePage;
import mailPageObjects.YopmailPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EmailAndCloudGooglePageCostComparisonTest {
    private WebDriver driver;
    private static String expectedEstimatedCost;
    private static String actualEstimatedCost;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void generateEmailAddress() {
        YopmailPage yopmailPage = new YopmailPage(driver);
        yopmailPage.openPage();
        yopmailPage.generateEmail();
        String emailAddress = yopmailPage.getEmailAddress();
        driver.switchTo().newWindow(WindowType.TAB);

        HomePage cloudGoogleHomepage = new HomePage(driver);
        expectedEstimatedCost = cloudGoogleHomepage
                .openPage()
                .searchOnRequest()
                .followPricingCalculatorLink()
                .fillForm()
                .sendEmail(emailAddress)
                .getTotalEstimatedCost();

        // Assert that the expectedEstimatedCost is not null or empty
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotNull(expectedEstimatedCost, "Expected estimated cost is null or empty.");
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void checkEmailForActualCost() {
        // Switch to the Yopmail tab
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());

        YopmailPage yopmailPage = new YopmailPage(driver);
        yopmailPage.checkEmailBox();
        actualEstimatedCost = yopmailPage.getTotalEstimatedCost();

        // Assert that the actualEstimatedCost is not null or empty
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotNull(actualEstimatedCost, "Actual estimated cost is null or empty.");
        softAssert.assertAll();
    }


    @Test(priority = 3)
    public void compareCosts() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualEstimatedCost, expectedEstimatedCost, "The estimated cost is incorrect!");
        softAssert.assertAll();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}