package discordapp.service

import com.github.rillis.discord.Discord
import discordapp.config.Properties
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


@Service
class MessageService {

    //TODO: Autowiring not working?
    @Autowired
    lateinit var properties: Properties

    // Creates Discord Bot with set properties

    val discord = Discord(properties.url,properties.username,properties.avatarUrl)

    // Time of message
    private final val formatter = DateTimeFormatter.ofPattern("MMM d, yyyy: h:mm a")
    private val current = LocalDateTime.now().format(formatter)

    // Sends a message with user's local time
    fun sendMessage(message: String){

        val discordMessage = "$current: $message"
        discord.sendMessage(discordMessage)

    }
}