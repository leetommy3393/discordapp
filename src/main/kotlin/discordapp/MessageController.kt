package discordapp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(val messageService: MessageService) {
    @GetMapping("/")
    fun index(@RequestParam("message") message: String?) {
        if (message != null) {
            messageService.sendMessage(message)
        }
    }
}