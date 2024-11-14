package fr.tdumele.todolist.api.vo

data class GetTodolistResponse(

    val id: Long,
    val title: String,
    val description: String,
    val createdAt: String?,
    val updatedAt: String?
)
