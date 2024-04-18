package view;

import androidx.appcompat.app.AppCompatActivity;

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

public class MainActivity extends AppCompatActivity {

    private ListView ListCidade;

    private String[] cidades = {
            "São Carlos", "Araraquara", "Ibaté", "Ribeirã Bonito", "Dourado",
            "Descalvado", "Porto Ferreira", "Santa Rita do Passa Quatro", "Tambaú",
            "Pirassununga", "Ribeirão Preto", "Jaboticabal", "Franca", "São Paulo",
            "Itirapina", "Brotas", "Jaú", "Bauru", "Rio Claro"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListCidade = findViewById(R.id.ListaNomes);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(

                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                cidades
        );

        ListCidade.setAdapter(adapter);

        ListCidade.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemSelecionado = ListCidade.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), itemSelecionado, Toast.LENGTH_LONG).show();

            }
        });

    }
}