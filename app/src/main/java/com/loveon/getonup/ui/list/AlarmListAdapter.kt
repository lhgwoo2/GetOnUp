package com.loveon.getonup.ui.list

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.loveon.getonup.data.AlarmInfo
import com.loveon.getonup.databinding.ItemRecyclerviewAlarmBinding

class AlarmListAdapter : ListAdapter<AlarmInfo, AlarmListAdapter.AlarmListViewHolder>(
    AlarmDiffCallback()
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlarmListViewHolder {
        val itemBinding = ItemRecyclerviewAlarmBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        Log.e("Alarm_TAG", "onCreateViewHolder")
        return AlarmListViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: AlarmListViewHolder, position: Int) {
        val item = getItem(position)
        holder.binding.switchAlarmOnOff.isChecked = item.turnOn
        holder.binding.tvRvAlarmHourAmPm.text = if (item.wakeUpTime / 3600 > 12) {
            "AM"
        } else {
            "PM"
        }

        holder.binding.tvRvAlarmHour.text = "${(item.wakeUpTime / 3600) - 12}"
        holder.binding.tvRvAlarmMinutes.text = "${item.wakeUpTime % 3600}"

        Log.e("Alarm_TAG", "adapter binding data!")
    }

    class AlarmListViewHolder(val binding: ItemRecyclerviewAlarmBinding) :
        RecyclerView.ViewHolder(binding.root)


}

class AlarmDiffCallback : DiffUtil.ItemCallback<AlarmInfo>() {
    override fun areItemsTheSame(oldItem: AlarmInfo, newItem: AlarmInfo): Boolean {
        return oldItem.alarmId == newItem.alarmId
    }

    override fun areContentsTheSame(oldItem: AlarmInfo, newItem: AlarmInfo): Boolean {
        return oldItem == newItem
    }
}