package up.edu.br.navegador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getData() != null){

            TextView textView = (TextView) findViewById(R.id.editText);

            String link = getIntent().getData().getScheme()+ ":" + getIntent().getData().getSchemeSpecificPart();

            textView.setText(link);

            WebView navegador = (WebView) findViewById(R.id.navegador);

            navegador.getSettings().setJavaScriptEnabled(true);
            navegador.loadUrl(link);
            navegador.setWebViewClient(new WebViewClient());
        }
    }

    public void carregar(View v){
        TextView textView = (TextView)findViewById(R.id.editText);

        WebView navegador = (WebView)findViewById(R.id.navegador);

        navegador.getSettings().setJavaScriptEnabled(true);
        navegador.loadUrl(textView.getText().toString());
        navegador.setWebViewClient(new WebViewClient());
    }
}
