package ru.ya.popularfotki.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by vanya on 17.01.15.
 */
public class FotkiSQLiteHelper extends SQLiteOpenHelper {
    public static final String CREATE_TABLE = "CREATE TABLE";
    public static final String DROP_TABLE = "DROP TABLE";

    public static final String COLUMN_ID = "COLUMN_ID";
    public static final String COLUMN_YANDEX_ID = "COLUMN_YANDEX_ID";
    public static final String COLUMN_URL_S = "COLUMN_URL_S";
    public static final String COLUMN_URL_XL = "COLUMN_URL_XL";
    public static final String COLUMN_PATH = "COLUMN_PATH";
    //public static final String TYPE_TEXT = "text";

    public final static String PICTURES_TABLE= "PICTURES_TABLE";

    public FotkiSQLiteHelper(Context context) {
        super(context, "MY_DATA_BASE", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE + " "
                 + PICTURES_TABLE + "("
                 + COLUMN_ID + " integer primary key autoincrement, "
                 + COLUMN_YANDEX_ID + " text unique key not null, "
                 + COLUMN_URL_S + " text not null, "
                 + COLUMN_URL_XL + " text not null, "
                 + COLUMN_PATH + " text ); "
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion != newVersion) {
            db.execSQL(DROP_TABLE + " " + PICTURES_TABLE);
            onCreate(db);
        }
    }
}