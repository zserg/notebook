package com.example.springdata

import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
class Note (val title: String, val content: String){
    var id: String? = null
    var cdat: LocalDateTime = LocalDateTime.now()
    var udat: LocalDateTime = LocalDateTime.now()
    var tags: List<String> = emptyList()
}