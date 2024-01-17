package discordapp.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "app")
data class Properties (
    var url: String,
    var username: String,
    var avatarUrl: String
)