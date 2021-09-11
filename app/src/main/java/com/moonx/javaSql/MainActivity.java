package com.moonx.javaSql;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.moonx.jql.DBPkj.Executive.DB;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyTable myTable = new MyTable(this);
        DB.select(myTable.nameCol).select(myTable.idCol)
                .from(myTable)
                .exec();
    }
}