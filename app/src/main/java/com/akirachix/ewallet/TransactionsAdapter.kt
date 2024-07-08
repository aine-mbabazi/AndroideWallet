package com.akirachix.ewallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class TransactionsAdapter (var transactionsList:List<Transactions>): RecyclerView.Adapter<TransactionsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionsViewHolder {
       val itemView = LayoutInflater.from(parent.context)
           .inflate(R.layout.expensetracker,parent,false)
        return TransactionsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TransactionsViewHolder, position: Int) {
       val transctions = transactionsList[position]

        holder.tvDescription.text = transctions.description
        holder.tvAmount.text = transctions.amount
        holder.tvDate.text = transctions.date
    }

    override fun getItemCount(): Int {
        return transactionsList.size
    }
}

class TransactionsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    var tvDescription = itemView.findViewById<TextView>(R.id.tvDescription)
    var tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
}