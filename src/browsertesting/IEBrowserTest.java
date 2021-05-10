package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IEBrowserTest {
    //static String driverPath = "IE driver path";

    public static void main(String[] args) {

        String baseurl = "https://www.barclays.co.uk";
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);

        String Title = driver.getTitle();
        System.out.println(Title);
        System.out.println(Title.length());

        boolean VerifyTitle = Title.equals("Personal banking | Barclays");
        boolean VerifyTitleContains = Title.contains("Barclays");
        System.out.println(VerifyTitle);
        System.out.println(VerifyTitleContains);

        driver.close();


    }


}
