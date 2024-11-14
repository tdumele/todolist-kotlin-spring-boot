package fr.tdumele.todolist.domain.service

import fr.tdumele.todolist.domain.service.model.Todolist

interface TodolistService {

    fun getAllTodolists(): List<Todolist>
}