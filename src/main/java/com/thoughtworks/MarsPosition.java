package com.thoughtworks;

import com.thoughtworks.enumeration.DirectionEnum;

public class MarsPosition {
    private int positionX;
    private int positionY;
    private DirectionEnum direction;

    public MarsPosition(int positionX, int positionY, DirectionEnum direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
    }
}
