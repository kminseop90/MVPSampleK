package com.example.owner.kotlinapp.view

import android.view.View
import com.example.owner.kotlinapp.base.BaseView

/**
 * Created by Owner on 06-02.
 */
open interface MainView : BaseView{

    open fun updateMessage(v: View, message: String)
}