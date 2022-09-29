package hl.t1.ejemplo03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2;
    public static final String DEBUG = "[X]======>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void responder (View view) {
        Button aux;
        switch (view.getId()) {
            case R.id.btn1:
                aux = findViewById(R.id.btn1);
                aux.setText("ANDROID");
                aux.setTextColor(Color.GREEN);
                break;
            case R.id.btn2:
                aux = findViewById(R.id.btn2);
                aux.setText("JAVA");
                aux.setTextColor(Color.GREEN);
                break;
        }
    }
}