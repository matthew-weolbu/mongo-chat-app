package com.example.chat.service

import com.example.chat.entity.Message
import com.example.chat.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(private val repository: MessageRepository) {

  fun saveMessage(message: Message) {
    repository.save(message)
  }

  fun getAllMessages(): List<Message> {
    return repository.findAll()
  }
}