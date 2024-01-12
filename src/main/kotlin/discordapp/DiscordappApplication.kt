package discordapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DiscordappApplication

fun main(args: Array<String>) {
    runApplication<DiscordappApplication>(*args)
}


//val discord = Discord()



// Create a controller class that talks to a service class that triggers a discord message through the webhook
// The controller class is an endpoint that you hit by passing in a string
// When you pass a string into application it executes

// When you click play, application will run in the background
// Need to install Insomnia
// Use insomnia to hit application through controller
//      Ex: https://localhost:8080/sendmessage

// Building API endpoints that allows users to hit

// Might need
// * Library - REST Controller Library (Suggestion: Popular choice)
//      * Springboot
// * Libraries for database (Suggestion: MySQL-school, Postgres-MySQL similar, Redis-caching database)
// * Library for unit testing - (Suggestion: Popular choice to write test cases)
// * Spock?

// Classes
// * Controller class
// * Service class

// When bringing in a new library into build.gradle.kts: go to the gradle tab on the right and under build, click build
// Running application: MainKt, running build: gradletest[build]
