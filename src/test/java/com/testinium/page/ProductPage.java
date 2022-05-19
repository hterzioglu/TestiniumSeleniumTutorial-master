package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
public class ProductPage {
    Methods methods ;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage(){
        methods = new Methods();
    }

    public void scrollAndSelect(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(5);
        methods.click(By.cssSelector("div:nth-of-type(7) > .grid_7.omega"));
        methods.waitBySeconds(5);
        //methods.scrollWithAction(By.cssSelector("div:nth-of-type(7) > .grid_7_omega"));
        //methods.waitBySeconds(5);
        //methods.selectByText(By.cssSelector("select#review-sort-selection"),
          //      "Oylama (Düşük > Yüksek)");
        //methods.waitBySeconds(5);
    }

    public void attributeTest(){
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
        System.out.println("Alınan text: " + attribute);
        logger.info("Alınan text: " + attribute);
        methods.waitBySeconds(5);
    }

    public void textControlTest(){
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text: " +text);
        logger.info("Alınan text: " +text);
        methods.waitBySeconds(5);
    }

    public void valueControlTest(){
        methods.sendKeys(By.id("search-input"),"testinium");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan text: " + value);
        logger.info("Alınan text: " + value);
        Assert.assertEquals("testinium",value);
        methods.waitBySeconds(5);
    }

    public void searchOyuncak(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(5);
    }
    public void puanKatalogu(){
        methods.click(By.className("lvl1catalog"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri"));
        methods.waitBySeconds(3);

        }
        public void klasikler(){
        methods.click(By.className("lvl1catalog"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(3);
            //methods.selectByText(By.cssSelector("select#sort-selection"),
            //        "Oylama (Yüksek > Düşük");
        }
       /* public void urunEkleme(){

            methods.click(By.xpath("//div[@class='menu-top-button login']"));
            methods.waitBySeconds(3);
            methods.sendKeys(By.id("login-email"),"hayrettin.terzioglu@testinium.com");
            methods.waitBySeconds(3);
            methods.sendKeys(By.xpath("//input[@id='login-password']"),"22a33b44c");
            methods.waitBySeconds(3);
            methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
            methods.waitBySeconds(3);
            methods.click(By.xpath());
            methods.waitBySeconds(3);
        }*/

    }


