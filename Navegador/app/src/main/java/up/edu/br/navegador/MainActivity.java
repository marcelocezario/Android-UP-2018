package up.edu.br.navegador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void carregar(View v){
        TextView textView = (TextView)findViewById(R.id.editText);

        WebView navegador = (WebView)findViewById(R.id.navegador);

        navegador.getSettings().setJavaScriptEnabled(true);
        navegador.loadUrl(textView.getText().toString());
    }
}
