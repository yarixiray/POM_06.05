package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class LearningPage {
    private WebDriver driver;
    private static String pageUrl = "http://skillsup.ua/";
    private By buttonLearning = By.linkText("Обучение");


    public LearningPage(WebDriver driver) {
        this.driver = driver;
        driver.get(pageUrl);
        PageFactory.initElements(driver, this);
    }

    public void goToLearningPage() {
        driver.findElement(buttonLearning).click();
    }

    public void pressButtonLearning(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("Обучение"))).perform();
        actions.moveToElement(driver.findElement(By.linkText("Курсы"))).perform();

    }


    public void submitYourApplication(){
        driver.findElement(By.xpath("//div[@class=''button]")).click();
        //driver.findElement(By.xpath(".//*[@id='page_position_content']/div[3]/div/div/div[3]/div/div[4]/a")).click();
        //div[@class='button'])[2]/a

    }

    public void chooseNecessaryCourse() {
        String necessaryCourse = driver.findElement(By.linkText("34"));
        driver.findElement(necessaryCourse).click();
    }


//    public boolean checkThatPersonIsPresented(String person) {
//        return getAllCoachNames().contains(person);
//    }


}
