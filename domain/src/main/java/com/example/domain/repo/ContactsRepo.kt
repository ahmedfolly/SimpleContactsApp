package com.example.domain.repo

import android.provider.ContactsContract.Contacts

interface ContactsRepo {
    fun getContacts():Contacts
}