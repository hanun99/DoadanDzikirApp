package com.idn.doadandzikirapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.idn.doadandzikirapp.R
import com.idn.doadandzikirapp.model.DzikirDoa

class DzikirDoaAdapter(private val listDzikirDoa: ArrayList<DzikirDoa>) :
    RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>(){

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
     //initialization view dari layout row_item_dzikir.xml
        val tvDesc: TextView = view.findViewById(R.id.tv_desc)
        val tvLafaz: TextView = view.findViewById(R.id.tv_lafaz)
        val tvTerjemah: TextView = view.findViewById(R.id.tv_terjemah)
    }

    //menampilkan data sesuai dengan posisi lyout yang ditentukan
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= MyViewHolder (
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_dzikir_doa, parent, false)
    )

    //menentukan jumlah data yang ditampilkan
    override fun getItemCount() = listDzikirDoa.size



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //mengatur data dengan tampilan
        holder.tvDesc.text = listDzikirDoa[position].desc
        holder.tvLafaz.text = listDzikirDoa[position].lafaz
        holder.tvTerjemah.text = listDzikirDoa[position].terjemah
    }

}