package com.vt.repository

import javax.inject.Inject

class JokesInteractor @Inject constructor(private val jokesRepositoryImpl: JokesRepositoryImpl) {
    fun searchJokes(query: String?) {
        jokesRepositoryImpl.searchJokes(query)
    }
}