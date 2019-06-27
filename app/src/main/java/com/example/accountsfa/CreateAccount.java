package com.example.accountsfa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {

    Button create;
    EditText editText;
    Spinner spinner;
    private firebaseEntryClass firebaseentryclass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        create = findViewById(R.id.createaccount);
        editText = findViewById(R.id.editText);
        spinner = findViewById(R.id.spinner);
        firebaseentryclass = new firebaseEntryClass();
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }

    private void AccountDB(){
        


    }

    private void dialog(){
        AlertDialog alertDialog = new AlertDialog.Builder(CreateAccount.this).create();
        alertDialog.setTitle("Another Account");
        alertDialog.setMessage("Do you want to create another account?");

        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                editText.setText("");
            }
        });
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(CreateAccount.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
                startActivity(intent);
            }
        });

        alertDialog.show();
    }
}
