package com.tbuonomo.dotsindicatorsample.viewpager

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.dotsindicatorsample.R
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator

class ViewPagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_view_pager)

        findViewById<ViewPager>(R.id.view_pager).apply {
            adapter = DotIndicatorPagerAdapter()
            setPageTransformer(true, ZoomOutPageTransformer())

            findViewById<BaseDotsIndicator>(R.id.dots_indicator).setViewPager(this)
            findViewById<BaseDotsIndicator>(R.id.spring_dots_indicator).setViewPager(this)
            findViewById<BaseDotsIndicator>(R.id.worm_dots_indicator).setViewPager(this)
        }
    }
}
