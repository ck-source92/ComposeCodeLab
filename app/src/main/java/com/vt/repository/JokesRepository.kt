package com.vt.repository

interface JokesRepository {
    fun searchJokes(query: String?)
}