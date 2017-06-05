package com.example.owner.kotlinapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.owner.kotlinapp.R
import com.example.owner.kotlinapp.presenter.SecondPresenter

/**
 * Created by Owner on 06-05.
 */
class SecondFragment : com.example.owner.kotlinapp.base.BaseFragment(), com.example.owner.kotlinapp.view.SecondView {

    var secondPresenter: SecondPresenter = SecondPresenter()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v: View = LayoutInflater.from(context).inflate(R.layout.fragment_second, container, false)
        secondPresenter.attachView(this)
        v.findViewById(R.id.second_btn).setOnClickListener(OnClickListener)
        return v
    }


    var OnClickListener: View.OnClickListener = View.OnClickListener {
        onCallFragment(FirstFragment())
    }

    override fun setTag() {
        TAG = "SecondFragment"
    }
}