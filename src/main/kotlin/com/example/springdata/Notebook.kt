package com.example.springdata

import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
class Notebook (var title: String){
    var notes: List<Note> = emptyList()
    var notebooks: List<Notebook> = emptyList()
    var cdat: LocalDateTime = LocalDateTime.now()
    var udat: LocalDateTime = LocalDateTime.now()
    var tags: List<String> = emptyList()

}