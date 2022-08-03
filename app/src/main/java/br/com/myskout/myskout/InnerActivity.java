package br.com.myskout.myskout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InnerActivity extends AppCompatActivity {
    //Declarar as variaveis que irão receber o xml
    EditText edtUsuario,edtSenha;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inner_layout);
        //abrir meu layout
        setContentView(R.layout.inner_layout);
        //Apresentar as varias Java para as variaveis xml
        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);
        btnEntrar = findViewById(R.id.btnEntrar);

        //Criando a ação no botão Entrar

        btnEntrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Validar a entrada do usúario

                if(edtUsuario.equals("Senac") && edtSenha.equals("Senac")){
                    //Abrindo outra janela
                    //Duas formas de abrir uma janela
                    startActivity(new Intent(getApplicationContext(),MenuPrincipalActivity.class));
                    finish();

                }else {
                    //enviando uma caixa vom mensagem para o Usúario
                    Toast.makeText(getApplicationContext(),
                            "Usúario ou Senha Inválidos",
                            Toast.LENGTH_SHORT).show();
                    //chamando o metodo para a janela
                    limparJanela();

                }

            }

        });

    }
    //criando o métado limpar janela
    public void limparJanela(){
        edtUsuario.setText("");
        edtSenha.setText("");
        edtUsuario.requestFocus();
    }

    public void sairSistema(View view) {
        finish();
    }

    //Criando a ação no botão entrar

}