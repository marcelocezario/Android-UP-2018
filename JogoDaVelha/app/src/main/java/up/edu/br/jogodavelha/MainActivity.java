package up.edu.br.jogodavelha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public boolean jogador = true;

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;

    TextView txtVitoriasCirculo;
    TextView txtVitoriasX;
    TextView txtEmpates;

    int vitoriasCirculo = 0, vitoriasX = 0, empates = 0;


    public void limparTela (){
        imageView1.setImageResource(R.drawable.vazio);
        imageView1.setTag((R.drawable.vazio));
        imageView2.setImageResource(R.drawable.vazio);
        imageView2.setTag((R.drawable.vazio));
        imageView3.setImageResource(R.drawable.vazio);
        imageView3.setTag((R.drawable.vazio));
        imageView4.setImageResource(R.drawable.vazio);
        imageView4.setTag((R.drawable.vazio));
        imageView5.setImageResource(R.drawable.vazio);
        imageView5.setTag((R.drawable.vazio));
        imageView6.setImageResource(R.drawable.vazio);
        imageView6.setTag((R.drawable.vazio));
        imageView7.setImageResource(R.drawable.vazio);
        imageView7.setTag((R.drawable.vazio));
        imageView8.setImageResource(R.drawable.vazio);
        imageView8.setTag((R.drawable.vazio));
        imageView9.setImageResource(R.drawable.vazio);
        imageView9.setTag((R.drawable.vazio));
    }

    public void vitoriaCirculo(){
        Toast.makeText(getApplicationContext(),
                "Círculo Ganhou!", Toast.LENGTH_LONG).show();
        limparTela();
        vitoriasCirculo ++;
        txtVitoriasCirculo.setText("Círculo: " + vitoriasCirculo);
    }

    public void vitoriaX (){
        Toast.makeText(getApplicationContext(),
                "X Ganhou!", Toast.LENGTH_LONG).show();
        limparTela();
        vitoriasX ++;
        txtVitoriasX.setText("X: " + vitoriasX);
    }

    public void empate(){
        Toast.makeText(getApplicationContext(),
                "Empate!", Toast.LENGTH_LONG).show();
        limparTela();
        empates ++;
        txtEmpates.setText("Empates: " + empates);
    }

    public void validarJogada() {

        //validando linha 1
        if ((Integer) imageView1.getTag() == R.drawable.circulo
                && (Integer) imageView2.getTag() == R.drawable.circulo
                && (Integer) imageView3.getTag() == R.drawable.circulo) {
            vitoriaCirculo();
        } else {
            if ((Integer) imageView1.getTag() == R.drawable.x
                    && (Integer) imageView2.getTag() == R.drawable.x
                    && (Integer) imageView3.getTag() == R.drawable.x) {
                vitoriaX();
            } else {

                //validando linha 2
                if ((Integer) imageView4.getTag() == R.drawable.circulo
                        && (Integer) imageView5.getTag() == R.drawable.circulo
                        && (Integer) imageView6.getTag() == R.drawable.circulo) {
                    vitoriaCirculo();
                } else {
                    if ((Integer) imageView4.getTag() == R.drawable.x
                            && (Integer) imageView5.getTag() == R.drawable.x
                            && (Integer) imageView6.getTag() == R.drawable.x) {
                        vitoriaX();
                    } else {
                        //validando linha 3
                        if ((Integer) imageView7.getTag() == R.drawable.circulo
                                && (Integer) imageView8.getTag() == R.drawable.circulo
                                && (Integer) imageView9.getTag() == R.drawable.circulo) {
                            vitoriaCirculo();
                        } else {
                            if ((Integer) imageView7.getTag() == R.drawable.x
                                    && (Integer) imageView8.getTag() == R.drawable.x
                                    && (Integer) imageView9.getTag() == R.drawable.x) {
                                vitoriaX();
                            } else {

                                //validando coluna 1
                                if ((Integer) imageView1.getTag() == R.drawable.circulo
                                        && (Integer) imageView4.getTag() == R.drawable.circulo
                                        && (Integer) imageView7.getTag() == R.drawable.circulo) {
                                    vitoriaCirculo();
                                } else {
                                    if ((Integer) imageView1.getTag() == R.drawable.x
                                            && (Integer) imageView4.getTag() == R.drawable.x
                                            && (Integer) imageView7.getTag() == R.drawable.x) {
                                        vitoriaX();
                                    } else {

                                        //validando coluna 2
                                        if ((Integer) imageView2.getTag() == R.drawable.circulo
                                                && (Integer) imageView5.getTag() == R.drawable.circulo
                                                && (Integer) imageView8.getTag() == R.drawable.circulo) {
                                            vitoriaCirculo();
                                        } else {
                                            if ((Integer) imageView2.getTag() == R.drawable.x
                                                    && (Integer) imageView5.getTag() == R.drawable.x
                                                    && (Integer) imageView8.getTag() == R.drawable.x) {
                                                vitoriaX();
                                            } else {
                                                //validando coluna 3
                                                if ((Integer) imageView3.getTag() == R.drawable.circulo
                                                        && (Integer) imageView6.getTag() == R.drawable.circulo
                                                        && (Integer) imageView9.getTag() == R.drawable.circulo) {
                                                    vitoriaCirculo();
                                                } else {
                                                    if ((Integer) imageView3.getTag() == R.drawable.x
                                                            && (Integer) imageView6.getTag() == R.drawable.x
                                                            && (Integer) imageView9.getTag() == R.drawable.x) {
                                                        vitoriaX();
                                                    } else {

                                                        //validando transversal 1
                                                        if ((Integer) imageView1.getTag() == R.drawable.circulo
                                                                && (Integer) imageView5.getTag() == R.drawable.circulo
                                                                && (Integer) imageView9.getTag() == R.drawable.circulo) {
                                                            vitoriaCirculo();
                                                        } else {
                                                            //validando transversal 1
                                                            if ((Integer) imageView1.getTag() == R.drawable.x
                                                                    && (Integer) imageView5.getTag() == R.drawable.x
                                                                    && (Integer) imageView9.getTag() == R.drawable.x) {
                                                                vitoriaX();
                                                            } else {

                                                                //validando transversal 2
                                                                if ((Integer) imageView3.getTag() == R.drawable.circulo
                                                                        && (Integer) imageView5.getTag() == R.drawable.circulo
                                                                        && (Integer) imageView7.getTag() == R.drawable.circulo) {
                                                                    vitoriaCirculo();
                                                                } else {
                                                                    if ((Integer) imageView3.getTag() == R.drawable.x
                                                                            && (Integer) imageView5.getTag() == R.drawable.x
                                                                            && (Integer) imageView7.getTag() == R.drawable.x) {
                                                                        vitoriaX();
                                                                    } else {
                                                                        if ((Integer) imageView1.getTag() != R.drawable.vazio
                                                                                && (Integer) imageView2.getTag() != R.drawable.vazio
                                                                                && (Integer) imageView3.getTag() != R.drawable.vazio
                                                                                && (Integer) imageView4.getTag() != R.drawable.vazio
                                                                                && (Integer) imageView5.getTag() != R.drawable.vazio
                                                                                && (Integer) imageView6.getTag() != R.drawable.vazio
                                                                                && (Integer) imageView7.getTag() != R.drawable.vazio
                                                                                && (Integer) imageView8.getTag() != R.drawable.vazio
                                                                                && (Integer) imageView9.getTag() != R.drawable.vazio){
                                                                            empate();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtVitoriasCirculo = (TextView)findViewById(R.id.txtVitoriasCirculo);
        txtVitoriasX = (TextView)findViewById(R.id.txtVitoriasX);
        txtEmpates = (TextView)findViewById(R.id.txtEmpates);



        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView1.setImageResource(R.drawable.circulo);
                    imageView1.setTag((R.drawable.circulo));
                    jogador = false;
                } else {
                    imageView1.setImageResource(R.drawable.x);
                    imageView1.setTag((R.drawable.x));
                    jogador = true;
                }
                validarJogada();
            }
        });

        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView2.setImageResource(R.drawable.circulo);
                    imageView2.setTag((R.drawable.circulo));
                    jogador = false;
                } else {
                    imageView2.setImageResource(R.drawable.x);
                    imageView2.setTag((R.drawable.x));
                    jogador = true;
                }
                validarJogada();
            }
        });

        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView3.setImageResource(R.drawable.circulo);
                    imageView3.setTag((R.drawable.circulo));
                    jogador = false;
                } else {
                    imageView3.setImageResource(R.drawable.x);
                    imageView3.setTag((R.drawable.x));
                    jogador = true;
                }
                validarJogada();
            }
        });

        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView4.setImageResource(R.drawable.circulo);
                    imageView4.setTag((R.drawable.circulo));
                    jogador = false;
                } else {
                    imageView4.setImageResource(R.drawable.x);
                    imageView4.setTag((R.drawable.x));
                    jogador = true;
                }
                validarJogada();
            }
        });

        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView5.setImageResource(R.drawable.circulo);
                    imageView5.setTag((R.drawable.circulo));
                    jogador = false;
                } else {
                    imageView5.setImageResource(R.drawable.x);
                    imageView5.setTag((R.drawable.x));
                    jogador = true;
                }
                validarJogada();
            }
        });

        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView6.setImageResource(R.drawable.circulo);
                    imageView6.setTag((R.drawable.circulo));
                    jogador = false;
                } else {
                    imageView6.setImageResource(R.drawable.x);
                    imageView6.setTag((R.drawable.x));
                    jogador = true;
                }
                validarJogada();
            }
        });

        imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView7.setImageResource(R.drawable.circulo);
                    imageView7.setTag((R.drawable.circulo));
                    jogador = false;
                } else {
                    imageView7.setImageResource(R.drawable.x);
                    imageView7.setTag((R.drawable.x));
                    jogador = true;
                }
                validarJogada();
            }
        });

        imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView8.setImageResource(R.drawable.circulo);
                    imageView8.setTag((R.drawable.circulo));
                    jogador = false;
                } else {
                    imageView8.setImageResource(R.drawable.x);
                    imageView8.setTag((R.drawable.x));
                    jogador = true;
                }
                validarJogada();
            }
        });

        imageView9 = (ImageView) findViewById(R.id.imageView9);
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView9.setImageResource(R.drawable.circulo);
                    imageView9.setTag((R.drawable.circulo));
                    jogador = false;
                } else {
                    imageView9.setImageResource(R.drawable.x);
                    imageView9.setTag((R.drawable.x));
                    jogador = true;
                }
                validarJogada();
            }
        });

        imageView1.setTag(R.drawable.vazio);
        imageView2.setTag(R.drawable.vazio);
        imageView3.setTag(R.drawable.vazio);
        imageView4.setTag(R.drawable.vazio);
        imageView5.setTag(R.drawable.vazio);
        imageView6.setTag(R.drawable.vazio);
        imageView7.setTag(R.drawable.vazio);
        imageView8.setTag(R.drawable.vazio);
        imageView9.setTag(R.drawable.vazio);
    }
}
