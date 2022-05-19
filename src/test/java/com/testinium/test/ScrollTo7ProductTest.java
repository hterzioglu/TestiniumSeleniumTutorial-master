package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class ScrollTo7ProductTest extends BaseTest {
    @Test
    public void scrolltoSevenTest(){
        ProductPage productPage = new ProductPage();
        productPage.scrollAndSelect();

    }

}
