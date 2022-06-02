package PESMCOE.publication.keywords;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class UIKeywords {
	RemoteWebDriver driver;
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void launchURL(String url) throws InterruptedException {
		driver.get(url);
		Thread.sleep(5000);
	}
	public void takeScreenShot(String index) throws IOException, InterruptedException {
		File file=driver.getScreenshotAs(OutputType.FILE);
		File out=new File(index+".jpeg");
		Files.copy(file, out);
		Thread.sleep(5000);
	}
	public void closeBrowser() {
		driver.close();
		// TODO Auto-generated method stub
		
	}

}
