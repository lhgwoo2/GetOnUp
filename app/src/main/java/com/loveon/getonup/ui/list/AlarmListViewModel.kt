package com.loveon.getonup.ui.list

import androidx.databinding.Bindable
import androidx.lifecycle.ViewModel
import com.loveon.getonup.data.AlarmInfo

class AlarmListViewModel : ViewModel() {

    var alarmData: List<AlarmInfo> = ArrayList<AlarmInfo>().apply {
        add(AlarmInfo(1, 500, 600L, "Test Alarm", "Test Song", true))
    }


}