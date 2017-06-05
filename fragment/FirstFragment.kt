package com.example.owner.kotlinapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.owner.kotlinapp.R
import com.example.owner.kotlinapp.base.BaseFragment
import com.example.owner.kotlinapp.presenter.FragmentPresenter
import com.example.owner.kotlinapp.view.FirstView

/**
 * Created by Owner on 06-02.
 */

class FirstFragment : BaseFragment(), FirstView {

    var fragmentPresenter: FragmentPresenter = FragmentPresenter()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v: View = LayoutInflater.from(context).inflate(R.layout.activity_base, container, false)
        fragmentPresenter.attachView(this)
        v.findViewById(R.id.first_btn).setOnClickListener(OnClickListener)
        return v
    }

    var OnClickListener: View.OnClickListener = View.OnClickListener {
        onCallFragment(SecondFragment())
    }

    override fun setTag() {
        TAG = "FirstFragment"
    }
}