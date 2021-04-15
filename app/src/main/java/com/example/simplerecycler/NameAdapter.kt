package com.example.simplerecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

        // Vamos estender essa classe da classe RecyclerView.Adapter na próxima etapa

class NameAdapter(private val names: List<String>) :
    RecyclerView.Adapter<NameAdapter.NameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {

        //infla o layout escolhido
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.rcl_names,parent, false)
        return NameViewHolder(view)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        //pega os elementos da lista de nomes da posição determinada
        val element = names[position]
        //Atualizando o texto do txtName com este elemento
        holder.txtName.text = element
    }

    override fun getItemCount(): Int {
        return names.size
    }

    class NameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val txtName = itemView.findViewById(R.id.nameTextView) as TextView
    }
}

