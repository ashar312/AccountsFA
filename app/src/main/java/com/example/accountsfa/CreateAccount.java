package com.example.accountsfa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {

    Button create;
    EditText editText;
    Spinner spinner;
    String AccountHead;
    private firebaseEntryClass firebaseentryclass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        create = findViewById(R.id.createaccount);
        editText = findViewById(R.id.editText);
        spinner = findViewById(R.id.spinner);
        AccountHead = "Choose your head";
        String[] AccountsHead = {"Choose your head","Asset","Liability","Revenue",
                "Expensive","Owner Capital","Owner Withdrawal"};
        ArrayAdapter<String> AccountAdapter = new ArrayAdapter<String>(CreateAccount.this
                ,android.R.layout.simple_list_item_1,AccountsHead);
        spinner.setAdapter(AccountAdapter);
        firebaseentryclass = new firebaseEntryClass();
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                AccountHead = spinner.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!AccountHead.equals("Choose your head")){
                    AccountDB();
                    dialog();
                }
                else{
                    Toast.makeText(CreateAccount.this, "Select an Account Head", Toast.LENGTH_SHORT).show();
                }
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
