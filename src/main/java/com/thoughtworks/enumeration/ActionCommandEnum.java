package com.thoughtworks.enumeration;

public enum ActionCommandEnum {
    MOVE("M");

    private String actionValue;

    ActionCommandEnum(String actionValue) {
        this.actionValue = actionValue;
    }
}
