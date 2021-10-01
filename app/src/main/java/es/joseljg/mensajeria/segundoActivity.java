package es.joseljg.mensajeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class segundoActivity extends AppCompatActivity {

    private TextView txt_recibido2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        txt_recibido2 = (TextView) findViewById(R.id.txt_recibido2);
        txt_recibido2.setVisibility(View.VISIBLE);
        //-------------------------------------------------------------
        Intent intent = getIntent();
        if(intent != null)
        {
            String texto = intent.getStringExtra(MainActivity.EXTRA_TEXTO1);
            txt_recibido2.setText(texto);
        }
    }
}