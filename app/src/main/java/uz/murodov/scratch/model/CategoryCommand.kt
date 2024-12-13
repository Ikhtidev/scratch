package uz.murodov.scratch.model

data class CategoryCommand(
    val name: String,
    val color:Int,
    val commands: List<Command>
)
