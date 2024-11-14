package fr.tdumele.todolist.domain.service.impl

import fr.tdumele.todolist.domain.service.TodolistService
import fr.tdumele.todolist.domain.service.model.Todolist
import org.springframework.stereotype.Service

@Service
class TodolistServiceDefaultImpl : TodolistService {


    override fun getAllTodolists(): List<Todolist> {
        // Implement your logic to fetch all Todolists from your data source
        // For example, you can use a database query or an API call
        // Return the fetched Todolists as a list
        return listOf(
            Todolist(
                1L,
                "First Todolist",
                "This is the first todolist",
                null, null
            ),
        )
    }
}