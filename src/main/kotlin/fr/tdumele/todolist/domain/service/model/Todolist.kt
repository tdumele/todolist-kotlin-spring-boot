package fr.tdumele.todolist.domain.service.model

data class Todolist(

    val id: Long,
    val title: String,
    val description: String,
    val createdAt: String?,
    val updatedAt: String?
)