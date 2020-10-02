package com.matheussilas97.cotacao.api.response

import com.google.gson.annotations.SerializedName

class CotacaoResponse(

    @SerializedName("code")
    val code: String,

    @SerializedName("codein")
    val codein: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("high")
    val high: String,

    @SerializedName("low")
    val low: String,

    @SerializedName("varBid")
    val varBid: String,

    @SerializedName("pctChange")
    val pctChange: String,

    @SerializedName("bid")
    val bid: String,

    @SerializedName("ask")
    val ask: String,

    @SerializedName("timestamp")
    val timestamp: String,

    @SerializedName("create_date")
    val create_date: String

)