package testcases;

import com.codeborne.selenide.Condition;
import org.junit.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.*;

public class AddToCart {

    @Test
    public void TC_001_AddToCartFirstThenEmptyCart(){
        open("https://www.webstaurantstore.com/");
        $("#searchval").shouldBe(Condition.visible).setValue("stainless work table").pressEnter();
        $("#paging").shouldBe(Condition.visible);
        int pages = $$("#paging>div > ul > li").size();
        //click on last page link
        $$("#paging>div>ul>li").get(pages-2).click();
        //select last product add to cart
        sleep(3000);
        int productsPerPage = $$("div .description").size();
        System.out.println(productsPerPage);
        String lastProductDescription = $$("div .description").get(productsPerPage - 2).getText();
        System.out.println(lastProductDescription);
        assertEquals("Eagle Group T3684GTE 36\" x 84\" Open Base Stainless Steel Commercial Work Table",lastProductDescription);
    }
}
