package com.salsabilazahrasarwo.maps_mi2c

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.salsabilazahrasarwo.maps_mi2c.adapter.adapterWisata
import com.salsabilazahrasarwo.maps_mi2c.model.ModelWisata

class ListMapActivity : AppCompatActivity() {
    private lateinit var RecyclerViewMenu: RecyclerView
    private lateinit var AdapterMenu: adapterWisata

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_map)

        val menuIcons = listOf(

            ModelWisata(
                R.drawable.harau,
                "Harau",
                "Payakumbuh",
                " Harau berarti 'parau' atau bersuara serak. Konon katanya pada zaman dahulu penduduk yang tinggal di atas Bukit Jambu( salah satu bukit di harau) sering terkenan bencana banjir",
                -0.11280194890416399, 100.66976752121366
            ),
            ModelWisata(
                R.drawable.mesjidraya,
                "Mesjid Raya",
                "Indonesia",
                "Baru pada tanggal 14 Rabi'ul Akhir 1435 H bertepatan 14 Februari 2014, Gubernur Sumatera Barat Prof. Dr. H. Irwan Prayitno, M.Sc, Psikolog meresmikan pemakaian Masjid Raya Sumatera Barat.",
                -0.9239846042311007, 100.36244969325465
            ),
            ModelWisata(
                R.drawable.pagaruyung,
                "Batusangkar",
                "Batu Sangkar",
                "Pagaruyuang terletak di Batusangkar",
                -0.46275970073778755, 100.6162629619181


            )

        )

        RecyclerViewMenu = findViewById(R.id.rvwisata)
        RecyclerViewMenu.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL, false
        )
        AdapterMenu = adapterWisata(menuIcons)
        RecyclerViewMenu.adapter = AdapterMenu

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
