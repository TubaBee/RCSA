package com.rcsa.pages;

import com.rcsa.testbase.BaseClass;
import com.rcsa.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPageElements extends CommonMethods {

    @FindBy(xpath = "//*[@id=\"slick-slide-1\"]/div/div/div/div/figure/figcaption/a")
    public WebElement viewcourse;





    public DashBoardPageElements() {
        PageFactory.initElements(BaseClass.driver, this);
    }
}
