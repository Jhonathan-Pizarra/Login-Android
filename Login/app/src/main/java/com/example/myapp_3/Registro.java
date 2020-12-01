package com.example.myapp_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class Registro extends AppCompatActivity {

    EditText txt_usuario, txt_password, txt_correo;
    Button btn_registro;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txt_usuario=findViewById(R.id.txt_usuario);
        txt_password=findViewById(R.id.txt_password);
        txt_correo=findViewById(R.id.txt_correo);
        btn_registro=findViewById(R.id.btn_Registro);
    }
}