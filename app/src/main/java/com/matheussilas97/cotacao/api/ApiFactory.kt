package com.matheussilas97.cotacao.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {

    private var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://economia.awesomeapi.com.br/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var service: CotacaoService = retrofit.create(CotacaoService::class.java)

}