package hl.t2.ejemplo20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    String variable_importada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle bundle = getIntent().getExtras();
        variable_importada=bundle.getString("frase");

        TextView tvTexto = (TextView) findViewById(R.id.tvResultado);
        tvTexto.setText("La variable importada es..."+variable_importada);

    }
}