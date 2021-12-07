package com.base.demo

import android.widget.TextView
import butterknife.BindView
import com.basic.withbutterknife.BasicActivity
import com.basic.withoutbinding.BasicUtil

class MainActivity : BasicActivity() {
    @BindView(R.id.tvTitle)
    lateinit var tvTitle: TextView

    override fun initView() {
        BasicUtil.logI("MainActivity : $tvTitle")
    }

    override fun initData() {
    }


    override fun getLayoutId() = R.layout.activity_main
}