package org.indywidualni.faceslim_donation

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.support.v7.widget.Toolbar

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById(R.id.toolbar) as Toolbar

        toolbar.setLogo(R.mipmap.ic_launcher)
        toolbar.title = " " + getString(R.string.app_name)
        toolbar.setTitleTextColor(Color.WHITE)
    }

}
