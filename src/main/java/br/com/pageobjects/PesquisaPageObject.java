package br.com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PesquisaPageObject {

    private WebDriver driver;
    private WebDriverWait wait;

    public PesquisaPageObject(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By lupaPequisa = By.xpath("//span[contains(@class,'ast-icon icon-search') and preceding-sibling::span[@class='screen-reader-text' and contains(.,'Pesquisar')]]");
    private By caixaPesquisa = By.xpath("//input[contains(@type,'search')]");
    private By textoLinkNoticia;

    public void clickSearch(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lupaPequisa));
        driver.findElement(lupaPequisa).click();
    }
    public void searchText(String text){
        clickSearch();
        wait.until(ExpectedConditions.visibilityOfElementLocated(caixaPesquisa));
        driver.findElement(caixaPesquisa).clear();
        driver.findElement(caixaPesquisa).sendKeys(text);
        driver.findElement(caixaPesquisa).sendKeys(Keys.ENTER);
        textoLinkNoticia = By.xpath("//a[contains(.,'"+text+"')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(textoLinkNoticia));
    }

    public String retornaTextoLinkNoticia(){
        WebElement elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(textoLinkNoticia));
        return elemento.getText();
    }
}
