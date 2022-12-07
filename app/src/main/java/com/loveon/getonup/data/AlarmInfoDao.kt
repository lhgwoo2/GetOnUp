package com.loveon.getonup.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow


@Dao
interface AlarmInfoDao {

    @Query("SELECT * FROM alarm_info")
    fun getAlarmInfo(): Flow<List<AlarmInfo>>

    @Update
    fun updateAlarmInfos(vararg alarm: AlarmInfo)

    @Insert
    suspend fun insertAlarmInfo(alarmInfo: AlarmInfo): Long

    @Delete
    suspend fun deleteAlarmInfo(alarmInfo: AlarmInfo)

}