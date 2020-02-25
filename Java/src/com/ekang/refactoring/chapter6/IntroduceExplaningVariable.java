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

    /*
     * Expression can become very complex and hard to read.
     * In such situations temporary variables can be helpful to break down the expression
     * into something more manageable.
     *
     * Declare a final temporary variable, and set it to the result of part of the complex expression
     * Replace the result part of the expression with the value of the temp. 
     */

}
