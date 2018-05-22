package up.edu.br.contatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class ContatoActivity extends AppCompatActivity {

    Contato contato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        EditText txtNome =
                (EditText)findViewById(R.id.txtNome);


        Intent it = getIntent();
        if (it != null && it.hasExtra("contato")){

            contato = (Contato) it.getSerializableExtra("contato");

            txtNome.setText(contato.getNome());



        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_contato, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.save) {
            EditText txtNome =
                    (EditText)findViewById(R.id.txtNome);

            if (contato == null){
                contato = new Contato();
            }

            contato.setNome(txtNome.getText().toString());

            new ContatoDao().salvar(contato);
            contato = null;




            Toast.makeText(getApplicationContext(),
                    "Salvo com sucesso!",
                    Toast.LENGTH_LONG).show();

            Intent it = new Intent(ContatoActivity.this,MainActivity.class);
            startActivity(it);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
