import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");// in order to access chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://studio.wibbitz.com/?supportSignUp=true&supportForgotPassword=true&email=lilian.sh29%40gmail.com&message=Your%20email%20was%20verified.%20You%20can%20continue%20using%20the%20application.&success=true&code=success#/app/top-stories?language=english");
		waitForElement(2000);
		driver.findElement(By.name("email")).sendKeys("lilian.sh29@gmail.com");//to write the email
		waitForElement(2000);
		driver.findElement(By.name("password")).sendKeys("liliansh2903N");//to write the password
		waitForElement(2000);
		driver.findElement(By.cssSelector(".auth0-lock-submit")).click();// to click on the log in bottom
		waitForElement(20000);
		driver.findElement(By.cssSelector(".simple-video-grid>div:first-child>[data-test-id='media-content-container']")).click();// to select the first video
		
	}
	
	public static void waitForElement(int sec) throws InterruptedException
	{
		//waiting for the element to appear
		Thread.sleep(sec);
	}

}
