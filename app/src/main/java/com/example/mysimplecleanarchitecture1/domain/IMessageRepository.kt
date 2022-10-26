package com.example.mysimplecleanarchitecture1.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}