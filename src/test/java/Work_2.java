import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Work_2 {
    @Test
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium WebDriver");

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"gsr\"]"));
        System.out.println(driver.getTitle());

        driver.close();
    }
}

//: გახსენით Google-ის მთავარი გვერდი (https://www.google.com).
//: მოიძებნეთ და დააჭირეთ "Google Search" ღილაკს
//აკრიფეთ ტექსტი "Selenium WebDriver" საძიებო ველში.
//როდესაც გაიხსენით შედეგების გვერდი, იპოვნეთ პირველი ლინკი (მაგ: "Selenium WebDriver - Official Documentation") და დააჭირეთ მას.
//დაბეჭდეს არსებული დოკუმენტაციების გვერდის header
//
//Google
//