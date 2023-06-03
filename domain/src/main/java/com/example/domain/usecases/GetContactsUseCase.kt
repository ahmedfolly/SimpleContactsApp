package com.example.domain.usecases

import com.example.domain.repo.ContactsRepo

class GetContactsUseCase(val repo: ContactsRepo) {
    operator fun invoke()=repo.getContacts()
}