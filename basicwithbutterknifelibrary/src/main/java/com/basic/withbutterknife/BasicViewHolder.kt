package com.basic.butterknife

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import com.basic.withbutterknife.InitLayout
import com.basic.withoutbinding.BasicUtil.logI
import com.basic.withoutbinding.BasicViewHolderWithoutBinding

/**
 *    @author : Jeffrey
 *    @date   : 2021/5/11-19:58
 *    @泛型   : T-初始化init时的数据类型
 *    @version: 1.0
 */
open class BasicViewHolder<T : Any> : BasicViewHolderWithoutBinding<T>, InitLayout {
    private val mItemView: View

    constructor(itemView: View) : super(itemView.context) {
        this.mItemView = itemView
        ButterKnife.bind(this, mItemView)
    }

    constructor(viewGroup: ViewGroup, attachToParent: Boolean) :
            this(viewGroup.context, viewGroup, attachToParent)

    constructor(
            context: Context, viewGroup: ViewGroup? = null, attachToParent: Boolean = false
    ) : super(context) {
        this.mItemView =
                LayoutInflater.from(mContext).inflate(getLayoutId(), viewGroup, attachToParent)
        ButterKnife.bind(this, mItemView)
    }

    override fun getLayoutId(): Int = 0
    override fun getItemView(): View =mItemView
}