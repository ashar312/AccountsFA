package com.example.accountsfa;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class firebaseEntryClass {

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private DatabaseReference Accounts;
    private DatabaseReference Entry;
    private DatabaseReference generaljournel;


    public firebaseEntryClass(){
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("AccountingCycle");
        Accounts = databaseReference.child("Accounts");
        Entry = databaseReference.child("Entry");
        generaljournel = databaseReference.child("generaljournel");
    }

    public FirebaseDatabase getFirebaseDatabase() {
        return firebaseDatabase;
    }

    public DatabaseReference getDatabaseReference() {
        return databaseReference;
    }

    public DatabaseReference getAccounts() {
        return Accounts;
    }

    public DatabaseReference getEntry() {
        return Entry;
    }

    public DatabaseReference getGeneraljournel() {
        return generaljournel;
    }
}
