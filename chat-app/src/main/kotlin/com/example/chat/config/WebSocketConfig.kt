package com.example.chat.config

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping
import org.springframework.web.socket.WebSocketHandler
import org.springframework.web.socket.config.annotation.EnableWebSocket
import org.springframework.web.socket.config.annotation.WebSocketConfigurer
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry

@Configuration
@EnableWebSocket
class WebSocketConfig : WebSocketConfigurer {
  override fun registerWebSocketHandlers(registry: WebSocketHandlerRegistry) {
    registry.addHandler(MyWebSocketHandler(), "/chat").setAllowedOrigins("*")
  }

    @Bean
  fun myWebSocketHandler(): WebSocketHandler {
    return MyWebSocketHandler()
  }

  @Bean
  fun simpleUrlHandlerMapping(@Qualifier("myWebSocketHandler") handler: WebSocketHandler): SimpleUrlHandlerMapping {
    val urlMap = mapOf("/chat" to handler)
    val mapping = SimpleUrlHandlerMapping()
    mapping.urlMap = urlMap
    mapping.order = 1
    return mapping
  }
}
