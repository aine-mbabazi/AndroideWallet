package com.akirachix.ewallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.ewallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.ewalletRV.layoutManager = LinearLayoutManager(this)

        displayTransactions()
    }

    fun displayTransactions(){
        val transaction1 = Transactions(
            "","Rent","KES 16000","2 July 2024"

        )

        val transaction2 = Transactions(
            "","Dividends","KES 2400","4 July 2024"

        )

        val transaction3 = Transactions(
            "","Electricity","KES 800","5 July 2024"
        )

        val transaction4 = Transactions(
            "","Internet","KES 2500","6 July 2024"
        )

        val transaction5 = Transactions(
            "","Shopping","KES 3500","5 July 2024"
        )

        val transaction6 = Transactions(
            "","Bus fare","KES 500","11 July 2024"
        )

        val transaction7 = Transactions(
            "","Water bill", "KES 300","11 July 2024"
        )

        val transactioning = listOf(transaction1,transaction2,transaction3,transaction4,transaction5,transaction6,transaction7)

        val transactionsAdapter = TransactionsAdapter(transactioning)
        binding.ewalletRV.adapter = transactionsAdapter
    }
}