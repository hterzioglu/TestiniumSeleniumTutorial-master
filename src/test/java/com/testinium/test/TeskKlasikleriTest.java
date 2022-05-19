package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class TeskKlasikleriTest extends BaseTest {
   @Test
   public void turkKlasikleriTest(){
       ProductPage productPage = new ProductPage();
       productPage.klasikler();
   }


}
