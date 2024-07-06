package uz.murodov.scratch.model

import uz.murodov.scratch.R

data class CategoryCommand(
    val commands: ArrayList<Command>,
    val name: String? = "",
    val color:Int? = R.color.light_yellow_900
)
