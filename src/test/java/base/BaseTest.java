package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import vizsgaremek.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected String email="stefi2@gmail.com";
    protected String password="ruhak";
    protected LoginPage login;
    public WebDriver getDriver () {
        return driver;
    }

    @BeforeEach
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
       // options.addArguments("--headless");
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com");
        login=new LoginPage(driver);

    }

   @AfterEach
    public void quit(){
        driver.quit();
    }
}
