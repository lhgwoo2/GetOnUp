package com.loveon.getonup.data

import javax.inject.Inject

class AlarmInfoRepository @Inject constructor(
    val alarmInfoDao:AlarmInfoDao
) {
}