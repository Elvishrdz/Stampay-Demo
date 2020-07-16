package com.eahm.stampaydemo.ui.Campaings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.eahm.stampaydemo.models.Campaing

class CampaingsViewModel : ViewModel() {

    val temporal: List<Campaing> = listOf(
        Campaing(
            "Kaffee & Kuchen 8+1",
            "Tante Emma Café - Augsburg",
            0, 8,
            0,
            "https://www.bibaugsburg.de/bibaugsburg_de_2014/wp-content/uploads/_Tante-Emma-Verkauf/Tante-Emma-im-Cafe.jpg"
        ),
        Campaing(
            "Einkauf (pro 3€) 8+1",
            "Laxgang FirnHaberau - Augsburg",
            0, 8,
            0,
            "http://www.laxgang.de/images/aktionen/2020-03_sicherheit.jpg"
        ),
        Campaing(
            "15€ Rabatt auf Haarschnitt 10+1",
            "Haar Basis 17 - Augsburg",
            0, 10,
            0,
            "https://www.haarbasis17.de/img/sup/gal/1831/1831_phpthumb_cache_haarbasis17de_4.jpg"
        ),
        Campaing(
            "1 Mittagessen 10+1",
            "Metzgerei Hyna - Augsburg",
            0, 10,
            0,
            "https://www.firmen.tv/pictures/52b94cfc-5b84-483a-af06-8138d8bb3fb9B1-120.jpg"
        ),
        Campaing(
            "10€ Gutschein 10+1",
            "Schwingenstein Fisch & Feinkost - Augsburg",
            0, 10,
            0,
            "https://www.bibaugsburg.de/bibaugsburg_de_2014/wp-content/uploads/_Tante-Emma-Verkauf/Tante-Emma-im-Cafe.jpg"
        ),
        Campaing(
            "1 gratis Fischsuppe 10+1",
            "Schwingenstein Fisch & Feinkost - Augsburg",
            0, 10,
            0,
            "http://www.laxgang.de/images/aktionen/2020-03_sicherheit.jpg"
        ),
        Campaing(
            "10€ Rabatt 50+1",
            "Gisela Apotheke - Augsburg",
            0, 50,
            0,
            "https://www.haarbasis17.de/img/sup/gal/1831/1831_phpthumb_cache_haarbasis17de_4.jpg"
        )
    )

    private val _text = MutableLiveData<String>().apply {
        value = "This is Campaigns Fragment"
    }

    val text: LiveData<String> = _text
}