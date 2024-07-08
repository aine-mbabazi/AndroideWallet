package com.akirachix.ewallet

import android.view.View
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class TransactionsAdapter (var transactionsList:List<Transactions>): RecyclerView.Adapter<TransactionsViewHolder>(){
}

class TransactionsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tv
}