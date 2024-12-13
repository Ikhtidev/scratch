package uz.murodov.scratch.utils

import uz.murodov.scratch.R
import uz.murodov.scratch.model.CategoryCommand
import uz.murodov.scratch.model.Command

object Categories {
    val categoryCommandList = listOf(
        CategoryCommand(
            name = "Interfeys",
            color = R.color.color_category_interfeys,
            commands = listOf(
                Command(R.drawable.interfeys_all, "interfeys_all"),
                Command(R.drawable.interfeys_draw, "interfeys_draw"),
                Command(R.drawable.interfeys_select, "interfeys_select"),
                Command(R.drawable.interfeys_surprise, "interfeys_surprise")
            )
        ),
        CategoryCommand(
            name = "Motion",
            color = R.color.color_category_motion,
            commands = listOf(
                Command(R.drawable.motion_change_x_by, "motion_change_x_by"),
                Command(R.drawable.motion_change_y_by, "motion_change_y_by"),
                Command(R.drawable.motion_direction, "motion_direction"),
                Command(R.drawable.motion_glide_secs_to_random, "motion_glide_secs_to_random"),
                Command(R.drawable.motion_glide_secs_to_x_y, "motion_glide_secs_to_x_y"),
                Command(R.drawable.motion_go_to_random, "motion_go_to_random"),
                Command(R.drawable.motion_go_to_x_y, "motion_go_to_x_y"),
                Command(R.drawable.motion_if_on_edge, "motion_if_on_edge"),
                Command(R.drawable.motion_move_ccw_degrees, "motion_move_ccw_degrees"),
                Command(R.drawable.motion_move_cw_degrees, "motion_move_cw_degrees"),
                Command(R.drawable.motion_move_steps, "motion_move_steps"),
                Command(R.drawable.motion_point_in_direction, "motion_point_in_direction"),
                Command(R.drawable.motion_point_towards, "motion_point_towards"),
                Command(R.drawable.motion_set_x_to, "motion_set_x_to"),
                Command(R.drawable.motion_set_y_to, "motion_set_y_to"),
                Command(R.drawable.motion_x_position, "motion_x_position"),
                Command(R.drawable.motion_y_position, "motion_y_position")
            )
        ),
        CategoryCommand(
            name = "Looks",
            color = R.color.color_category_looks,
            commands = listOf(
                Command(R.drawable.looks_backdrop, "looks_backdrop"),
                Command(R.drawable.looks_change_color_effect_by, "looks_change_color_effect_by"),
                Command(R.drawable.looks_change_size_by, "looks_change_size_by"),
                Command(R.drawable.looks_change_size_by_percent, "looks_change_size_by_percent"),
                Command(R.drawable.looks_clear_graphic_effects, "looks_clear_graphic_effects"),
                Command(R.drawable.looks_costume, "looks_costume"),
                Command(
                    R.drawable.looks_go_forward_backward_layers,
                    "looks_go_forward_backward_layers"
                ),
                Command(R.drawable.looks_go_to_layer, "looks_go_to_layer"),
                Command(R.drawable.looks_hide, "looks_hide"),
                Command(R.drawable.looks_next_backdrop, "looks_next_backdrop"),
                Command(R.drawable.looks_next_costume, "looks_next_costume"),
                Command(R.drawable.looks_say_secs, "looks_say_secs"),
                Command(R.drawable.looks_set_effect_to, "looks_set_effect_to"),
                Command(R.drawable.looks_show, "looks_show"),
                Command(R.drawable.looks_size, "looks_size"),
                Command(R.drawable.looks_switch_backdrop, "looks_switch_backdrop"),
                Command(R.drawable.looks_switch_costume_to, "looks_switch_costume_to"),
                Command(R.drawable.looks_think, "looks_think"),
                Command(R.drawable.looks_think_secs, "looks_think_secs")
            )
        ),
        CategoryCommand(
            name = "Sound",
            color = R.color.color_category_sound,
            commands = listOf(
                Command(R.drawable.sound_change_effect_by, "sound_change_effect_by"),
                Command(R.drawable.sound_change_volume_by, "sound_change_volume_by"),
                Command(R.drawable.sound_clear_sound_effects, "sound_clear_sound_effects"),
                Command(R.drawable.sound_play_sound_until, "sound_play_sound_until"),
                Command(R.drawable.sound_set_effect_to, "sound_set_effect_to"),
                Command(R.drawable.sound_set_volume_to_percent, "sound_set_volume_to_percent"),
                Command(R.drawable.sound_start_sound, "sound_start_sound"),
                Command(R.drawable.sound_stop_all_sounds, "sound_stop_all_sounds"),
                Command(R.drawable.sound_volume, "sound_volume")
            )
        ),
        CategoryCommand(
            name = "Events",
            color = R.color.color_category_events,
            commands = listOf(
                Command(R.drawable.events_when_backdrop_switches, "events_when_backdrop_switches"),
                Command(R.drawable.events_when_flag_clicked, "events_when_flag_clicked"),
                Command(R.drawable.events_when_i_receive, "events_when_i_receive"),
                Command(R.drawable.events_when_key_pressed, "events_when_key_pressed"),
                Command(
                    R.drawable.events_when_loudness_greater_than,
                    "events_when_loudness_greater_than"
                ),
                Command(
                    R.drawable.events_when_this_sprite_clicked,
                    "events_when_this_sprite_clicked"
                )
            )
        ),
        CategoryCommand(
            name = "Control",
            color = R.color.color_category_control,
            commands = listOf(
                Command(R.drawable.control_broadcast, "control_broadcast"),
                Command(R.drawable.control_broadcast_and_wait, "control_broadcast_and_wait"),
                Command(R.drawable.control_create_clone, "control_create_clone"),
                Command(R.drawable.control_delete_this_clone, "control_delete_this_clone"),
                Command(R.drawable.control_forever, "control_forever"),
                Command(R.drawable.control_if_then, "control_if_then"),
                Command(R.drawable.control_if_then_else, "control_if_then_else"),
                Command(R.drawable.control_repeat, "control_repeat"),
                Command(R.drawable.control_repeat_until, "control_repeat_until"),
                Command(R.drawable.control_stop_all, "control_stop_all"),
                Command(R.drawable.control_when_start_as_clone, "control_when_start_as_clone")
            )
        ),
        CategoryCommand(
            name = "Sensing",
            color = R.color.color_category_sensing,
            commands = listOf(
                Command(R.drawable.sensing_answer, "sensing_answer"),
                Command(R.drawable.sensing_ask_and_wait, "sensing_ask_and_wait"),
                Command(
                    R.drawable.sensing_color_is_touching_color,
                    "sensing_color_is_touching_color"
                ),
                Command(R.drawable.sensing_current, "sensing_current"),
                Command(R.drawable.sensing_days_since_2000, "sensing_days_since_2000"),
                Command(
                    R.drawable.sensing_distance_to_mouse_pointer,
                    "sensing_distance_to_mouse_pointer"
                ),
                Command(R.drawable.sensing_key_pressed, "sensing_key_pressed"),
                Command(R.drawable.sensing_loudness, "sensing_loudness"),
                Command(R.drawable.sensing_mouse_down, "sensing_mouse_down"),
                Command(R.drawable.sensing_mouse_x, "sensing_mouse_x"),
                Command(R.drawable.sensing_mouse_y, "sensing_mouse_y"),
                Command(R.drawable.sensing_of_stage, "sensing_of_stage"),
                Command(R.drawable.sensing_reset_timer, "sensing_reset_timer"),
                Command(R.drawable.sensing_set_drag_mode, "sensing_set_drag_mode"),
                Command(R.drawable.sensing_time, "sensing_time"),
                Command(R.drawable.sensing_touching_color, "sensing_touching_color"),
                Command(R.drawable.sensing_touching_edge, "sensing_touching_edge"),
                Command(
                    R.drawable.sensing_touching_mouse_pointer,
                    "sensing_touching_mouse_pointer"
                ),
                Command(R.drawable.sensing_username, "sensing_username")
            )
        ),
        CategoryCommand(
            name = "Operators",
            color = R.color.color_category_operators,
            commands = listOf(
                Command(R.drawable.operators_add, "operators_add"),
                Command(R.drawable.operators_and, "operators_and"),
                Command(R.drawable.operators_contains, "operators_contains"),
                Command(R.drawable.operators_divide, "operators_divide"),
                Command(R.drawable.operators_equals, "operators_equals"),
                Command(R.drawable.operators_greater_than, "operators_greater_than"),
                Command(R.drawable.operators_join, "operators_join"),
                Command(R.drawable.operators_length_of, "operators_length_of"),
                Command(R.drawable.operators_less_than, "operators_less_than"),
                Command(R.drawable.operators_letter_of, "operators_letter_of"),
                Command(R.drawable.operators_mod, "operators_mod"),
                Command(R.drawable.operators_multiply, "operators_multiply"),
                Command(R.drawable.operators_not, "operators_not"),
                Command(R.drawable.operators_of, "operators_of"),
                Command(R.drawable.operators_or, "operators_or"),
                Command(R.drawable.operators_random, "operators_random"),
                Command(R.drawable.operators_round, "operators_round"),
                Command(R.drawable.operators_subtract, "operators_subtract")
            )
        ),
        CategoryCommand(
            name = "Variables",
            color = R.color.color_category_variables,
            commands = listOf(
                Command(R.drawable.variable_my_variable, "variable_my_variable"),
                Command(R.drawable.variable_set_variable, "variable_set_variable"),
                Command(R.drawable.variable_change_variable_by, "variable_change_variable_by"),
                Command(R.drawable.variable_show_variable, "variable_show_variable"),
                Command(R.drawable.variable_hide_variable, "variable_hide_variable"),
                Command(R.drawable.variable_add_thing_to, "variable_add_thing_to"),
                Command(R.drawable.variable_delete_all_of_list, "variable_delete_all_of_list"),
                Command(R.drawable.variable_delete_item_of_list, "variable_delete_item_of_list"),
                Command(R.drawable.variable_hide_list, "variable_hide_list"),
                Command(R.drawable.variable_insert, "variable_insert"),
                Command(R.drawable.variable_item_no_of_in, "variable_item_no_of_in"),
                Command(R.drawable.variable_item_of_list, "variable_item_of_list"),
                Command(R.drawable.variable_length, "variable_length"),
                Command(R.drawable.variable_list_contains, "variable_list_contains"),
                Command(R.drawable.variable_replace_item_of, "variable_replace_item_of"),
                Command(R.drawable.variable_show_list, "variable_show_list")
            )
        )
    )
}