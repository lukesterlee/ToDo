package com.lukesterlee.todo.ui.domain

import java.util.*

data class ToDoItem(
    val id: String,
    val createdDate: Date,
    val dueDate: Date?,
    val completedDate: Date?,
    val description: String,
//    val category: String?, // "health", "work", "chores"
) {
    fun isCompleted(): Boolean {
        return completedDate != null
    }
}