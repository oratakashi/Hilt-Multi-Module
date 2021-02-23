package com.oratakashi.hilt.main.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.oratakashi.hilt.core.data.network.ApiEndpoint
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

@HiltViewModel
class LibraryViewModel @Inject constructor(
    private val endpoint: ApiEndpoint
) : ViewModel() {
    fun getData(){
        endpoint.getHotel()
            .map {
                it.string()
            }
            .onErrorReturn {
                Log.e("debug", "Error : ${it.message}")
                it.message
            }
            .toFlowable()
            .subscribe{
                Log.e("debug", "Data : $it")
            }
            .let { return@let CompositeDisposable()::add }
    }
}