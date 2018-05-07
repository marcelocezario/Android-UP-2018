package calculadora.up.edu.br.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtResultado = (TextView)findViewById(R.id.txtResultado);


        Button btn0 = (Button)findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResultado.append("0");
            }
        });

        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResultado.append("1");
            }
        });

        Button btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResultado.append("2");
            }
        });

        Button btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResultado.append("3");
            }
        });

        Button btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResultado.append("4");
            }
        });

        Button btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResultado.append("5");
            }
        });

        Button btn6 = (Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResultado.append("6");
            }
        });

        Button btn7 = (Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResultado.append("7");
            }
        });

        Button btn8 = (Button)findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResultado.append("8");
            }
        });

        Button btn9 = (Button)findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResultado.append("9");
            }
        });

        Button btnDivide = (Button)findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResultado.append(" ÷ ");
            }
        });

        Button btnMultiplica = (Button)findViewById(R.id.btnMultiplica);
        btnMultiplica.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResultado.append(" x ");
            }
        });

        Button btnSubtrai = (Button)findViewById(R.id.btnSubtrai);
        btnSubtrai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResultado.append(" - ");
            }
        });

        Button btnSoma = (Button)findViewById(R.id.btnSoma);
        btnSoma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResultado.append(" + ");
            }
        });

        Button btnVirgula = (Button)findViewById(R.id.btnVirgula);
        btnVirgula.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResultado.append(",");
            }
        });

        Button btnIgual = (Button)findViewById(R.id.btnIgual);
        btnIgual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtResultado.append("=");
            }
        });

    }
}
