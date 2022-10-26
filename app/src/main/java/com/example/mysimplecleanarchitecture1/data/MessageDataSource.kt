package com.example.mysimplecleanarchitecture1.data

import com.example.mysimplecleanarchitecture1.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String)=
        MessageEntity("Hello $name! Welcome to Clean Architecture")
}