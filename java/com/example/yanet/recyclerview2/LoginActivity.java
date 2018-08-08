package com.example.yanet.recyclerview2;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText TextEmail;
    private EditText TextPassword;
    private Button BtnRegistrar, btnLogin;
    private ProgressDialog progressDialog;


    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //inicializamos el objeto firebaseAuth
        firebaseAuth = FirebaseAuth.getInstance();

        //Referenciamos los views
        TextEmail = (EditText) findViewById(R.id.txtEmail);
        TextPassword = (EditText) findViewById(R.id.txtPassword);

        BtnRegistrar = (Button) findViewById(R.id.btnRegistrar);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        progressDialog = new ProgressDialog(this);

        //attaching listener to button
        BtnRegistrar.setOnClickListener((View.OnClickListener) this);
        btnLogin.setOnClickListener(this);
    }

    private void registrarUsuario() {

        //Obtenemos el email y la contraseña desde las cajas de texto
        String email = TextEmail.getText().toString().trim();
        String password = TextPassword.getText().toString().trim();

        //Verificamos que las cajas de texto no esten vacías
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Se debe ingresar un email", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Falta ingresar la contraseña", Toast.LENGTH_LONG).show();
            return;
        }


        progressDialog.setMessage("Realizando registro en linea...");
        progressDialog.show();

        //creating a new user
        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //checking if success
                        if (task.isSuccessful()) {

                            Toast.makeText(LoginActivity.this, "Se ha registrado el usuario con el email: " + TextEmail.getText(), Toast.LENGTH_LONG).show();
                        } else {
                            if (task.getException() instanceof FirebaseAuthUserCollisionException)
                                Toast.makeText(LoginActivity.this, "Ese usuario ya existe", Toast.LENGTH_LONG).show();
                            else {
                                Toast.makeText(LoginActivity.this, "No se pudo registrar el usuario " + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                            }
                        }
                        progressDialog.dismiss();
                    }
                });

    }

    private void loguearUsiario() {
//Obtenemos el email y la contraseña desde las cajas de texto
        final String email = TextEmail.getText().toString().trim();
        String password = TextPassword.getText().toString().trim();

        //Verificamos que las cajas de texto no esten vacías
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Se debe ingresar un email", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Falta ingresar la contraseña minimo 6 digitos", Toast.LENGTH_LONG).show();
            return;
        }


        progressDialog.setMessage("Realizando login en linea...");
        progressDialog.show();

        //Login a user
        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //checking if success
                        if (task.isSuccessful()) {
                            int pos = email.indexOf("@");
                            String user = email.substring(0, pos);

                            Toast.makeText(LoginActivity.this, "Bienvenido: " + TextEmail.getText(), Toast.LENGTH_LONG).show();

                            Intent intencion = new Intent(getApplication(), MenuActivity.class);
                            intencion.putExtra(WellcomeActivity.user, user);
                            startActivity(intencion);


                        } else {
                            if (task.getException() instanceof FirebaseAuthUserCollisionException)
                                Toast.makeText(LoginActivity.this, "Ese usuario ya existe", Toast.LENGTH_LONG).show();
                            else {
                                Toast.makeText(LoginActivity.this, "No se pudo registrar el usuario. Verifique datos ", Toast.LENGTH_LONG).show();
                            }
                        }
                        progressDialog.dismiss();
                    }
                });

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.botonRegistrar:
                //Invocamos al método:
                registrarUsuario();
                break;

            case R.id.botonLogin:
                loguearUsiario();


        }

    }
}