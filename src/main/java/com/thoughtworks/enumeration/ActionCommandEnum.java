package com.thoughtworks.enumeration;

public enum ActionCommandEnum {
    MOVE("M"),
    TURN_LEFT("L");

    private String actionValue;

    ActionCommandEnum(String actionValue) {
        this.actionValue = actionValue;
    }
}
