package br.edu.fatec.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText edtNumeroUm;
    private EditText edtNumeroDois;
    private TextView lblResultado;
    private Button btnSomar;
    private Button btnSubtrair;
    private Button btnDividir;
    private Button btnMultiplicar;

    private double n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtNumeroUm = findViewById(R.id.edtNumeroUm);
        edtNumeroDois = findViewById(R.id.edtNumeroDois);
        lblResultado = findViewById(R.id.lblResultado);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnDividir = findViewById(R.id.btnDividir);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void somar(View v){
        n1 = Double.parseDouble(edtNumeroUm.getText().toString());
        n2 = Double.parseDouble(edtNumeroDois.getText().toString());
        double soma = n1 + n2;
        lblResultado.setText(String.valueOf(soma));
    }

    public void subtrair(View v){
        n1 = Double.parseDouble(edtNumeroUm.getText().toString());
        n2 = Double.parseDouble(edtNumeroDois.getText().toString());
        double subtracao = n1 - n2;
        lblResultado.setText(String.valueOf(subtracao));
    }

    public void dividir(View v){
        n1 = Double.parseDouble(edtNumeroUm.getText().toString());
        n2 = Double.parseDouble(edtNumeroDois.getText().toString());
        double divisao = n1 / n2;
        lblResultado.setText(String.valueOf(divisao));
    }

    public void multiplicar(View v){
        n1 = Double.parseDouble(edtNumeroUm.getText().toString());
        n2 = Double.parseDouble(edtNumeroDois.getText().toString());
        double multiplicacao = n1 * n2;
        lblResultado.setText(String.valueOf(multiplicacao));
    }
}