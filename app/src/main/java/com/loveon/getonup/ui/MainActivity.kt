package com.loveon.getonup.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.loveon.getonup.R
import com.loveon.getonup.databinding.ActivityMainBinding
import com.loveon.getonup.ui.detail.AlarmDetailFragment
import com.loveon.getonup.ui.list.AlarmListAdapter
import com.loveon.getonup.ui.list.AlarmListFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var alarmListFragment = AlarmListFragment()
    private var alarmDetailFragment = AlarmDetailFragment()

    private val adapter = AlarmListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)



        //TODO
        // 알람 리스트 리사이클러 뷰 만들기
        // 어댑터 연결하기
        // DB와 어댑터 데이터 연결하기
        // viewmodel과 데이터 연결하기
        // presenter와 domain 분리하기
        binding.navigation.setOnItemSelectedListener { item ->
            changeFragment(item.itemId)

            true
        }



    }

    private fun changeFragment(menuItem: Int) {
        val targetFragment = getFragment(menuItem)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, targetFragment, targetFragment.tag)
            .commit()

    }

    private fun getFragment(menuItem: Int): Fragment {
        val title = when (menuItem) {
            R.id.navigation_list -> alarmListFragment
            R.id.navigation_alarm -> alarmDetailFragment
            else -> throw IllegalArgumentException("Not found menu item id")
        }

        return title
    }
}