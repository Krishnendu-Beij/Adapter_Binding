package com.example.adapterbinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("anyName")
fun ImageView.imageFromUrl(url: String) {
    Glide.with(this.context).load(url).into(this)
}