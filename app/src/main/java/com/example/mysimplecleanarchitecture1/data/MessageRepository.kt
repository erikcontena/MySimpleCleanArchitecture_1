package com.example.mysimplecleanarchitecture1.data

import com.example.mysimplecleanarchitecture1.domain.IMessageRepository
import com.example.mysimplecleanarchitecture1.domain.MessageEntity

class MessageRepository(private val dataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String)= dataSource.getMessageFromSource(name)
}