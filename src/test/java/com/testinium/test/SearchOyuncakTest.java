package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class SearchOyuncakTest extends BaseTest {
    @Test
    public void searchTest(){
        ProductPage productPage = new ProductPage();
        productPage.searchOyuncak();
    }
}
