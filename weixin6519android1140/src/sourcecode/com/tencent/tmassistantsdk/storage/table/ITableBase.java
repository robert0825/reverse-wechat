package com.tencent.tmassistantsdk.storage.table;

import android.database.sqlite.SQLiteDatabase;
import com.tencent.tmassistantsdk.storage.helper.SqliteHelper;

public abstract interface ITableBase
{
  public abstract String createTableSQL();
  
  public abstract void dataMovement(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2);
  
  public abstract String[] getAlterSQL(int paramInt1, int paramInt2);
  
  public abstract SqliteHelper getHelper();
  
  public abstract String tableName();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\storage\table\ITableBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */