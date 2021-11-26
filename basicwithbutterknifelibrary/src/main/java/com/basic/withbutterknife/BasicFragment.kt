package com.basic.withbutterknife
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import butterknife.ButterKnife
import com.basic.withoutbinding.BasicFragmentWithoutBinding

/**
 *    @author : Jeffrey
 *    @date   : 2021/5/13-19:15
 *    @泛型   :
 *    @version: 1.0
 */
abstract class BasicFragment<A : AppCompatActivity> :
    BasicFragmentWithoutBinding<A>(), InitLayout {

    override fun initRootView(inflater: LayoutInflater, container: ViewGroup?) =
        inflater.inflate(getLayoutId(), container, false).apply {
            mRootView = this
            ButterKnife.bind(this@BasicFragment, this)
        }
}