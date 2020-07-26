package com.rcsa.pages;

import com.rcsa.testbase.BaseClass;
import com.rcsa.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssigmentPageElements extends CommonMethods {


    @FindBy(xpath = "//*[@id='dropdown-2']")
    public WebElement editSettingOn;

    @FindBy(xpath = "//*[@id='dropdown-6']")
    public WebElement editSettingOff;


    @FindBy(xpath = "//*[@id='action_link5eb0edc5b6d4c13']")
    public WebElement turnEditOn;

    @FindBy(xpath = "//*[@id='action_link5eb0ece4a3d1d25']")
    public WebElement turnEditOff;



    @FindBy(id = "item_assign")
    public WebElement AssigmentRadiobtn;

    @FindBy(xpath = "//*[@id=\"chooserform\"]/div[3]/input[1]")
    public WebElement addBtn;


    public AssigmentPageElements() {
        PageFactory.initElements(BaseClass.driver, this);
    }

}
