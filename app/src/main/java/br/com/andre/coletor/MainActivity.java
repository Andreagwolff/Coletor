package br.com.andre.coletor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tela_inicial_botao_coletar_dados =(Button) findViewById(R.id.tela_inicial_botao_coletar_dados);

                tela_inicial_botao_coletar_dados.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        setContentView(R.layout.activity_formulario);




                        Button botao_avanca_formulario =(Button) findViewById(R.id.botao_avanca_formulario);

                        botao_avanca_formulario.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                setContentView(R.layout.activity_fileira);


                                Button botao_volta_formulario =(Button) findViewById(R.id.botao_volta_formulario);

                                botao_volta_formulario.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        setContentView(R.layout.activity_main);


                                    }
                                });

            }
        });

    }
                }); }
}

