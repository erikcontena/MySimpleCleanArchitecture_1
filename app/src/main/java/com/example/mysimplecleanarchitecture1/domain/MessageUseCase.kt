package com.example.mysimplecleanarchitecture1.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}