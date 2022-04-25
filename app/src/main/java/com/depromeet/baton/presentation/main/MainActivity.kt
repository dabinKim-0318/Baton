package com.depromeet.baton.presentation.main

import android.os.Bundle
import com.depromeet.baton.R
import com.depromeet.baton.databinding.ActivityMainBinding
import com.depromeet.baton.presentation.base.BaseActivity
import com.depromeet.baton.presentation.ui.chatting.ChattingFragment
import com.depromeet.baton.presentation.ui.home.HomeFragment
import com.depromeet.baton.presentation.ui.mypage.MyPageFragment
import com.depromeet.baton.presentation.ui.search.SearchFragment
import com.depromeet.baton.util.replace
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val homeFragment: HomeFragment by lazy { HomeFragment() }
    private val searchFragment: SearchFragment by lazy { SearchFragment() }
    private val chattingFragment: ChattingFragment by lazy { ChattingFragment() }
    private val myPageFragment: MyPageFragment by lazy { MyPageFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initBottomNavigation()
        setBottomNavigationSelectedListener()
    }

    private fun initBottomNavigation() {
        replace(homeFragment)
        binding.bnvMain.itemIconTintList = null
    }

    private fun setBottomNavigationSelectedListener() {
        binding.bnvMain.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_main_home -> {
                    replace(homeFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.menu_main_search -> {
                    replace(searchFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.menu_main_chatting -> {
                    replace(chattingFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.menu_main_mypage -> {
                    replace(myPageFragment)
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}