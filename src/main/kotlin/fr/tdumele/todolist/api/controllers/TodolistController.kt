package fr.tdumele.todolist.api.controllers

import fr.tdumele.todolist.api.mappers.TodolistMapper
import fr.tdumele.todolist.api.vo.GetTodolistResponse
import fr.tdumele.todolist.domain.service.TodolistService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/todolists")
class TodolistController(val todolistService: TodolistService, val todolistMapper: TodolistMapper) {

    @GetMapping
    fun getTodolists(): ResponseEntity<List<GetTodolistResponse>> {
        val response = todolistService.getAllTodolists()
        val mappedResponse = response.map { todolistMapper.mapToGetTodolistResponse(it) }
        return ResponseEntity.ok(mappedResponse)
    }

}

