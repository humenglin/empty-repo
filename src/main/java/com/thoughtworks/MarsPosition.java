package com.thoughtworks;

import com.thoughtworks.constants.CHECKMSG;
import com.thoughtworks.enumeration.DirectionEnum;
import com.thoughtworks.exception.OutOfBoundaryException;

public class MarsPosition {
    private int positionX;
    private int positionY;
    private DirectionEnum direction;

    public MarsPosition(int positionX, int positionY, DirectionEnum direction) {
        if (positionX < -5 || positionX > 5 || positionY < -5 || positionY > 5) {
            throw new OutOfBoundaryException(CHECKMSG.OUT_OF_BOUNDARY, CHECKMSG.OUT_OF_BOUNDARY);
        }
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
