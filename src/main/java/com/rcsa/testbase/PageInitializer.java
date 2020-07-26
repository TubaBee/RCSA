package com.rcsa.testbase;

import com.rcsa.pages.AddingNewAssigment;
import com.rcsa.pages.AssigmentPageElements;
import com.rcsa.pages.DashBoardPageElements;
import com.rcsa.pages.LoginPageElements;

public class PageInitializer extends BaseClass {

    public static LoginPageElements login;
    public static AssigmentPageElements AssigmentActivity;
    public static AddingNewAssigment AddingNewA;
    public static DashBoardPageElements dashBoard;

    public static void initializeAll() {
        login = new LoginPageElements();
        AssigmentActivity= new AssigmentPageElements();
        AddingNewA = new AddingNewAssigment();
        dashBoard = new DashBoardPageElements();

    }
}