package com.example.simplerecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rclNames = findViewById<RecyclerView>(R.id.rclNames)

        // Se o tamanho de todos os itens for igual e não mudar para um melhor desempenho, é melhor definir setHasFixedSize como true
        rclNames.setHasFixedSize(true)
        // Criando uma instância de nossa classe NameAdapter e definindo-a como nosso RecyclerView
        val nameList =  getListOfNames()
        val namesAdapter = NameAdapter(nameList)
        rclNames.adapter = namesAdapter
        // Configurando o gerenciador de layout do nosso RecyclerView igual a LinearLayoutManager
        rclNames.layoutManager = LinearLayoutManager(this)
    }
        //Essa função cria uma lista de nomes

    private fun getListOfNames(): MutableList<String> {
        val nameList = mutableListOf<String>()
        nameList.add("Ali")
        nameList.add("Sophia")
        nameList.add("Isabella")
        nameList.add("Mason")
        nameList.add("Jacob")
        nameList.add("William")
        nameList.add("Olivia")
        nameList.add("Jayden")
        nameList.add("Chloe")
        nameList.add("Ella")
        nameList.add("Anthony")
        nameList.add("Joshua")
        nameList.add("James")
        nameList.add("Grace")
        nameList.add("Samantha")
        nameList.add("Nicholas")
        nameList.add("Brianna")
        nameList.add("Justin")
        nameList.add("Lauren")
        nameList.add("Kimberly")

        return nameList
    }



}