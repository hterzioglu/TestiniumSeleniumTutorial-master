package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class PuanKataloguTest extends BaseTest {
    @Test
            public void puanKataloguTest(){
        ProductPage productPage = new ProductPage();
        productPage.puanKatalogu();

    }

}

