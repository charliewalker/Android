package com.example.dangvannam.dangvannam_1706020107_11thcapplication.Model;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.dangvannam.dangvannam_1706020107_11thcapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ContactActivity extends AppCompatActivity {

    @Override
    ListView listView;
    static List<ContactModel> modelList;
    static ContactAdapter adapter;
    Button btnAddItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        onInit();
        onSetData();

        adapter = new ContactAdapter(ContactActivity.this,R.layout.contact_item,modelList);
        listView.setAdapter(adapter);

        btnAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactActivity.this,EditCotactActivity.class);
                startActivity(intent);
            }
        });
    }

    private void onSetData() {
        modelList = new ArrayList();
        modelList.add(new ContactModel(0,"NAM ","+8409923029","Tp.HCM"));
        modelList.add(new ContactModel(1,"John","+8409923029","Tp.HCM"));
        modelList.add(new ContactModel(2,"Charlie","+8409923029","Tp.HCM"));
    }

    private void onInit() {
        listView = findViewById(R.id.lv_Contact);
        btnAddItem = findViewById(R.id.contact_btnAdd);
    }

}

