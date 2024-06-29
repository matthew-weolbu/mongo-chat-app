package com.example.chat.entity

import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "messages")
data class Message(
  val id: String?,
  @Indexed val sender: String,
  val content: String,
  val timestamp: Long
)
