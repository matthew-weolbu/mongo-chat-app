package com.example.chat.repository

import com.example.chat.entity.Message
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository : MongoRepository<Message, String> {
}