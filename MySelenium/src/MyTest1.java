import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//System.setProperty("webdriver.chrome.driver", "C:\\jdk17\\MyWorkspace\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	//WebDriver a = new ChromeDriver();
	
		
	System.setProperty("webdriver.edge.driver", "C:\\jdk17\\MyWorkspace\\edgedriver_win64\\msedgedriver.exe");
	
	WebDriver a = new ChromeDriver();
	
	a.get("https://www.timhortons.ca"); //Launch an URL
	
	//a.close();
	}

}
