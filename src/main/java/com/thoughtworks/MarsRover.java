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
        }

        if (ActionCommandEnum.TURN_LEFT == actionCommand) {
            if (DirectionEnum.NORTH == this.marsPosition.getDirection()) {
                this.marsPosition.setDirection(DirectionEnum.WEST);
            }
            if (DirectionEnum.SOUTH == this.marsPosition.getDirection()) {
                this.marsPosition.setDirection(DirectionEnum.EAST);
            }
        }

        if (ActionCommandEnum.TURN_RIGHT == actionCommand) {
            if (DirectionEnum.NORTH == this.marsPosition.getDirection()) {
                this.marsPosition.setDirection(DirectionEnum.EAST);
            }
            if (DirectionEnum.SOUTH == this.marsPosition.getDirection()) {
                this.marsPosition.setDirection(DirectionEnum.WEST);
            }
        }
        return this.marsPosition;
    }
}
