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

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }
}
