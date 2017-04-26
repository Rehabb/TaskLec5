package com.tasklec5.rehab.tasklec5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
    EditText textname,textemail,textpass;
    Button btnsave,btnshow;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textname=(EditText)findViewById(R.id.username);
        textemail=(EditText)findViewById(R.id.email);
        textpass=(EditText)findViewById(R.id.password);
        listView=(ListView) findViewById(R.id.listview);



        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String name=textname.getText().toString();
                final String email=textemail.getText().toString();
                String password=textpass.getText().toString();

                String[] values = new String[] {"", name};
                String[] value = new String[] {"", email};
                ShowData showData=new ShowData(values);
                listView.setAdapter(showData);
                ShowData showData1=new ShowData(value);
                listView.setAdapter(showData1);
            }
        });


    }
}
