package fr.tdumele.todolist.api.mappers

import fr.tdumele.todolist.api.vo.GetTodolistResponse
import fr.tdumele.todolist.domain.service.model.Todolist
import org.springframework.stereotype.Component

@Component
class TodolistMapper {

    fun mapToGetTodolistResponse(todolist : Todolist) : GetTodolistResponse {
        val response = GetTodolistResponse(
                todolist.id,
                todolist.title,
                todolist.description,
                todolist.createdAt,
                todolist.updatedAt
        )
        return response
    }
}