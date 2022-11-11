package com.example.springdata

import org.springframework.data.mongodb.repository.MongoRepository


interface NoteRepository : MongoRepository<Note?, String?> { //
}