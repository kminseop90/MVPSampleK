package com.example.owner.kotlinapp.base

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import com.example.owner.kotlinapp.R

open abstract class BaseActivity : AppCompatActivity(), BaseView {


    var TAG: String = "BaseActivity"
    var firstFragment: BaseFragment? = null
    var currentFragment: BaseFragment? = null

    override fun onNetworkError() {

    }

    fun addFragment(fragment: BaseFragment) {
        if(firstFragment === null)
            firstFragment = fragment

        var ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.add(R.id.container, fragment, fragment.toString())
        ft.commit()
    }

    fun callFragment(fragment: BaseFragment) {
        var ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        supportFragmentManager.popBackStack(fragment.toString(), FragmentManager.POP_BACK_STACK_INCLUSIVE)
        ft.replace(R.id.container, fragment, fragment.toString())
        ft.addToBackStack(fragment.toString())
        ft.commit()
        currentFragment = fragment
    }

    open abstract fun setTag()
}
