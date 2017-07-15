package com.example.ramesh.wiings.WII_Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ram on 14-07-2017.
 */

public class WII_SQLiteDatabase extends SQLiteOpenHelper{

    public static final String DatabaseName="wiiingsDB.db";

    public WII_SQLiteDatabase(Context context) {
        super(context, DatabaseName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(WII_TableClass.CATEGORYTABLE);
        db.execSQL(WII_TableClass.PRODUCTTABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

       // db.execSQL("DROP TABLE IF EXITS ");
        onCreate(db);
    }








}
