package discordapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DiscordappApplication

fun main(args: Array<String>) {
    runApplication<DiscordappApplication>(*args)
}
