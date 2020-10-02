package com.matheussilas97.cotacao.api.response

import com.google.gson.annotations.SerializedName
import com.matheussilas97.cotacao.api.response.CotacaoResponse

class MoedasResponse (

    @SerializedName ("USD")
    val usd: CotacaoResponse,

    @SerializedName ("USDT")
    val usdt: CotacaoResponse,

    @SerializedName ("CAD")
    val cad: CotacaoResponse,

    @SerializedName ("EUR")
    val eur: CotacaoResponse,

    @SerializedName ("GBP")
    val gbp: CotacaoResponse,

    @SerializedName ("ARS")
    val ars: CotacaoResponse,

    @SerializedName ("BTC")
    val btc: CotacaoResponse,

    @SerializedName ("LTC")
    val ltc: CotacaoResponse,

    @SerializedName ("JPY")
    val jpy: CotacaoResponse,

    @SerializedName ("CHF")
    val chf: CotacaoResponse,

    @SerializedName ("AUD")
    val aud: CotacaoResponse,

    @SerializedName ("CNY")
    val cny: CotacaoResponse,

    @SerializedName("ILS")
    val ils: CotacaoResponse,

    @SerializedName("ETH")
    val eth: CotacaoResponse,

    @SerializedName("XRP")
    val xrp: CotacaoResponse

)