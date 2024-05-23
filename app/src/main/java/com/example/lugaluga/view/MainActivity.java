package com.example.lugaluga.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.lugaluga.R;
import com.example.lugaluga.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

import com.example.lugaluga.model.Produto;
import com.example.lugaluga.view.adapter.AdapterProduto;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private AdapterProduto adapterProduto;

    private List<Produto> produtoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        recyclerView = findViewById(R.id.listaProdutos);

        CriarListaProdutos();

        adapterProduto = new AdapterProduto(produtoList);


        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterProduto);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(MainActivity.this, ProdutoActivity.class);
                intent.putExtra("produto", produtoList.get(position));
                 startActivity(intent);

            }

            @Override
            public void onLongItemClick(View view, int position) {
                Toast.makeText(getApplicationContext(),produtoList.get(position).getStatus(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        }));

    }

    public void CriarListaProdutos(){

        Produto produto = new Produto (
                "Iphone 13",
                200.00,
                "Iphone 64gb",
                "Disponivel",
                10);

        produtoList.add(produto);

        produto = new Produto (
                "Fone",
                50.00,
                "Bluetooth",
                "Indisponivel",
                120);

        produtoList.add(produto);

        produto = new Produto (
                "Notebook",
                1000.00,
                "Dell",
                "Disponivel",
                30);

        produtoList.add(produto);

        produto = new Produto (
                "Televisao",
                280.00,
                "Samsung",
                "Indisponivel",
                20);

        produtoList.add(produto);

        produto = new Produto (
                "Geladeira",
                150.00,
                "Brastemp",
                "Disponivel",
                18);

        produtoList.add(produto);

        produto = new Produto (
                "Fogao",
                130.00,
                "Eletrolux",
                "Indisponivel",
                15);

        produtoList.add(produto);

        produto = new Produto (
                "Mouse",
                50.00,
                "Bluetooth",
                "Disponivel",
                40);

        produtoList.add(produto);

        produto = new Produto (
                "Micro-Ondas",
                125.00,
                "Eletrolux",
                "Indisponivel",
                14);

        produtoList.add(produto);

        produto = new Produto (
                "Ar condicionado",
                250.00,
                "Consul",
                "Disponivel",
                17);

        produtoList.add(produto);

        produto = new Produto (
                "Ventilador",
                50.00,
                "Arno",
                "Disponivel",
                10);

        produtoList.add(produto);
    }
}