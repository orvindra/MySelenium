


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles {

    public static void main(String[] args) {

        // Initialize Webdriver Object (Update your system's path)
        System.setProperty("webdriver.chrome.driver", "C:\\jdk17\\MyWorkspace\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");

        // Print the current window handle
        System.out.println("Current Window Handle: " + driver.getWindowHandle());
        
     
        
        // Close the browser session
        driver.quit();
    }
}