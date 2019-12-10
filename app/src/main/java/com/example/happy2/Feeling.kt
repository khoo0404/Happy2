package com.example.happy2
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "feeling")
class Feeling(@PrimaryKey(autoGenerate = true) val id:Int,
              val mode:Int,
              val remaks:String,
              val Created_at : Date)
