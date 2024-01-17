package discordapp

import discordapp.config.Properties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(Properties::class)
class DiscordappApplication

fun main(args: Array<String>) {
    runApplication<DiscordappApplication>(*args)
}
