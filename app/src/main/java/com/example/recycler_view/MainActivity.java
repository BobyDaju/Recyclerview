package com.example.recycler_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {
private RecyclerView  recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);

        List<Contacts>contactsList= new ArrayList<>();
        contactsList.add(new Contacts("SAUGAT","45456",R.drawable.saugat));
        contactsList.add(new Contacts("SAUGAT","45456",R.drawable.saugat));
        contactsList.add(new Contacts("SAUGAT","45456",R.drawable.saugat));
        contactsList.add(new Contacts("SAUGAT","45456",R.drawable.saugat));
        contactsList.add(new Contacts("SAUGAT","45456",R.drawable.saugat));
        contactsList.add(new Contacts("SAUGAT","45456",R.drawable.saugat));
        contactsList.add(new Contacts("SAUGAT","45456",R.drawable.saugat));
        contactsList.add(new Contacts("SAUGAT","45456",R.drawable.saugat));

        ContactsAdapter contactsAdapter= new ContactsAdapter(mContext:this.contactList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(context:this));

    }
}
