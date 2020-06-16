package com.thoughtworks.enumeration;

public enum ActionCommandEnum {
    MOVE("M"),
    TURN_LEFT("L"),
    TURN_RIGHT("R");

    private String actionValue;

    ActionCommandEnum(String actionValue) {
        this.actionValue = actionValue;
    }
}
