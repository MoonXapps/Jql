package com.moonx.javaSql;

import android.content.Context;

import com.moonx.jql.DBPkj.Segments.DBColumn;
public class MyTable extends MyDatabase {
    static String tableName = "MyTable";
    DBColumn idCol = DBColumn.stringIns(this, "Id");
    DBColumn nameCol = DBColumn.numericIns(this, "name");

    public MyTable(Context context) {
        super(context, tableName);
    }
}
