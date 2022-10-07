package hl.t1.ejemplo04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String LOGCAT = "EJEMPLO-04";

    Button btnCalcular;
    EditText edNum1, edNum2;
    RadioButton rbSumar, rbRestar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(this);

        edNum1 = findViewById(R.id.edTnum1);
        edNum2 = findViewById(R.id.edTnum1);

        rbSumar = findViewById(R.id.rbSumar);
        rbRestar = findViewById(R.id.rbRestar);
    }

    @Override
    public void onClick(View v){

        Integer res = 0, n1, n2;

        n1 = Integer.parseInt(edNum1.getText().toString());
        n2 = Integer.parseInt(edNum2.getText().toString());

        if (rbSumar.isChecked()){
            res = n1 + n2;
            Toast.makeText(
                    getApplicationContext(),
                    "Resultado: " + res,
                    Toast.LENGTH_SHORT).show();
        } else {
            if (rbRestar.isChecked()){
                res = n1 - n2;
                Toast.makeText(
                        getApplicationContext(),
                        "Resultado: " + res,
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(
                        getApplicationContext(),
                        "Selecciona una operación antes de pulsar el botón",
                        Toast.LENGTH_SHORT).show();
            }
        }
        Log.i(LOGCAT,"FINALIZA EL MÉTODO onClick");
    }
}