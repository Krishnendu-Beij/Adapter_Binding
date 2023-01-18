package com.example.adapterbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.adapterbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var appDataBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val post = Post("Adapter Binding",
                        "Trying to learn Adapter Binding. God Help Me To become a good Android Developer and fulfil my dreams",
                        "https://secure.gravatar.com/avatar/e89584fc717a92922689cb33ab29dd93?s=160&d=https%3A%2F%2Fcss-tricks.com%2Fimages%2Fget-gravatar.png&r=PG"
        )
        appDataBinding.variablePost = post
    }
}