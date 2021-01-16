package com.example.ex_11;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;


/**
 * @author Yulia Piavka <yp6497@bs.amalnet.k12.il>
 * @version 1.1
 * @since 12/1/2021
 * short description-
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class Users {
        public static final String TABLE_USERS = "Users";
        public static final String KEY_ID = "_id";
        public static final String NAME = "Name";
        public static final String ADDRESS = "address";
        public static final String STUDENT_PHONE = "StudentP";
        public static final String HOME_PHONE = "HomeP";
        public static final String PARENT_NAME_ONE = "ParentN1";
        public static final String PARENT_NAME_TWO = "ParentN2";
        public static final String PARENT_PHONE_ONE = "ParentP1";
        public static final String PARENT_PHONE_TWO = "ParentP2";
        public static final String AVEIBALE = "aveible";

        public class HelperDB extends SQLiteOpenHelper {

            String strCreate, strDelete;

            private static final String DATABASE_NAME = "dbexam.db";
            private static final int DATABASE_VERSION = 1;

            public HelperDB(Context context) {
                super(context, DATABASE_NAME, null, DATABASE_VERSION);
            }


            @Override
            public void onCreate(SQLiteDatabase db) {

                strCreate = "CREATE TABLE " + TABLE_USERS;
                strCreate += " (" + KEY_ID + " INTEGER PRIMARY KEY,";
                strCreate += " " + NAME + " TEXT,";

                db.execSQL(strCreate);

            }

            @Override
            public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            }
        }
    }
}