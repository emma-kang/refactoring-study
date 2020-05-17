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
    private TelephoneNumber _officeTelephone = new TelephoneNumber();

    public String getName() {
        return _name;
    }
    // Let's extract the telephone number
    public String getTelephoneNumber() {
        return ("(" + getOfficeAreaCode() + ")" + _officeNumber);
    }
    String getOfficeAreaCode() {
        return _officeTelephone.getAreaCode();
    }
    void setOfficeAreaCode(String arg) {
        _officeTelephone.setAreaCode(arg);
    }
    String getOfficeNumber() {
        return _officeNumber;
    }
    void setOfficeNumber(String arg) {
        _officeNumber = arg;
    }
}
