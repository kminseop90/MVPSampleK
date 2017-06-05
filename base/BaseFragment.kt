package com.example.owner.kotlinapp.base

import android.support.v4.app.Fragment

open abstract class BaseFragment : Fragment(), BaseView {

    open var TAG = "BaseFragment"

    override fun onNetworkError() {
    }

    fun getParentActivity(): BaseActivity {
        return (activity as BaseActivity)
    }

    fun onCallFragment(fragment: BaseFragment) {
        getParentActivity().callFragment(fragment)
    }

    override fun toString(): String {
        return TAG
    }

    open abstract fun setTag()
}