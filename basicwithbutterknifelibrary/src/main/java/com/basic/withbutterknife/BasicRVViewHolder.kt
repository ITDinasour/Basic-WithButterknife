package com.basic.withbutterknife

import android.view.View
import androidx.lifecycle.LifecycleObserver
import butterknife.ButterKnife
import com.basic.withoutbinding.BasicRvViewHolderWithoutBinding

/**
 *    @author : Jeffrey
 *    @date   : 2021/5/11-20:01
 *    @泛型   :
 *    @version: 1.0
 */
open class BasicRvViewHolder<T : Any?>(itemView: View) :
    BasicRvViewHolderWithoutBinding<T>(itemView), LifecycleObserver {
    init {
        ButterKnife.bind(this, itemView)
    }
}