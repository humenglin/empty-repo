package com.thoughtworks;

import com.thoughtworks.enumeration.ActionCommandEnum;

import java.util.List;

public class MarsRover {
    private MarsPosition marsPosition;

    public MarsRover(MarsPosition marsPosition) {
        this.marsPosition = marsPosition;
    }

    public MarsPosition receiveCommands(List<ActionCommandEnum> actionCommands) {
        for (ActionCommandEnum actionCommand : actionCommands) {
            this.marsPosition = action(actionCommand);
        }
        return this.marsPosition;
    }

    private MarsPosition action(ActionCommandEnum actionCommand) {
        if (ActionCommandEnum.MOVE == actionCommand) {
            marsPosition.move(this);
        }

        if (ActionCommandEnum.TURN_LEFT == actionCommand) {
            marsPosition.turnLeft(this);
        }

        if (ActionCommandEnum.TURN_RIGHT == actionCommand) {
            marsPosition.turnRight(this);
        }
        return this.marsPosition;
    }

}
