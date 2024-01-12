package discordapp

import com.github.rillis.discord.Discord
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Service
class MessageService {

    private final val url = "https://discordapp.com/api/webhooks/1192199123852591134/29VnyyPfX7LjtAizrkGv32OTGwB8n6r0ny6oISXtBD7R_Rdc5td6qa1dC4V8iOdnsQ4_"
    private final val username = "tommy-app"
    private final val avatarUrl = "https://i.natgeofe.com/n/548467d8-c5f1-4551-9f58-6817a8d2c45e/NationalGeographic_2572187_square.jpg"
    private val discord = Discord(url, username, avatarUrl)

    private final val formatter = DateTimeFormatter.ofPattern("MMM d, yyyy: h:mm a")
    private val current = LocalDateTime.now().format(formatter)

    fun sendMessage(message: String){

        val discordMessage = "$current: $message"
        discord.sendMessage(discordMessage)

    }
}