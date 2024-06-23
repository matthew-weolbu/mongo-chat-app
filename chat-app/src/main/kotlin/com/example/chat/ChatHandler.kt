package com.example.chat

import org.springframework.web.socket.handler.TextWebSocketHandler
import org.springframework.web.socket.TextMessage
import org.springframework.web.socket.WebSocketSession

class ChatHandler : TextWebSocketHandler() {
  override fun handleTextMessage(session: WebSocketSession, message: TextMessage) {
    // 메시지 처리 로직
    session.sendMessage(TextMessage("메시지 수신: ${message.payload}"))
  }
}
