package textbox;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestTextBox {

    @Test
    public void checkSubmit(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(" Maksum");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(" Maksum@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(" adress");
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys(" permanent adress");

        driver.findElement(By.xpath("//button[@id='submit']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='name']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='email']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//p[@id='currentAddress']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//p[@id='permanentAddress']")).isDisplayed());




    }

}
