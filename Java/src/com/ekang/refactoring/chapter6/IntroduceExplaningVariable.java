package com.ekang.refactoring.chapter6;

public class IntroduceExplaningVariable {
    private String platform;
    private String browser;
    private int resize;

    public IntroduceExplaningVariable(){
        if((platform.toUpperCase().indexOf("MAC") > -1) &&
                (browser.toUpperCase().indexOf("IE") > -1) &&
                wasInitialized() && resize > 0) {
            // do somethig;
        }
    }

    public boolean wasInitialized() {
        return true;
    }

}
