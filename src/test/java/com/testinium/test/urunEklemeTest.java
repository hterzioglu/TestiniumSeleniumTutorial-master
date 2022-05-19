package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class urunEklemeTest extends BaseTest {
    @Test
    public void urunEklemeTest(){

        ProductPage productPage = new ProductPage();
        productPage.urunEkleme();
    }

}
