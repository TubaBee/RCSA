package com.rcsa.pages;

import com.rcsa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingNewAssigment {

    @FindBy(xpath = "//*[@id=\"id_name\"]")
    public WebElement AssgName;

    @FindBy(xpath = "//i[@title='Bold']")
    public WebElement Bold;

    @FindBy(xpath = "//i[@title='Underline']")
    public WebElement underline;

    @FindBy(id = "id_introeditoreditable")
    public WebElement description;

    @FindBy(xpath = "//*[@id=\"id_showdescription\"]")
    public WebElement display;

//    @FindBy(id = "id_showdescription")
//    public WebElement display;

    @FindBy(xpath = "//a[@title='Add...']")
    public WebElement addImg;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement choose;

    @FindBy(name = "license")
    public WebElement license;

    @FindBy(xpath = "//button[starts-with(@class, 'fp-upload')]")
    public WebElement upload;

    @FindBy(id = "id_assigntype")
    public WebElement assingtype;


    public String [] calendarXpath= {"id_allowsubmissionsfromdate_calendar","id_duedate_calendar"};

    @FindBy(linkText = "Feedback types")
    public WebElement feedback;

    @FindBy(linkText = "Grade")
    public WebElement grade;

    @FindBy(id = "id_grade_modgrade_point")
    public WebElement point;

    @FindBy(id = "id_gradecat")
    public WebElement gradeCat;

    @FindBy(id = "id_submitbutton")
    public WebElement submitBut;

    @FindBy(xpath = "//div[@role='main']/h2")
    public WebElement actual;


    public AddingNewAssigment() {
        PageFactory.initElements(BaseClass.driver, this);
    }
}
