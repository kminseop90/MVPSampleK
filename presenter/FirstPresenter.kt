package com.example.owner.kotlinapp.presenter

import android.view.View
import com.example.owner.kotlinapp.base.BasePresenter
import com.example.owner.kotlinapp.view.MainView

/**
 * Created by Owner on 06-02.
 */
class FirstPresenter : BasePresenter<MainView>() {

    fun updateMessage(v: View): Unit {
        view()?.updateMessage(v, "Bye")
    }
}