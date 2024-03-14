package org.apache.maven.quickstart.SeleniumMarch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
public class project1 {
	public void launch()
	{
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().minimize();
		driver.close();
		driver.quit();
	}

	public static void main(String[] args) {
		
            project1 p=new project1();
               p.launch();
	}

}
