package com.basic.withbutterknife

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import butterknife.ButterKnife
import com.basic.withoutbinding.BasicPopDialogWithoutBinding

/**
 *    @author : Jeffrey
 *    @date   : 2021/5/12-19:42
 *    @泛型   : T-用于链式结构返回类型，填写当前PopDialog
 *    @version: 1.0
 */
abstract class BasicPopDialog<A : Activity>(mActivity: A) :
    BasicPopDialogWithoutBinding<A>(mActivity), InitLayout {
    override fun initContentView(): View {
        val rootView = LayoutInflater.from(mActivity).inflate(getLayoutId(), null, false)
        ButterKnife.bind(this, rootView)
        return rootView
    }

}