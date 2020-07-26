package com.rcsa.utils;

public class Constants {
    public static final String CHROME_DRIVER_PATH = "./src/main/resources/drivers/chromedriver.exe";

    public static final String GECKO_DRIVER_PATH = System.getProperty("user.dir")
            + "/src/main/resources/drivers/geckodriver.exe";

    public static final int PAGE_LOAD_TIME = 30;

    public static final int IMPLICIT_LOAD_TIME = 10;

    public static final int EXPLICIT_LOAD_TIME = 30;

    public static final String CREDENTIALS_FILEPATH = System.getProperty("user.dir")
            + "/src/main/resources/configs/Configuration.properties";

    public static final String XL_DATA_FILEPATH = System.getProperty("user.dir")
            + "/src/main/resources/testdata/HrmsTestData.xlsx";

    public static final String REPORT_FILEPATH = System.getProperty("user.dir") + "/target/report/RCSA.html";

    public static final String OS_NAME = System.getProperty("os.name");

    public static final String USER_NAME = System.getProperty("user.name");

    public static final String SCREENSHOTS_FILEPATH = System.getProperty("user.dir") + "/target/screenshots/";
}