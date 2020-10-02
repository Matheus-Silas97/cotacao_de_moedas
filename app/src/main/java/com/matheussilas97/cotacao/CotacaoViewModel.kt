package com.matheussilas97.cotacao

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.matheussilas97.cotacao.api.ApiFactory
import com.matheussilas97.cotacao.api.response.MoedasResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CotacaoViewModel : ViewModel() {

    fun cotacao(context: Context): LiveData<MoedasResponse> {
        val result = MutableLiveData<MoedasResponse>()

        ApiFactory.service.getCotacao().enqueue(object : Callback<MoedasResponse> {
            override fun onResponse(
                call: Call<MoedasResponse>,
                response: Response<MoedasResponse>
            ) {
                if (response.isSuccessful) {
                    result.value = response.body()
                } else {
                    result.value = null
                }
            }

            override fun onFailure(call: Call<MoedasResponse>, t: Throwable) {
                Toast.makeText(context, R.string.error_conection, Toast.LENGTH_SHORT).show()
            }
        })
        return result
    }

}