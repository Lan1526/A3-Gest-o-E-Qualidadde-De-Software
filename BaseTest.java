package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    public String driverPath;
    public String url;
    public WebDriver driver;

    @BeforeClass
    public void PreCond(){
        url=System.getProperty("user.dir")+"\\src\\main\\resources\\paginaDeTeste.html";
        driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get(url);
        driver.manage().window().maximize();
    }
    protected WebDriver getDriver(){
        return driver;
    }

}
