


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.ArrayList;

	public class NewTabs3 {
	    public static void main(String[] args) {
	        // Initialize the driver
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demoqa.com/browser-windows");

	        // Click on the "New Tab" button three times
	        for (int i = 0; i < 3; i++) {
	            WebElement newTabButton = driver.findElement(By.id("tabButton"));
	            newTabButton.click();
	        }

	        // Switch to each window, get the heading text, print it, and close the window
	        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	        for (String tab : tabs) {
	            driver.switchTo().window(tab);
	            // Check if it's not the main window
	            if (!driver.getCurrentUrl().equals("https://demoqa.com/browser-windows")) {
	                WebElement heading = driver.findElement(By.id("sampleHeading"));
	                System.out.println(heading.getText());
	                driver.close();
	            }
	        }

	        // Switch back to the main window
	        driver.switchTo().window(tabs.get(0));
	        driver.quit();
	    }
	}
