package up.edu.br.notificacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void agendar(View view) {

        EditText txtDescricao = (EditText) findViewById(R.id.txtDescricao);

        DatePicker data = (DatePicker) findViewById(R.id.data);

        TimePicker hora = (TimePicker) findViewById(R.id.hora);



    }
}
