package up.edu.br.jogodavelha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public boolean jogador = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView1.setImageResource(R.drawable.circulo);
                    jogador = false;
                } else {
                    imageView1.setImageResource(R.drawable.x);
                    jogador = true;
                }
            }
        });

        final ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView2.setImageResource(R.drawable.circulo);
                    jogador = false;
                } else {
                    imageView2.setImageResource(R.drawable.x);
                    jogador = true;
                }
            }
        });

        final ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView3.setImageResource(R.drawable.circulo);
                    jogador = false;
                } else {
                    imageView3.setImageResource(R.drawable.x);
                    jogador = true;
                }
            }
        });

        final ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView4.setImageResource(R.drawable.circulo);
                    jogador = false;
                } else {
                    imageView4.setImageResource(R.drawable.x);
                    jogador = true;
                }
            }
        });

        final ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView5.setImageResource(R.drawable.circulo);
                    jogador = false;
                } else {
                    imageView5.setImageResource(R.drawable.x);
                    jogador = true;
                }
            }
        });

        final ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView6.setImageResource(R.drawable.circulo);
                    jogador = false;
                } else {
                    imageView6.setImageResource(R.drawable.x);
                    jogador = true;
                }
            }
        });

        final ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView7.setImageResource(R.drawable.circulo);
                    jogador = false;
                } else {
                    imageView7.setImageResource(R.drawable.x);
                    jogador = true;
                }
            }
        });

        final ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView8.setImageResource(R.drawable.circulo);
                    jogador = false;
                } else {
                    imageView8.setImageResource(R.drawable.x);
                    jogador = true;
                }
            }
        });

        final ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jogador == true) {
                    imageView9.setImageResource(R.drawable.circulo);
                    jogador = false;
                } else {
                    imageView9.setImageResource(R.drawable.x);
                    jogador = true;
                }
            }
        });





    }
}
