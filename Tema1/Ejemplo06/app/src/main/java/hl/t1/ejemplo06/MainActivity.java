package hl.t1.ejemplo06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.miFactura:
                Toast.makeText(this, "Abriendo Facturas", Toast.LENGTH_LONG ).show();
                return true;
            case R.id.miClientes:
                Toast.makeText(this, "Mostrando Clientes", Toast.LENGTH_LONG ).show();
                return true;
            case R.id.miAcerca:
                Toast.makeText(this, "Autor: Mobile Developer", Toast.LENGTH_LONG ).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}