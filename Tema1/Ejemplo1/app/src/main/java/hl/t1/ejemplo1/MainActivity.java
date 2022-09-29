package hl.t1.ejemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    // Pista 1
    int [] banderas= new int[]{R.drawable.spain,
            R.drawable.usa};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Pista 2
        ImageButton boton1, boton2;
        boton1=findViewById(banderas[1]);
        boton2 =findViewById(banderas[2]);

    }



}