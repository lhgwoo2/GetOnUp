package com.loveon.getonup.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.loveon.getonup.R
import com.loveon.getonup.databinding.FragmentAlarmListBinding

class AlarmListFragment : Fragment() {

    companion object {
        fun newInstance() = AlarmListFragment()
    }

    private lateinit var viewModel: AlarmListViewModel
    private lateinit var binding:FragmentAlarmListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_alarm_list, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[AlarmListViewModel::class.java]
        // TODO: Use the ViewModel

    }

}