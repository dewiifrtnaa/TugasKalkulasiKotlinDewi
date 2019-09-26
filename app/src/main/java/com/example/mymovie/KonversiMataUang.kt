package com.example.mymovie

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import java.text.NumberFormat
import java.util.Locale

class KonversiMataUang : AppCompatActivity() {
    lateinit var input_uang: EditText
    lateinit var rp_usd: Button
    lateinit var rp_euro: Button
    lateinit var rp_yen: Button
    lateinit var hasil_konversi: TextView

    internal var angka: Double = 0.toDouble()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_mata_uang)

        input_uang = findViewById(R.id.uang_input)
        rp_usd = findViewById(R.id.rpusd)
        rp_euro = findViewById(R.id.rpeuro)
        rp_yen = findViewById(R.id.rpyen)
        hasil_konversi = findViewById(R.id.hasil_konversi)
    }

    fun cek(): Boolean {
        if (input_uang.text.toString().isEmpty()) {
            Toast.makeText(this, "Silahkan masukan jumlah uang", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }

    fun toYEN(v: View) {
        if (!cek()) {
            return
        }

        try {
            angka = java.lang.Double.parseDouble(input_uang.text.toString())
        } catch (ex: Exception) {
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show()
        }

        val hasil = angka / 132
        hasil_konversi.text = NumberFormat.getCurrencyInstance(Locale.JAPAN).format(hasil)
        Toast.makeText(this, "1 Yen = Rp 132", Toast.LENGTH_SHORT).show()
    }

    fun toEuro(v: View) {
        if (!cek()) {
            return
        }

        try {
            angka = java.lang.Double.parseDouble(input_uang.text.toString())
        } catch (e: Exception) {
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show()
        }

        val hasil = angka / 17228
        hasil_konversi.text = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(hasil)
        Toast.makeText(this, "1 Euro = Rp 17.228", Toast.LENGTH_SHORT).show()
    }


    fun toUSD(v: View) {
        if (!cek()) {
            return
        }

        try {
            angka = java.lang.Double.parseDouble(input_uang.text.toString())
        } catch (e: Exception) {
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show()
        }

        val hasil = angka / 14808
        hasil_konversi.text = NumberFormat.getCurrencyInstance(Locale.US).format(hasil)
        Toast.makeText(this, "1 U\$D = Rp 14808", Toast.LENGTH_SHORT).show()
    }
}

