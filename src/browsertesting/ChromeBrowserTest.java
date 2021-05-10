package browsertesting;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        String baseurl = "https://www.barclays.co.uk";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseurl);

        String Title = driver.getTitle();
        System.out.println(Title);
        System.out.println(Title.length());

        boolean VerifyTitle = Title.equals("Personal banking | Barclays");
        boolean VerifyTitleContain = Title.contains(" banking");
        System.out.println(VerifyTitle);
        System.out.println(VerifyTitleContain);

        driver.close();

    }


}
