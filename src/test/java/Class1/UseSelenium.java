package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UseSelenium {

    @Test
    public void useSeleniumLib() {

        //path of chromeDriver

        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

    }

}
