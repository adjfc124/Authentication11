package com.example.authentication1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

//    EditText mEmail,mPassword;
//    Button mLoginBtn;
//    TextView createText;
//    ProgressBar progressBar;
//    //FirebaseAuth fauth;
//
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        mEmail=findViewById(R.id.Email);
//        mPassword=findViewById(R.id.password);
//        progressBar=findViewById(R.id.progressBar);
//       // fauth=FirebaseAuth.getInstance();
//        mLoginBtn=findViewById(R.id.loginbtn);
//        createText=findViewById(R.id.createtext);
//        mLoginBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String email = mEmail.getText().toString().trim();
//                String password = mPassword.getText().toString().trim();
//                if (TextUtils.isEmpty(email)) {
//                    mEmail.setError("Email is required.");
//                    return;
//                }
//                if (TextUtils.isEmpty(password)) {
//                    mPassword.setError("Password is required.");
//                    return;
//                }
//                if(password.length()<6){
//                    mPassword.setError("Password Must be >= 6 characters");
//                    return;
//                }
//                progressBar.setVisibility(View.VISIBLE);
//                //authenticate the user
//                //fauth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                    @Override
//                  //  public void onComplete(@NonNull Task<AuthResult> task) {
//                      //  if(task.isSuccessful()){
//                            Toast.makeText(Login.this,"Logged in Successfully",Toast.LENGTH_SHORT).show();
//                            Intent intent = new Intent(Login.this,MainActivity.class);
//                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                            startActivity(intent);
//                        }else{
//                            Toast.makeText(Login.this,"Error ! "+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
//                            progressBar.setVisibility(View.GONE);
//                        }
//                    }
//                });
//            }
//        });
//        createText.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(),Register.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);
//            }
//        });
//    }
}}