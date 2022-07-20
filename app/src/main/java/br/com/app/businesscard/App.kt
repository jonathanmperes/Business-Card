package br.com.app.businesscard

import android.app.Application
import br.com.app.businesscard.data.AppDatabase
import br.com.app.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}