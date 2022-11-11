package com.example.springdata

import org.springframework.data.mongodb.repository.MongoRepository


interface NotebookRepository : MongoRepository<Notebook?, String?> { //
}