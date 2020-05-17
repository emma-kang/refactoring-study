package com.ekang.refactoring.chapter7;

/**
 * 2020-05-17
 * Chapter 7
 * Extract Method Example
 */
public class Person {
    private String _name;
    private String _officeAreaCode;
    private String _officeNumber;

    public String getName() {
        return _name;
    }
    public String getTelephoneNumber() {
        return ("(" + _officeAreaCode + ")" + _officeNumber);
    }
    String getOfficeAreaCode() {
        return _officeAreaCode;
    }
    void setOfficeAreaCode(String arg) {
        _officeAreaCode = arg;
    }
    String getOfficeNumber() {
        return _officeNumber;
    }
    void setOfficeNumber(String arg) {
        _officeNumber = arg;
    }
}
