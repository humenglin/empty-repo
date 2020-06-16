package com.thoughtworks;

import com.thoughtworks.constants.CHECKMSG;
import com.thoughtworks.enumeration.DirectionEnum;
import com.thoughtworks.exception.OutOfBoundaryException;

public class MarsPosition {
    public static final int BOUNDARY = 5;
    private int positionX;
    private int positionY;
    private DirectionEnum direction;

    public MarsPosition(int positionX, int positionY, DirectionEnum direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
        checkPosition();
    }

    public void checkPosition() {
        if (this.positionX < -BOUNDARY || this.positionX > BOUNDARY || this.positionY < -BOUNDARY || this.positionY > BOUNDARY) {
            throw new OutOfBoundaryException(CHECKMSG.OUT_OF_BOUNDARY, CHECKMSG.OUT_OF_BOUNDARY);
        }
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

    void move(MarsRover marsRover) {
        if (DirectionEnum.NORTH == getDirection()) {
            setPositionY(getPositionY() + 1);
        }
        if (DirectionEnum.SOUTH == getDirection()) {
            setPositionY(getPositionY() - 1);
        }
        if (DirectionEnum.EAST == getDirection()) {
            setPositionX(getPositionX() + 1);
        }
        if (DirectionEnum.WEST == getDirection()) {
            setPositionX(getPositionX() - 1);
        }
        checkPosition();
    }

    void turnLeft(MarsRover marsRover) {
        if (DirectionEnum.NORTH == getDirection()) {
            setDirection(DirectionEnum.WEST);
        } else if (DirectionEnum.SOUTH == getDirection()) {
            setDirection(DirectionEnum.EAST);
        } else if (DirectionEnum.EAST == getDirection()) {
            setDirection(DirectionEnum.NORTH);
        } else if (DirectionEnum.WEST == getDirection()) {
            setDirection(DirectionEnum.SOUTH);
        }
    }

    void turnRight(MarsRover marsRover) {
        if (DirectionEnum.NORTH == getDirection()) {
            setDirection(DirectionEnum.EAST);
        } else if (DirectionEnum.SOUTH == getDirection()) {
            setDirection(DirectionEnum.WEST);
        } else if (DirectionEnum.EAST == getDirection()) {
            setDirection(DirectionEnum.SOUTH);
        } else if (DirectionEnum.WEST == getDirection()) {
            setDirection(DirectionEnum.NORTH);
        }
    }
}
