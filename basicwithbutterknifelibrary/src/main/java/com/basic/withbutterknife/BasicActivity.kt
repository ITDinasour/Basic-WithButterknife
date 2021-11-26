package com.basic.withbutterknife

import butterknife.ButterKnife
import com.basic.withoutbinding.BasicActivityWithoutBinding

/**
 *    @author : Jeffrey
 *    @date   : 2021/11/16-10:04
 *    @desc   :
 *    @version: 1.0
 */
abstract class BasicActivity : BasicActivityWithoutBinding(), InitLayout {

    override fun initContentView() {
        getLayoutId().also { layoutId ->
            if (layoutId > 0) {
                setContentView(layoutId)
                ButterKnife.bind(this)
            }
        }
    }
}