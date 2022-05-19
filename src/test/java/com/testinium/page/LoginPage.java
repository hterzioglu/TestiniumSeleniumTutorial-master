package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.logging.Logger;

public class LoginPage {

    Methods methods;

    public LoginPage(){
        methods = new Methods();
    }

    public void login(){
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-email"),"hayrettin.terzioglu@testinium.com");
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//input[@id='login-password']"),"22a33b44c");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(3);
        Assert.assertTrue(methods.isElementVisible(By
                .cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn")));
    }
    public void scrollAndSelect(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".pr-img-link"));
        methods.waitBySeconds(5);
        methods.scrollWithAction(By.cssSelector("#review-reply-button"));
        methods.waitBySeconds(5);
        methods.selectByText(By.cssSelector("select#review-sort-selection"),
                "Oylama (Düşük > Yüksek)");
        methods.waitBySeconds(5);
    }
}
