package com.ekang.refactoring.chapter7;

public class TelephoneNumber {
    private String _areaCode;
    private String _number;

    String getAreaCode() {
        return _areaCode;
    }
    void setAreaCode(String arg) {
        _areaCode = arg;
    }

    public String get_number() {
        return _number;
    }

    public void set_number(String _number) {
        this._number = _number;
    }

    public String getTelephoneNumber() {
        return ("(" + _areaCode + ") " + _number);
    }
}
