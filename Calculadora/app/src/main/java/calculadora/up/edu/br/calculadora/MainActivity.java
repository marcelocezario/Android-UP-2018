package calculadora.up.edu.br.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    int operacao = 0;
    double valor1;
    boolean zerarTela = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtResultado = (TextView)findViewById(R.id.txtResultado);

        //Função limpar tela
        Button btnC = (Button)findViewById(R.id.btnC);
        btnC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                valor1 = 0;
                txtResultado.setText("0");
            }
        });

        //Funções botões numéricos (0 - 9) e vírgula
        Button btn0 = (Button)findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (txtResultado.getText().toString().equals("0") || zerarTela){
                    txtResultado.setText("");
                    zerarTela = false;
                }
                txtResultado.append("0");
            }
        });

        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (txtResultado.getText().toString().equals("0") || zerarTela){
                    txtResultado.setText("");
                    zerarTela = false;
                }
                txtResultado.append("1");
            }
        });

        Button btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (txtResultado.getText().toString().equals("0") || zerarTela){
                    txtResultado.setText("");
                    zerarTela = false;
                }
                txtResultado.append("2");
            }
        });

        Button btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (txtResultado.getText().toString().equals("0") || zerarTela){
                    txtResultado.setText("");
                    zerarTela = false;
                }
                txtResultado.append("3");
            }
        });

        Button btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (txtResultado.getText().toString().equals("0") || zerarTela){
                    txtResultado.setText("");
                    zerarTela = false;
                }
                txtResultado.append("4");
            }
        });

        Button btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (txtResultado.getText().toString().equals("0") || zerarTela){
                    txtResultado.setText("");
                    zerarTela = false;
                }
                txtResultado.append("5");
            }
        });

        Button btn6 = (Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (txtResultado.getText().toString().equals("0") || zerarTela){
                    txtResultado.setText("");
                    zerarTela = false;
                }
                txtResultado.append("6");
            }
        });

        Button btn7 = (Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (txtResultado.getText().toString().equals("0") || zerarTela){
                    txtResultado.setText("");
                    zerarTela = false;
                }
                txtResultado.append("7");
            }
        });

        Button btn8 = (Button)findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (txtResultado.getText().toString().equals("0") || zerarTela){
                    txtResultado.setText("");
                    zerarTela = false;
                }
                txtResultado.append("8");
            }
        });

        Button btn9 = (Button)findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (txtResultado.getText().toString().equals("0") || zerarTela){
                    txtResultado.setText("");
                    zerarTela = false;
                }
                txtResultado.append("9");
            }
        });

        Button btnVirgula = (Button)findViewById(R.id.btnVirgula);
        btnVirgula.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (txtResultado.getText().toString().indexOf(".") == -1){
                    txtResultado.append(".");
                }
            }
        });

        //Operações matemáticas (soma, subtração, divisão, multiplicação, raiz, potência, porcentagem, inverter valor)
        Button btnSoma = (Button)findViewById(R.id.btnSoma);
        btnSoma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                valor1 = Double.valueOf(txtResultado.getText().toString());
                txtResultado.setText("");
                operacao = 1;
            }
        });

        Button btnSubtrai = (Button)findViewById(R.id.btnSubtrai);
        btnSubtrai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                valor1 = Double.valueOf(txtResultado.getText().toString());
                txtResultado.setText("");
                operacao = 2;
            }
        });

        Button btnMultiplica = (Button)findViewById(R.id.btnMultiplica);
        btnMultiplica.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                valor1 = Double.valueOf(txtResultado.getText().toString());
                txtResultado.setText("");
                operacao = 3;
            }
        });

        Button btnDivide = (Button)findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                valor1 = Double.valueOf(txtResultado.getText().toString());
                txtResultado.setText("");
                operacao = 4;
            }
        });

        Button btnRaiz = (Button)findViewById(R.id.btnRaiz);
        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Double.valueOf(txtResultado.getText().toString());
                operacao = 5;

                Double resultado = 0.;

                resultado = Math.sqrt(valor1);

                txtResultado.setText(resultado.toString());
            }
        });

        Button btnPorcentagem = (Button)findViewById(R.id.btnPorcentagem);
        btnPorcentagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Double.valueOf(txtResultado.getText().toString());
                txtResultado.setText("");
                operacao = 6;
            }
        });

        Button btnPotencia = (Button)findViewById(R.id.btnPotencia);
        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Double.valueOf(txtResultado.getText().toString());
                txtResultado.setText("");
                operacao = 7;
            }
        });

        Button btnInverteSinal = (Button)findViewById(R.id.btnInverteSinal);
        btnInverteSinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valorDecimal;
                Integer valorInteiro;

                if (txtResultado.getText().toString().indexOf(".") == -1){
                    valorInteiro = -Integer.parseInt(txtResultado.getText().toString());
                    txtResultado.setText(valorInteiro.toString());
                }
                else {
                    valorDecimal = -Double.valueOf((txtResultado.getText().toString()));
                    txtResultado.setText(valorDecimal.toString());
                }
            }
        });

        //Função para calcular, igual (=)
        Button btnIgual = (Button)findViewById(R.id.btnIgual);
        btnIgual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Double valor2 = Double.valueOf(txtResultado.getText().toString());
                Double resultadoOperacao = 0.00;
                if (operacao == 1){
                    resultadoOperacao = valor1 + valor2;
                }
                else {
                    if (operacao == 2){
                        resultadoOperacao = valor1 - valor2;
                    }
                    else {
                        if (operacao == 3){
                            resultadoOperacao = valor1 * valor2;
                        }
                        else {
                            if (operacao == 4){
                                resultadoOperacao = valor1 / valor2;
                            }
                            else {
                                if (operacao == 5){
                                    resultadoOperacao = Math.sqrt(valor2);
                                }
                                else {
                                    if (operacao == 6){
                                        resultadoOperacao = valor1 * (valor2/100);
                                    }
                                    else {
                                        if (operacao == 7){
                                            resultadoOperacao = Math.pow(valor1,valor2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                txtResultado.setText(resultadoOperacao.toString());
                zerarTela = true;
            }
        });

    }
}
