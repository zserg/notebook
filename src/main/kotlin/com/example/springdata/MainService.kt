package com.example.springdata

import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class MainService(val notebookRepository: NotebookRepository) {

    @PostConstruct
    fun init(){
        println("init")
        val notebooks = notebookRepository.findAll()
        if(notebooks.isEmpty()){
            val notebook = Notebook("Main")
            notebookRepository.insert(notebook)
        }
    }

}