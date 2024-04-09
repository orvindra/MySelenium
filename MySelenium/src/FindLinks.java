

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

    public static void main(String[] args) {

        // Initialize Webdriver Object (Update your system's path)
        System.setProperty("webdriver.chrome.driver", "C:\\jdk17\\MyWorkspace\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");

        // Store all link elements (anchor tag elements in html) in a list
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        // Print the number of links found on the page
        System.out.println("Total links on the Wb Page: " + allLinks.size());

        // Iterate through the list and print the text of each link
        for (WebElement link : allLinks) {
            System.out.println(link.getText());
        }

        // Close the browser session
        driver.quit();
    }
}