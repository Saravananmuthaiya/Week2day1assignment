package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saravanan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muthaiya");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Akhilesh");
		driver.findElement(By.name("departmentName")).sendKeys("Development");
		driver.findElement(By.name("description")).sendKeys("Developer");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pmsaravanan28@gmail.com");
		WebElement dropdown =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec= new Select(dropdown);
		sec.selectByVisibleText("Florida");
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println(title);
		//Thread.sleep(2000);
		//driver.close();
	}
}
