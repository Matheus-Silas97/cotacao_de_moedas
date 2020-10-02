package com.matheussilas97.cotacao.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.ViewModelProvider
import com.matheussilas97.cotacao.CotacaoViewModel
import com.matheussilas97.cotacao.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        executePeriodicTask()

    }

    private fun cotacaoMoeda() {
        val viewModel = ViewModelProvider(this)[CotacaoViewModel::class.java]

        viewModel.cotacao(this).observe(this, androidx.lifecycle.Observer { data ->
            val compra = getString(R.string.compra)
            val venda = getString(R.string.venda)
            val maximo = getString(R.string.maximo)
            val minimo = getString(R.string.minimo)
            val variacao = getString(R.string.variacao)
            val pctVariacao = getString(R.string.pct_var)

            if (data != null) {
                //Dólar Comercial
                name_usd.text = data.usd.name
                high_usd.text = maximo + data.usd.high
                low_usd.text = minimo + data.usd.low
                ask_usd.text = venda + data.usd.ask
                bid_usd.text = compra + data.usd.bid
                var_bid_usd.text = variacao + data.usd.varBid
                pct_change_usd.text = pctVariacao + data.usd.pctChange + "%"

                //Dólar Turismo
                name_usdt.text = data.usdt.name
                high_usdt.text = maximo + data.usdt.high
                low_usdt.text = minimo + data.usdt.low
                ask_usdt.text = venda + data.usdt.ask
                bid_usdt.text = compra + data.usdt.bid
                var_bid_usdt.text = variacao + data.usdt.varBid
                pct_change_usdt.text = pctVariacao + data.usdt.pctChange + "%"

                //Dólar Canadense
                name_cad.text = data.cad.name
                high_cad.text = maximo + data.cad.high
                low_cad.text = minimo + data.cad.low
                ask_cad.text = venda + data.cad.ask
                bid_cad.text = compra + data.cad.bid
                var_bid_cad.text = variacao + data.cad.varBid
                pct_change_cad.text = pctVariacao + data.cad.pctChange + "%"

                //Dólar Australiano
                name_aud.text = data.aud.name
                high_aud.text = maximo + data.aud.high
                low_aud.text = minimo + data.aud.low
                ask_aud.text = venda + data.aud.ask
                bid_aud.text = compra + data.aud.bid
                var_bid_aud.text = variacao + data.aud.varBid
                pct_change_aud.text = pctVariacao + data.aud.pctChange + "%"

                //Euro
                name_eur.text = data.eur.name
                high_eur.text = maximo + data.eur.high
                low_eur.text = minimo + data.eur.low
                ask_eur.text = venda + data.eur.ask
                bid_eur.text = compra + data.eur.bid
                var_bid_eur.text = variacao + data.eur.varBid
                pct_change_eur.text = pctVariacao + data.eur.pctChange + "%"

                //Libra Esterlina
                name_gbp.text = data.gbp.name
                high_gbp.text = maximo + data.gbp.high
                low_gbp.text = minimo + data.gbp.low
                ask_gbp.text = venda + data.gbp.ask
                bid_gbp.text = compra + data.gbp.bid
                var_bid_gbp.text = variacao + data.gbp.varBid
                pct_change_gbp.text = pctVariacao + data.gbp.pctChange + "%"

                //Peso Argentino
                name_ars.text = data.ars.name
                high_ars.text = maximo + data.ars.high
                low_ars.text = minimo + data.ars.low
                ask_ars.text = venda + data.ars.ask
                bid_ars.text = compra + data.ars.bid
                var_bid_ars.text = variacao + data.ars.varBid
                pct_change_ars.text = pctVariacao + data.ars.pctChange + "%"

                //Iene Japonês
                name_jpy.text = data.jpy.name
                high_jpy.text = maximo + data.jpy.high
                low_jpy.text = minimo + data.jpy.low
                ask_jpy.text = venda + data.jpy.ask
                bid_jpy.text = compra + data.jpy.bid
                var_bid_jpy.text = variacao + data.jpy.varBid
                pct_change_jpy.text = pctVariacao + data.jpy.pctChange + "%"

                //Franco Suíço
                name_chf.text = data.chf.name
                high_chf.text = maximo + data.chf.high
                low_chf.text = minimo + data.chf.low
                ask_chf.text = venda + data.chf.ask
                bid_chf.text = compra + data.chf.bid
                var_bid_chf.text = variacao + data.chf.varBid
                pct_change_chf.text = pctVariacao + data.chf.pctChange + "%"

                //Yuan Chinês
                name_cny.text = data.cny.name
                high_cny.text = maximo + data.cny.high
                low_cny.text = minimo + data.cny.low
                ask_cny.text = venda + data.cny.ask
                bid_cny.text = compra + data.cny.bid
                var_bid_cny.text = variacao + data.cny.varBid
                pct_change_cny.text = pctVariacao + data.cny.pctChange + "%"

                //Novo Shekel Israelense
                name_yls.text = data.ils.name
                high_yls.text = maximo + data.ils.high
                low_yls.text = minimo + data.ils.low
                ask_yls.text = venda + data.ils.ask
                bid_yls.text = compra + data.ils.bid
                var_bid_yls.text = variacao + data.ils.varBid
                pct_change_yls.text = pctVariacao + data.ils.pctChange + "%"

                //Bitcoin
                name_btc.text = data.btc.name
                high_btc.text = maximo + data.btc.high
                low_btc.text = minimo + data.btc.low
                ask_btc.text = venda + data.btc.ask
                bid_btc.text = compra + data.btc.bid
                var_bid_btc.text = variacao + data.btc.varBid
                pct_change_btc.text = pctVariacao + data.btc.pctChange + "%"

                //Litecoin
                name_ltc.text = data.ltc.name
                high_ltc.text = maximo + data.ltc.high
                low_ltc.text = minimo + data.ltc.low
                ask_ltc.text = venda + data.ltc.ask
                bid_ltc.text = compra + data.ltc.bid
                var_bid_ltc.text = variacao + data.ltc.varBid
                pct_change_ltc.text = pctVariacao + data.ltc.pctChange + "%"

                //Ethereum
                name_eth.text = data.eth.name
                high_eth.text = maximo + data.eth.high
                low_eth.text = minimo + data.eth.low
                ask_eth.text = venda + data.eth.ask
                bid_eth.text = compra + data.eth.bid
                var_bid_eth.text = variacao + data.eth.varBid
                pct_change_eth.text = pctVariacao + data.eth.pctChange + "%"

                ///Ripple
                name_xrp.text = data.xrp.name + "(${data.xrp.code})"
                high_xrp.text = maximo + data.xrp.high
                low_xrp.text = minimo + data.xrp.low
                ask_xrp.text = venda + data.xrp.ask
                bid_xrp.text = compra + data.xrp.bid
                var_bid_xrp.text = variacao + data.xrp.varBid
                pct_change_xrp.text = pctVariacao + data.xrp.pctChange + "%"

            }
        })
    }

    private fun executePeriodicTask() {
        val doAsynkTimer: TimerTask = object : TimerTask() {
            override fun run() {
                Handler(Looper.getMainLooper()).post {
                    try {
                        cotacaoMoeda()
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }
        }
        Timer().schedule(doAsynkTimer, 0, 30000)//executará a cada 30 segundos
    }
}