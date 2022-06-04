package com.vildanova.config;

import org.openqa.selenium.Dimension;

public class BrowserSettings {

    /**
     * Browser selection options:
     * "CHROME"
     * "FIREFOX"
     * "EDGE"
     */
    public static final String BROWSER = "CHROME";

    /**
     * Screen resolution select options if parameter browserSizeMax = false:
     * "1600x900"
     * "1366х768"
     * "1920х1080" etc
     */
    public static final boolean BROWSER_SIZE_MAX = true;
    public static final Dimension BROWSER_SIZE = new Dimension(1920, 1080);

    public static final Boolean CLEAR_COOKIES_AND_STORAGE = true;
    public static final Boolean HOLD_BROWSER_OPEN = true;
}
