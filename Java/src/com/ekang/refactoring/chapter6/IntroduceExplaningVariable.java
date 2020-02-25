package com.ekang.refactoring.chapter6;

public class IntroduceExplaningVariable {
    private String platform;
    private String browser;
    private int resize;

    public IntroduceExplaningVariable(){
        final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
        final boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > -1;
        final boolean wasResized = resize > 0;

        if(isMacOs && isIEBrowser && wasInitialized() && wasResized) {
            // do somethig;
        }
    }

    public boolean wasInitialized() {
        return true;
    }

}
