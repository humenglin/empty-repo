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
                return this.marsPosition;
            }
            if (DirectionEnum.SOUTH == this.marsPosition.getDirection()) {
                this.marsPosition.setPositionY(this.marsPosition.getPositionY() - 1);
                return this.marsPosition;
            }
        }

        if (ActionCommandEnum.TURN_LEFT == actionCommand) {
            return new MarsPosition(0, 0, DirectionEnum.WEST);
        }

        if (ActionCommandEnum.TURN_RIGHT == actionCommand) {
            return new MarsPosition(0, 0, DirectionEnum.EAST);
        }
        return null;
    }
}
