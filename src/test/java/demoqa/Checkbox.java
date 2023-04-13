package demoqa;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkbox {

    @Test
    public void selectedCheck(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");

        driver.findElement(By.xpath("//label[@for='tree-node-home']")).click();
        driver.findElement(By.xpath("/html/body//div/div/ol/li/span/button")).click();
        driver.findElement(By.xpath("//li[@class=\"rct-node rct-node-parent rct-node-expanded\"]//li[1]//button")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//li[@class=\"rct-node rct-node-parent rct-node-expanded\"]//li[1]//span/label/span[@class='rct-checkbox']")).isDisplayed());
    }
}
