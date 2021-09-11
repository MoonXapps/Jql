package com.moonx.javaSql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.moonx.jql.DBPkj.Segments.DataBase;

public class MyDatabase extends DataBase {
    public MyDatabase(Context context, String tableName) {
        super(context, "JV", tableName);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        MyTable myTable = new MyTable(context);
        addColumn(myTable.nameCol, true);
        addColumn(myTable.idCol, "1");
    }
}
