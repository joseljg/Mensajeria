package es.joseljg.mensajeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class segundoActivity extends AppCompatActivity {

    public static final String EXTRA_RESPUESTA2 = "es.joseljg.segundoActivity.respuesta2";
    private TextView txt_recibido2 = null;
    private EditText edt_enviado2 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        txt_recibido2 = (TextView) findViewById(R.id.txt_recibido2);
        edt_enviado2 = (EditText) findViewById(R.id.edt_enviado2);
        txt_recibido2.setVisibility(View.VISIBLE);
        //-------------------------------------------------------------
        Intent intent = getIntent();
        if(intent != null)
        {
            String texto = intent.getStringExtra(MainActivity.EXTRA_TEXTO1);
            txt_recibido2.setText(texto);
        }
    }

    public void responder(View view) {
        String texto = String.valueOf(edt_enviado2.getText());
        Intent intent = new Intent( );
        intent.putExtra(EXTRA_RESPUESTA2, texto);
        setResult(RESULT_OK,intent);
        finish();
    }
}