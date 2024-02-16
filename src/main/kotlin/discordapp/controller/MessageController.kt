package discordapp.controller

import discordapp.service.MessageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

// Controller Class
@RestController
class MessageController(private val messageService: MessageService) {
    // Sends POST request with JSON payload containing the message
    @PostMapping("/send-message")
    fun sendMessage(@RequestBody message: String) {
        messageService.sendMessage(message)
    }
}