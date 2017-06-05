package com.example.owner.kotlinapp.base

/**
 * Created by Owner on 06-02.
 */
open class BasePresenter<VIEW : BaseView>() {

    var view:VIEW? = null

    fun attachView(view: VIEW) {
        this.view = view
    }

    fun view() = this.view
}