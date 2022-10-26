package com.example.mysimplecleanarchitecture1.data

import com.example.mysimplecleanarchitecture1.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}