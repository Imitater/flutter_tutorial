package com.example.flutter_sample.android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

import com.example.flutter_sample.R
import com.example.flutter_sample.route.PageRouter

class NativeSonActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_native_son)
        val openNativePage: TextView = findViewById(R.id.openNativePage)
        val openFlutterPage: TextView = findViewById(R.id.openFlutterPage)
        val closePage: TextView = findViewById(R.id.closePage)
        openFlutterPage.setOnClickListener(this)
        openNativePage.setOnClickListener(this)
        closePage.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.openNativePage ->
                //通过地址跳转
                PageRouter.openPageByUrl(this, PageRouter.NATIVE_PAGE_URL)
            R.id.openFlutterPage -> PageRouter.openPageByUrl(this, PageRouter.FLUTTER_HOME_PAGE_URL)
            R.id.closePage -> this.finish()
        }
    }
}
