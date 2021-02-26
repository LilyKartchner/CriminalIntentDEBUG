package com.example.criminalintent

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

//@Entity
data class Crime(val id: UUID = UUID.randomUUID(), //@PrimaryKey
                 var title: String = "",
                 var date: Date = Date(),
                 var isSolved: Boolean = false)