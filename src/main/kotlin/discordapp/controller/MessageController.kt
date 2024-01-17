package discordapp.controller

import discordapp.service.MessageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController() {

    @Autowired
    lateinit var messageService: MessageService

    @PostMapping("/sendmessage")
    fun index(@RequestParam("message") message: String?) {

        message ?.let {
            messageService.sendMessage(message)
        }
    }
}