package up.edu.br.notificacao;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
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

        final EditText txtDescricao = (EditText) findViewById(R.id.txtDescricao);
        DatePicker data = (DatePicker) findViewById(R.id.data);
        TimePicker hora = (TimePicker) findViewById(R.id.hora);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, data.getDayOfMonth());
        calendar.set(Calendar.MONTH, data.getMonth());
        calendar.set(Calendar.YEAR, data.getYear());
        calendar.set(Calendar.HOUR_OF_DAY, hora.getCurrentHour());
        calendar.set(Calendar.MINUTE, hora.getCurrentMinute());

        Timer t = new Timer();
        t.schedule(new TimerTask() {
            public void run() {

                
                NotificationCompat.Builder mBuilder =
                        new NotificationCompat.Builder(MainActivity.this)
                                .setSmallIcon(R.drawable.index)
                                .setContentTitle("Agenda")
                                .setContentText(txtDescricao.getText().toString())
                                .setVibrate(new long[]{100, 250});
// Cria o intent que irá chamar a atividade a ser aberta quando clicar na notifição
                Intent resultIntent = new Intent(MainActivity.this, MainActivity.class);

//PendingIntent é "vinculada" a uma notification para abrir a intent
                PendingIntent resultPendingIntent = PendingIntent.
                        getActivity(MainActivity.this, 0, resultIntent, 0);

//associa o intent na notificação
                mBuilder.setContentIntent(resultPendingIntent);
                NotificationManager mNotificationManager =
                        (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//gera a notificação
                mNotificationManager.notify(99, mBuilder.build());


            }
        }, calendar.getTime());


    }
}
