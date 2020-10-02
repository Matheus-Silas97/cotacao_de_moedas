package com.matheussilas97.cotacao.api

import com.matheussilas97.cotacao.api.response.MoedasResponse
import retrofit2.Call
import retrofit2.http.GET

interface CotacaoService {

    @GET("json/all/")
    fun getCotacao(): Call<MoedasResponse>

}