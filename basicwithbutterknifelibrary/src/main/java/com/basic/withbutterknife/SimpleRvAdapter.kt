package com.basic.withbutterknife


import android.view.LayoutInflater
import android.view.ViewGroup
import com.basic.withoutbinding.BasicRvAdapter

/**
 *    @author : Jeffrey
 *    @date   : 2021/6/15-16:52
 *    @泛型   : B-条目数据类型，VB-条目BasicRVViewHolder布局的ViewBinding类型
 *    @version: 1.0
 */
abstract class SimpleRvAdapter<B : Any?> : BasicRvAdapter<B, BasicRvViewHolder<B>>(), InitLayout {
    override fun getNewCreateViewHolder(parent: ViewGroup, viewType: Int): BasicRvViewHolder<B> {
        return BasicRvViewHolder(
            LayoutInflater.from(parent.context).inflate(getLayoutId(), parent, false)
        )
    }

    override fun onBindViewHolder(holder: BasicRvViewHolder<B>, position: Int) {
        getDataItem(position)?.run { bindViewHolder(holder, this, isSelected(this)) }
    }

    abstract fun bindViewHolder(
        holder: BasicRvViewHolder<B>, data: B, selected: Boolean = false
    )

}