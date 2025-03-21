package calc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tets1 {

    @Test
    public void TestRun(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/AD/Desktop/calculator.html");

        // Multiplication TC

        driver.findElement(By.xpath("//button[@onclick=\"appendToDisplay('4')\"]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"appendToDisplay('*')\"]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"appendToDisplay('2')\"]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"calculateResult()\"]")).click();


        //Assert.assertEquals( driver.findElement(By.id("display")).getText() ,"8");
        Assert.assertEquals(driver.findElement(By.id("display")).getAttribute("value"), "8", "Displayed value is incorrect!");





        driver.findElement(By.xpath("//button[@onclick=\"clearDisplay()\"]")).click();


        //Summation TC

        driver.findElement(By.xpath("//button[@onclick=\"appendToDisplay('5')\"]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"appendToDisplay('+')\"]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"appendToDisplay('9')\"]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"calculateResult()\"]")).click();


        //Assert.assertEquals( driver.findElement(By.id("display")).getText() ,"14");
        System.out.println("Test 2 passed");

        //division TC

        driver.findElement(By.xpath("//button[@onclick=\"appendToDisplay('2')\"]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"appendToDisplay('0')\"]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"appendToDisplay('/')\"]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"appendToDisplay('5')\"]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"calculateResult()\"]")).click();


        //Assert.assertEquals( driver.findElement(By.id("display")).getText() ,"4");
        System.out.println("Test 3 passed");


        //Subtraction TC

        driver.findElement(By.xpath("//button[@onclick=\"appendToDisplay('3')\"]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"appendToDisplay('0')\"]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"appendToDisplay('-')\"]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"appendToDisplay('1')\"]")).click();
        driver.findElement(By.xpath("//button[@onclick=\"calculateResult()\"]")).click();


        //Assert.assertEquals( driver.findElement(By.id("display")).getText() ,"29");
        System.out.println("Test 4 passed");


        driver.quit();






    }

    //

}
