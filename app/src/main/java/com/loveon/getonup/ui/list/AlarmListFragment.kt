package com.loveon.getonup.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import com.loveon.getonup.R
import com.loveon.getonup.databinding.FragmentAlarmListBinding

class AlarmListFragment : Fragment() {

    companion object {
        fun newInstance() = AlarmListFragment()
    }

    private val viewModel: AlarmListViewModel by viewModels()

    private lateinit var binding:FragmentAlarmListBinding

    private var listAdapter: AlarmListAdapter = AlarmListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_alarm_list, container, false)

        binding.apply {
            vm = viewModel
            adapter = listAdapter
        }

        binding.rvAlarmList.apply {
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }

        listAdapter.submitList(viewModel.alarmData)


        return binding.root
    }

}