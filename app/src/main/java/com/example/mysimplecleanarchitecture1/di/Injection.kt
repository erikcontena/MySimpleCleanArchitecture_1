package com.example.mysimplecleanarchitecture1.di

import com.example.mysimplecleanarchitecture1.data.IMessageDataSource
import com.example.mysimplecleanarchitecture1.data.MessageDataSource
import com.example.mysimplecleanarchitecture1.data.MessageRepository
import com.example.mysimplecleanarchitecture1.domain.IMessageRepository
import com.example.mysimplecleanarchitecture1.domain.MessageInteractor
import com.example.mysimplecleanarchitecture1.domain.MessageUseCase

object Injection {
    fun providerUseCase(): MessageUseCase {
        val messageRepository = providerRepository()
        return MessageInteractor(messageRepository)
    }

    private fun providerRepository(): IMessageRepository {
        val messageDataSource = providerDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun providerDataSource(): IMessageDataSource {
        return MessageDataSource()

    }
}