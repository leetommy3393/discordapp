package discordapp.model

import jakarta.persistence.*

// Message table
@Entity
data class Message(

    // Database creates an ID associated with each message
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    // Message is in its own column which cannot be null/empty
    @Column(nullable = false)
    val message: String
)
