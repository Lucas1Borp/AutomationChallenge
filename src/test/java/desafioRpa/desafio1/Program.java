package desafioRpa.desafio1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {

	protected static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		int n = 10;

		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://rpachallenge.com/");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"start\"]")).click();
		Thread.sleep(1000);

		List<Pessoas> list = new ArrayList<>();

		list.add(new Pessoas("John", "Smith", "IT Solutions", "Analyst", "98 North Road", "jsmith@itsolutions.co.uk",
				"40716543298"));

		list.add(new Pessoas("Jane", "Dorsey", "MediCare", "Medical Engineer", "11 Crown Street", "jdorsey@mc.com",
				"40791345621"));

		list.add(new Pessoas("Albert", "Kipling", "Waterfront", "Accountant", "22 Guild Street",
				"kipling@waterfront.com", "40735416854"));

		list.add(new Pessoas("Michael", "Robertson", "MediCare", "IT Specialist", "17 Farburn Terrace",
				"mrobertson@mc.com", "40733652145"));

		list.add(new Pessoas("Doug", "Derrick", "Timepath Inc.", "Analyst", "99 Shire Oak Road",
				"dderrick@timepath.co.uk", "40799885412"));

		list.add(new Pessoas("Jessie", "Marlowe", "Aperture Inc.", "Scientist", "27 Cheshire Street",
				"jmarlowe@aperture.us", "40733154268"));

		list.add(new Pessoas("Stan", "Hamm", "Sugarwell", "Advisor", "10 Dam Road", "shamm@sugarwell.org",
				"40712462257"));

		list.add(new Pessoas("Michelle", "Norton", "Aperture Inc.", "Scientist", "13 White Rabbit Street",
				"mnorton@aperture.us", "40731254562"));

		list.add(new Pessoas("Stacy", "Shelby", "TechDev", "HR Manager", "19 Pineapple Boulevard",
				"sshelby@techdev.com", "40741785214"));

		list.add(new Pessoas("Lara", "Palmer", "Timepath Inc.", "Programmer", "87 Orange Street",
				"lpalmer@timepath.co.uk", "40731653845"));

		for (Pessoas pessoas : list) {

			driver.findElement(By.xpath("//label[text()=\"Email\"]/../input[@class='form-control'and @type='text']"))
					.sendKeys(pessoas.email);
			Thread.sleep(500);

			driver.findElement(
					By.xpath("//label[text()=\"Role in Company\"]/../input[@class='form-control' and @type ='text']"))
					.sendKeys(pessoas.roleInCompany);
			Thread.sleep(500);

			driver.findElement(
					By.xpath("//label[text()=\"First Name\"]/..//input[@class='form-control' and @type ='text']"))
					.sendKeys(pessoas.firstName);
			Thread.sleep(500);

			driver.findElement(
					By.xpath("//label[text()=\"Phone Number\"]/../input[@class='form-control' and @type ='text']"))
					.sendKeys(pessoas.phoneNumber);
			Thread.sleep(500);

			driver.findElement(
					By.xpath("//label[text()=\"Address\"]/../input[@class='form-control' and @type ='text']"))
					.sendKeys(pessoas.address);
			Thread.sleep(500);

			driver.findElement(
					By.xpath("//label[text()=\"Last Name\"]/../input[@class='form-control' and @type ='text']"))
					.sendKeys(pessoas.lastName);
			Thread.sleep(500);

			driver.findElement(
					By.xpath("//label[text()=\"Company Name\"]/../input[@class='form-control' and @type ='text']"))
					.sendKeys(pessoas.companyName);
			Thread.sleep(500);

			driver.findElement(By.xpath("//input[@type='submit' and @class=\"btn btn-default\" and @value=\"Submit\"]"))
					.click();
			Thread.sleep(500);

		}
	

	}

}
