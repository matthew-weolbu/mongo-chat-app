import com.example.chat.entity.Message
import com.example.chat.service.MessageService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/messages")
class MessageController(private val service: MessageService) {

  @PostMapping
  fun saveMessage(@RequestBody message: Message) {
    service.saveMessage(message)
  }

  @GetMapping
  fun getAllMessages(): List<Message> {
    return service.getAllMessages()
  }
}
