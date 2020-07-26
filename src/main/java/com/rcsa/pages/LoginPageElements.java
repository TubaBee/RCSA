package com.rcsa.pages;


import com.rcsa.testbase.BaseClass;
import com.rcsa.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageElements extends CommonMethods {


    @FindBy(id = "username")
    public WebElement username;


    @FindBy(id = "password")
    public WebElement password;


    @FindBy(id = "loginbtn")
    public WebElement loginBtn;

    @FindBy(xpath = "//div[@class='alert alert-icon alert-danger alert-dismissible']")
    public WebElement errorMsg;

    @FindBy(xpath = "//figcaption")
    public WebElement course;


    public LoginPageElements() {
        PageFactory.initElements(BaseClass.driver, this);
    }
}