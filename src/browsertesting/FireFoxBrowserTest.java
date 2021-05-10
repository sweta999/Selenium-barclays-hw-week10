package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxBrowserTest {

    public static void main(String[] args) {

        String baseurl = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseurl);

        String Title = driver.getTitle();
        System.out.println(Title);
        System.out.println(Title.length());

        boolean VerifyTitle = Title.equals("Personal banking | Barclays");
        boolean VerifyTitleContains = Title.contains("login");
        System.out.println(VerifyTitle);
        System.out.println(VerifyTitleContains);

        driver.close();


    }


}
