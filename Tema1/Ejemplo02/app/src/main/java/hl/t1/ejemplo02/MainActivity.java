package hl.t1.ejemplo02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = MainActivity.class.getSimpleName();
    // private static final String TAG = "---> EJEMPLO02 <---";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button activar=findViewById(R.id.btnPulsar);
        activar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        TextView mensaje = findViewById(R.id.txtMensaje);
        mensaje.setText("He pulsado el botón");
        Log.i(TAG, "Se ha ejecutado el método OnClick");
        Toast.makeText(this,"Texto actualizado", Toast.LENGTH_LONG).show();
        mensaje.
    }
}