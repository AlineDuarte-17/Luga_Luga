package view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lugaluga.R;

import model.Produto;

public class ProdutoActivity extends AppCompatActivity {

    private Produto produto;

    private TextView nomeProduto, qtdProduto, precoProduto, descProduto;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        nomeProduto = findViewById(R.id.nomeProdutoTv);
        qtdProduto = findViewById(R.id.qtdProdutoTv);
       precoProduto = findViewById(R.id.precoProdutoTv);
        descProduto = findViewById(R.id.descricaoTv);

        produto = getIntent().getExtras().getParcelable("produto");

        nomeProduto.setText(produto.getNome());
        qtdProduto.setText(String.valueOf(produto.getQuantidade()));
        precoProduto.setText(String.valueOf(produto.getPreco()));
        descProduto.setText(produto.getDescricao());

    }


}
