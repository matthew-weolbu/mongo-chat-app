package com.example.chat

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository : MongoRepository<Message, String> {
}

data class Message(
  val id: String?,
  val sender: String,
  val content: String,
  val timestamp: Long
)
