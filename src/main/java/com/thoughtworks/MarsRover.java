package com.thoughtworks;

import com.thoughtworks.enumeration.ActionCommandEnum;
import com.thoughtworks.enumeration.DirectionEnum;

public class MarsRover {
    private MarsPosition marsPosition;

    public MarsRover(MarsPosition marsPosition) {
        this.marsPosition = marsPosition;
    }

    public MarsPosition action(ActionCommandEnum actionCommand) {
        if (ActionCommandEnum.MOVE == actionCommand) {
            if (DirectionEnum.NORTH == this.marsPosition.getDirection()) {
                this.marsPosition.setPositionY(this.marsPosition.getPositionY() + 1);
            }
            if (DirectionEnum.SOUTH == this.marsPosition.getDirection()) {
                this.marsPosition.setPositionY(this.marsPosition.getPositionY() - 1);
            }
            if (DirectionEnum.EAST == this.marsPosition.getDirection()) {
                this.marsPosition.setPositionX(this.marsPosition.getPositionX() + 1);
            }
            if (DirectionEnum.WEST == this.marsPosition.getDirection()) {
                this.marsPosition.setPositionX(this.marsPosition.getPositionX() - 1);
            }
        }

        if (ActionCommandEnum.TURN_LEFT == actionCommand) {
            if (DirectionEnum.NORTH == this.marsPosition.getDirection()) {
                this.marsPosition.setDirection(DirectionEnum.WEST);
            } else if (DirectionEnum.SOUTH == this.marsPosition.getDirection()) {
                this.marsPosition.setDirection(DirectionEnum.EAST);
            } else if (DirectionEnum.EAST == this.marsPosition.getDirection()) {
                this.marsPosition.setDirection(DirectionEnum.NORTH);
            }
        }

        if (ActionCommandEnum.TURN_RIGHT == actionCommand) {
            if (DirectionEnum.NORTH == this.marsPosition.getDirection()) {
                this.marsPosition.setDirection(DirectionEnum.EAST);
            } else if (DirectionEnum.SOUTH == this.marsPosition.getDirection()) {
                this.marsPosition.setDirection(DirectionEnum.WEST);
            } else if (DirectionEnum.EAST == this.marsPosition.getDirection()) {
                this.marsPosition.setDirection(DirectionEnum.SOUTH);
            }
        }
        return this.marsPosition;
    }
}
