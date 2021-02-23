package com.oratakashi.hilt.main.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.oratakashi.hilt.main.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LibraryActivity : AppCompatActivity() {
    private val viewModel : LibraryViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getData()
    }
}