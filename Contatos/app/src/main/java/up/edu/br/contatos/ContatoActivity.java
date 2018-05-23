package up.edu.br.contatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class ContatoActivity extends AppCompatActivity {

    Contato contato;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        EditText txtNome = (EditText)findViewById(R.id.txtNome);
        Spinner spTipo = (Spinner)findViewById(R.id.spTipo);
        EditText txtTelefone = (EditText)findViewById(R.id.txtTelefone);
        EditText txtEmail = (EditText)findViewById(R.id.txtEmail);


        Intent it = getIntent();
        if (it != null && it.hasExtra("contato")){

            contato = (Contato) it.getSerializableExtra("contato");

            txtNome.setText(contato.getNome());
            spTipo.setSelection(((ArrayAdapter)spTipo.getAdapter()).getPosition(contato.getTipo()));
            txtTelefone.setText(contato.getNumero());
            txtEmail.setText(contato.getEmail());
            




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
            EditText txtNome = (EditText)findViewById(R.id.txtNome);
            Spinner spTipo = (Spinner)findViewById(R.id.spTipo);
            EditText txtTelefone = (EditText)findViewById(R.id.txtTelefone);
            EditText txtEmail = (EditText)findViewById(R.id.txtEmail);
            CheckBox checkAtivo = (CheckBox) findViewById(R.id.checkAtivo);





            if (contato == null){
                contato = new Contato();
            }

            contato.setNome(txtNome.getText().toString());
            contato.setTipo(spTipo.getSelectedItem().toString());
            contato.setNumero(txtTelefone.getText().toString());
            contato.setEmail(txtEmail.getText().toString());
            contato.setAtivo(checkAtivo.isChecked());

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
