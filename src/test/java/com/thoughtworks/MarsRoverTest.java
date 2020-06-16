package com.thoughtworks;

import static org.assertj.core.api.Assertions.assertThat;

import com.thoughtworks.enumeration.ActionCommandEnum;
import com.thoughtworks.enumeration.DirectionEnum;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverTest {

    @Test
    public void should_move_north_one_step_when_action_given_a_move_command_and_face_north() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.NORTH);
        ActionCommandEnum actionCommand = ActionCommandEnum.MOVE;

        MarsRover marsRover = new MarsRover(marsPositionBefore);
        MarsPosition marsPositionAfter = marsRover.action(actionCommand);

        assertThat(marsPositionAfter).isEqualToComparingFieldByField(new MarsPosition(0, 1, DirectionEnum.NORTH));
    }

    @Test
    public void should_turn_west_when_action_given_a_turn_left_command_and_face_north() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.NORTH);
        ActionCommandEnum actionCommand = ActionCommandEnum.TURN_LEFT;

        MarsRover marsRover = new MarsRover(marsPositionBefore);
        MarsPosition marsPositionAfter = marsRover.action(actionCommand);

        assertThat(marsPositionAfter).isEqualToComparingFieldByField(new MarsPosition(0, 0, DirectionEnum.WEST));
    }

    @Test
    public void should_turn_east_when_action_given_a_turn_right_command_and_face_north() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.NORTH);
        ActionCommandEnum actionCommand = ActionCommandEnum.TURN_RIGHT;

        MarsRover marsRover = new MarsRover(marsPositionBefore);
        MarsPosition marsPositionAfter = marsRover.action(actionCommand);

        assertThat(marsPositionAfter).isEqualToComparingFieldByField(new MarsPosition(0, 0, DirectionEnum.EAST));
    }

    @Test
    public void should_move_south_one_step_when_action_given_a_move_command_and_face_south() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.SOUTH);
        ActionCommandEnum actionCommand = ActionCommandEnum.MOVE;

        MarsRover marsRover = new MarsRover(marsPositionBefore);
        MarsPosition marsPositionAfter = marsRover.action(actionCommand);

        assertThat(marsPositionAfter).isEqualToComparingFieldByField(new MarsPosition(0, -1, DirectionEnum.SOUTH));
    }

    @Test
    public void should_turn_east_when_action_given_a_turn_left_command_and_face_south() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.SOUTH);
        ActionCommandEnum actionCommand = ActionCommandEnum.TURN_LEFT;

        MarsRover marsRover = new MarsRover(marsPositionBefore);
        MarsPosition marsPositionAfter = marsRover.action(actionCommand);

        assertThat(marsPositionAfter).isEqualToComparingFieldByField(new MarsPosition(0, 0, DirectionEnum.EAST));
    }

    @Test
    public void should_turn_west_when_action_given_a_turn_right_command_and_face_south() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.SOUTH);
        ActionCommandEnum actionCommand = ActionCommandEnum.TURN_RIGHT;

        MarsRover marsRover = new MarsRover(marsPositionBefore);
        MarsPosition marsPositionAfter = marsRover.action(actionCommand);

        assertThat(marsPositionAfter).isEqualToComparingFieldByField(new MarsPosition(0, 0, DirectionEnum.WEST));
    }

    @Test
    public void should_move_east_one_step_when_action_given_a_move_command_and_face_east() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.EAST);
        ActionCommandEnum actionCommand = ActionCommandEnum.MOVE;

        MarsRover marsRover = new MarsRover(marsPositionBefore);
        MarsPosition marsPositionAfter = marsRover.action(actionCommand);

        assertThat(marsPositionAfter).isEqualToComparingFieldByField(new MarsPosition(1, 0, DirectionEnum.EAST));
    }

    @Test
    public void should_turn_north_when_action_given_a_turn_left_command_and_face_east() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.EAST);
        ActionCommandEnum actionCommand = ActionCommandEnum.TURN_LEFT;

        MarsRover marsRover = new MarsRover(marsPositionBefore);
        MarsPosition marsPositionAfter = marsRover.action(actionCommand);

        assertThat(marsPositionAfter).isEqualToComparingFieldByField(new MarsPosition(0, 0, DirectionEnum.NORTH));
    }

    @Test
    public void should_turn_south_when_action_given_a_turn_right_command_and_face_east() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.EAST);
        ActionCommandEnum actionCommand = ActionCommandEnum.TURN_RIGHT;

        MarsRover marsRover = new MarsRover(marsPositionBefore);
        MarsPosition marsPositionAfter = marsRover.action(actionCommand);

        assertThat(marsPositionAfter).isEqualToComparingFieldByField(new MarsPosition(0, 0, DirectionEnum.SOUTH));
    }

    @Test
    public void should_move_west_one_step_when_action_given_a_move_command_and_face_west() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.WEST);
        ActionCommandEnum actionCommand = ActionCommandEnum.MOVE;

        MarsRover marsRover = new MarsRover(marsPositionBefore);
        MarsPosition marsPositionAfter = marsRover.action(actionCommand);

        assertThat(marsPositionAfter).isEqualToComparingFieldByField(new MarsPosition(-1, 0, DirectionEnum.WEST));
    }

    @Test
    public void should_turn_south_when_action_given_a_turn_left_command_and_face_west() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.WEST);
        ActionCommandEnum actionCommand = ActionCommandEnum.TURN_LEFT;

        MarsRover marsRover = new MarsRover(marsPositionBefore);
        MarsPosition marsPositionAfter = marsRover.action(actionCommand);

        assertThat(marsPositionAfter).isEqualToComparingFieldByField(new MarsPosition(0, 0, DirectionEnum.SOUTH));
    }

    @Test
    public void should_turn_north_when_action_given_a_turn_right_command_and_face_west() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.WEST);
        ActionCommandEnum actionCommand = ActionCommandEnum.TURN_RIGHT;

        MarsRover marsRover = new MarsRover(marsPositionBefore);
        MarsPosition marsPositionAfter = marsRover.action(actionCommand);

        assertThat(marsPositionAfter).isEqualToComparingFieldByField(new MarsPosition(0, 0, DirectionEnum.NORTH));
    }

    @Test
    public void should_move_to_some_position_when_receiveCommands_given_a_series_commands() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.WEST);
        List<ActionCommandEnum> actionCommands = new ArrayList<>();
        ActionCommandEnum actionCommand1 = ActionCommandEnum.TURN_RIGHT;
        ActionCommandEnum actionCommand2 = ActionCommandEnum.MOVE;
        ActionCommandEnum actionCommand3 = ActionCommandEnum.TURN_LEFT;
        ActionCommandEnum actionCommand4 = ActionCommandEnum.TURN_LEFT;
        ActionCommandEnum actionCommand5 = ActionCommandEnum.MOVE;
        ActionCommandEnum actionCommand6 = ActionCommandEnum.MOVE;
        actionCommands.add(actionCommand1);
        actionCommands.add(actionCommand2);
        actionCommands.add(actionCommand3);
        actionCommands.add(actionCommand4);
        actionCommands.add(actionCommand5);
        actionCommands.add(actionCommand6);

        MarsRover marsRover = new MarsRover(marsPositionBefore);
        MarsPosition marsPositionAfter = marsRover.receiveCommands(actionCommands);

        assertThat(marsPositionAfter).isEqualToComparingFieldByField(new MarsPosition(0, -1, DirectionEnum.SOUTH));
    }
}
