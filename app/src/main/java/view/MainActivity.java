package view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lugaluga.R;

import java.time.Instant;
import java.util.List;

import model.Produto;
import view.adapter.AdapterProduto;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private AdapterProduto adapterProduto;

    private List<Produto> produtoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView.findViewById(R.id.listaProdutos);

    }

    public void CriarListaProdutos(){

        Produto produto = new Produto("Iphone 13",
                "200.00",
                "Iphone 64gb",
                "disponivel",
                "10")

    }
}