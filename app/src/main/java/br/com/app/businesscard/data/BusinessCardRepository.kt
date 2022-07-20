package br.com.app.businesscard.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class BusinessCardRepository(private val dao: BusinessCardDao) {

    fun insert(businesssCard: BusinessCard) = runBlocking {
        launch(Dispatchers.IO) {
            dao.insert(businesssCard)
        }
    }

    fun getAll() = dao.getAll()
}