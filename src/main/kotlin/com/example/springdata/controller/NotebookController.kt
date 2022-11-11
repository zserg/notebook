package com.example.springdata.controller

import com.example.springdata.Note
import com.example.springdata.NoteRepository
import com.example.springdata.Notebook
import com.example.springdata.NotebookRepository
import com.example.springdata.controller.model.NoteRequest
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/v1")
class NotebookController (
    val noteRepository: NoteRepository,
    val notebookRepository: NotebookRepository
    ){

    @GetMapping("/notes")
    fun getNotes(): List<Note?> {
        return noteRepository.findAll()
    }

    @GetMapping("/notes/{id}")
    fun getNote(@PathVariable id: String): Optional<Note?> {
        return noteRepository.findById(id)
    }

    @PostMapping("/notes")
    fun createNote(@RequestBody request: NoteRequest): Note {
        val note = Note(request.title, request.content)
        return noteRepository.insert(note)
    }

    @GetMapping("/notebooks")
    fun getNotebooks(): List<Notebook?> {
        return notebookRepository.findAll()
    }
}