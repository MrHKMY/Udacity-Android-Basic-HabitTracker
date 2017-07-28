package com.example.android.habittrackerapp;

import android.provider.BaseColumns;


public final class DBContract {

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";

    private DBContract() {
    }

    public static abstract class Table1 implements BaseColumns {

        public static final String TABLE_NAME = "habit";

        public static final String KEY_ID = "id";
        public static final String KEY_TITLE = "title";
        public static final String KEY_FREQUENCY = "frequency";


        public static final String CREATE_TABLE = "CREATE TABLE " +
                TABLE_NAME + " (" +
                KEY_ID + " INTEGER PRIMARY KEY UNIQUE ," +
                KEY_TITLE + TEXT_TYPE + COMMA_SEP +
                KEY_FREQUENCY + " INTEGER" +
                " )";

        public static final String DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
    }
}