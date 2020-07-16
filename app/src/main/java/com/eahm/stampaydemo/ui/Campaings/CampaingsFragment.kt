package com.eahm.stampaydemo.ui.Campaings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.eahm.stampaydemo.R
import com.eahm.stampaydemo.adapter.RecyclerViewAdapter
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_campaings.*

class CampaingsFragment : DaggerFragment() {

    private lateinit var campaingsViewModel: CampaingsViewModel
    private lateinit var rootView :View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        campaingsViewModel = ViewModelProvider(this).get(CampaingsViewModel::class.java)

        rootView = inflater.inflate(R.layout.fragment_campaings, container, false)
        val textView: TextView = rootView.findViewById(R.id.text_home)

        campaingsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        rvCampaing.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = RecyclerViewAdapter(campaingsViewModel.temporal, context)
        }
    }
}