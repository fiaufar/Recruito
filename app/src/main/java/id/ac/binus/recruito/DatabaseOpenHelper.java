package id.ac.binus.recruito;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseOpenHelper extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "Recruito.db";
    private static final int DATABASE_VERSION = 4;

    public DatabaseOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

        //FORCE UPGRADE BY DELETING OLD DATABASE
        setForcedUpgrade(DATABASE_VERSION);
    }
}
