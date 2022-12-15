package com.loveon.getonup.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "alarm_info")
data class AlarmInfo(

    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id")
    val alarmId: Int,
    val wakeUpTime: Long,
    val alarmInterval: Long,
    val alarmName: String = "",
    val alarmMelody: String,
    val turnOn: Boolean
)
