package hl.t1.ejemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    int [] banderas= new int[]{R.drawable.spain,
            R.drawable.usa};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadImg(){
        ImageButton btn1, btn2;
        btn1=findViewById(banderas[1]);
        btn1=findViewById(banderas[2]);
    }

}