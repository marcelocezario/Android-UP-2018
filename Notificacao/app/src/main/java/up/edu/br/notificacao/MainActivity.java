package up.edu.br.notificacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

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

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH,data.getDayOfMonth());
        calendar.set(Calendar.MONTH, data.getMonth());
        calendar.set(Calendar.YEAR, data.getYear());
        calendar.set(Calendar.HOUR_OF_DAY, hora.getCurrentHour());
        calendar.set(Calendar.MINUTE, hora.getCurrentMinute());

        Timer t = new Timer();
        t.schedule (new TimerTask(){
            public void run(){
                Toast.makeText(getApplicationContext(),"Rodou",Toast.LENGTH_LONG).show();
            }
        }, calendar.getTime());
    }
}
