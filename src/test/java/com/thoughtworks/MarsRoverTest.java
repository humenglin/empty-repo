package com.thoughtworks;

import static org.assertj.core.api.Assertions.assertThat;

import com.thoughtworks.enumeration.ActionCommandEnum;
import com.thoughtworks.enumeration.DirectionEnum;
import com.thoughtworks.exception.OutOfBoundaryException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverTest {

    @Test
    public void should_move_north_one_step_when_receiveCommands_given_a_move_command_and_face_north() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.NORTH);
        ActionCommandEnum actionCommand = ActionCommandEnum.MOVE;
        MarsPosition marsPositionExpected = new MarsPosition(0, 1, DirectionEnum.NORTH);

        should_return_mars_position_when_action_by_single_command_given_a_init_position_and_a_command(marsPositionBefore, actionCommand, marsPositionExpected);
    }

    @Test
    public void should_turn_west_when_receiveCommands_given_a_turn_left_command_and_face_north() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.NORTH);
        ActionCommandEnum actionCommand = ActionCommandEnum.TURN_LEFT;
        MarsPosition marsPositionExpected = new MarsPosition(0, 0, DirectionEnum.WEST);

        should_return_mars_position_when_action_by_single_command_given_a_init_position_and_a_command(marsPositionBefore, actionCommand, marsPositionExpected);
    }

    @Test
    public void should_turn_east_when_receiveCommands_given_a_turn_right_command_and_face_north() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.NORTH);
        ActionCommandEnum actionCommand = ActionCommandEnum.TURN_RIGHT;
        MarsPosition marsPositionExpected = new MarsPosition(0, 0, DirectionEnum.EAST);

        should_return_mars_position_when_action_by_single_command_given_a_init_position_and_a_command(marsPositionBefore, actionCommand, marsPositionExpected);
    }

    @Test
    public void should_move_south_one_step_when_receiveCommands_given_a_move_command_and_face_south() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.SOUTH);
        ActionCommandEnum actionCommand = ActionCommandEnum.MOVE;
        MarsPosition marsPositionExpected = new MarsPosition(0, -1, DirectionEnum.SOUTH);

        should_return_mars_position_when_action_by_single_command_given_a_init_position_and_a_command(marsPositionBefore, actionCommand, marsPositionExpected);
    }

    @Test
    public void should_turn_east_when_receiveCommands_given_a_turn_left_command_and_face_south() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.SOUTH);
        ActionCommandEnum actionCommand = ActionCommandEnum.TURN_LEFT;
        MarsPosition marsPositionExpected = new MarsPosition(0, 0, DirectionEnum.EAST);

        should_return_mars_position_when_action_by_single_command_given_a_init_position_and_a_command(marsPositionBefore, actionCommand, marsPositionExpected);
    }

    @Test
    public void should_turn_west_when_receiveCommands_given_a_turn_right_command_and_face_south() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.SOUTH);
        ActionCommandEnum actionCommand = ActionCommandEnum.TURN_RIGHT;
        MarsPosition marsPositionExpected = new MarsPosition(0, 0, DirectionEnum.WEST);

        should_return_mars_position_when_action_by_single_command_given_a_init_position_and_a_command(marsPositionBefore, actionCommand, marsPositionExpected);
    }

    @Test
    public void should_move_east_one_step_when_receiveCommands_given_a_move_command_and_face_east() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.EAST);
        ActionCommandEnum actionCommand = ActionCommandEnum.MOVE;
        MarsPosition marsPositionExpected = new MarsPosition(1, 0, DirectionEnum.EAST);

        should_return_mars_position_when_action_by_single_command_given_a_init_position_and_a_command(marsPositionBefore, actionCommand, marsPositionExpected);
    }

    @Test
    public void should_turn_north_when_receiveCommands_given_a_turn_left_command_and_face_east() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.EAST);
        ActionCommandEnum actionCommand = ActionCommandEnum.TURN_LEFT;
        MarsPosition marsPositionExpected = new MarsPosition(0, 0, DirectionEnum.NORTH);

        should_return_mars_position_when_action_by_single_command_given_a_init_position_and_a_command(marsPositionBefore, actionCommand, marsPositionExpected);
    }

    @Test
    public void should_turn_south_when_receiveCommands_given_a_turn_right_command_and_face_east() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.EAST);
        ActionCommandEnum actionCommand = ActionCommandEnum.TURN_RIGHT;
        MarsPosition marsPositionExpected = new MarsPosition(0, 0, DirectionEnum.SOUTH);

        should_return_mars_position_when_action_by_single_command_given_a_init_position_and_a_command(marsPositionBefore, actionCommand, marsPositionExpected);
    }

    @Test
    public void should_move_west_one_step_when_receiveCommands_given_a_move_command_and_face_west() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.WEST);
        ActionCommandEnum actionCommand = ActionCommandEnum.MOVE;
        MarsPosition marsPositionExpected = new MarsPosition(-1, 0, DirectionEnum.WEST);

        should_return_mars_position_when_action_by_single_command_given_a_init_position_and_a_command(marsPositionBefore, actionCommand, marsPositionExpected);
    }

    @Test
    public void should_turn_south_when_receiveCommands_given_a_turn_left_command_and_face_west() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.WEST);
        ActionCommandEnum actionCommand = ActionCommandEnum.TURN_LEFT;
        MarsPosition marsPositionExpected = new MarsPosition(0, 0, DirectionEnum.SOUTH);

        should_return_mars_position_when_action_by_single_command_given_a_init_position_and_a_command(marsPositionBefore, actionCommand, marsPositionExpected);
    }

    @Test
    public void should_turn_north_when_receiveCommands_given_a_turn_right_command_and_face_west() {
        MarsPosition marsPositionBefore = new MarsPosition(0, 0, DirectionEnum.WEST);
        ActionCommandEnum actionCommand = ActionCommandEnum.TURN_RIGHT;
        MarsPosition marsPositionExpected = new MarsPosition(0, 0, DirectionEnum.NORTH);

        should_return_mars_position_when_action_by_single_command_given_a_init_position_and_a_command(marsPositionBefore, actionCommand, marsPositionExpected);
    }

    private void should_return_mars_position_when_action_by_single_command_given_a_init_position_and_a_command(MarsPosition marsPositionBefore, ActionCommandEnum actionCommand, MarsPosition marsPositionExpected) {
        // given
        MarsRover marsRover = new MarsRover(marsPositionBefore);
        List<ActionCommandEnum> actionCommands = new ArrayList<>();
        actionCommands.add(actionCommand);

        // when
        MarsPosition marsPositionAfter = marsRover.receiveCommands(actionCommands);

        // then
        assertThat(marsPositionAfter).isEqualToComparingFieldByField(marsPositionExpected);
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

    @Test(expected = OutOfBoundaryException.class)
    public void should_throw_exception_when_init_position_given_a_out_of_boundary_position() {
        new MarsPosition(6, 3, DirectionEnum.WEST);
    }

    @Test
    public void should_return_boundary_position_when_given_a_boundary_position() {
        MarsPosition marsPosition = new MarsPosition(5, -5, DirectionEnum.WEST);

        assertThat(marsPosition).isEqualToComparingFieldByField(new MarsPosition(5, -5, DirectionEnum.WEST));
    }

    @Test(expected = OutOfBoundaryException.class)
    public void should_throw_exception_when_action_by_single_command_given_a_boundary_position_and_a_move_command() {
        MarsPosition marsPositionBefore = new MarsPosition(5, 0, DirectionEnum.EAST);
        MarsRover marsRover = new MarsRover(marsPositionBefore);

        ActionCommandEnum actionCommand = ActionCommandEnum.MOVE;
        List<ActionCommandEnum> actionCommands = new ArrayList<>();
        actionCommands.add(actionCommand);

        marsRover.receiveCommands(actionCommands);
    }
}
