package com.example.owner.kotlinapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.owner.kotlinapp.base.BaseActivity
import com.example.owner.kotlinapp.fragment.FirstFragment
import com.example.owner.kotlinapp.presenter.FirstPresenter
import com.example.owner.kotlinapp.view.MainView

class MainActivity : BaseActivity(), MainView {

    var firstPresenter: FirstPresenter = FirstPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstPresenter.attachView(this)
        init()
    }

    fun init(): Unit {
        findViewById(R.id.textview).setOnClickListener(onClickListener)
        addFragment(FirstFragment())
    }

    override fun updateMessage(view:View, message: String) {
        if(view is TextView) {
            view.setText(message)
        }
    }

    var onClickListener : View.OnClickListener = View.OnClickListener {
        v -> firstPresenter.updateMessage(v)
    }

    override fun setTag() {
        TAG = "MainActivity"
    }
}
