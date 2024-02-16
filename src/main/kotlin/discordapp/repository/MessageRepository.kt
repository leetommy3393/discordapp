package discordapp.repository

import discordapp.model.Message
import org.springframework.data.jpa.repository.JpaRepository

// Repository using Spring Data JPA to perform CRUD operations on Message entity
interface MessageRepository : JpaRepository<Message, Long>