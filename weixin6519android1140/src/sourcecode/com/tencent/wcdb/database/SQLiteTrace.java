package com.tencent.wcdb.database;

import java.util.List;

public abstract interface SQLiteTrace
{
  public abstract void onConnectionObtained(SQLiteDatabase paramSQLiteDatabase, String paramString, long paramLong, boolean paramBoolean);
  
  public abstract void onConnectionPoolBusy(SQLiteDatabase paramSQLiteDatabase, String paramString1, List<String> paramList, String paramString2);
  
  public abstract void onDatabaseCorrupted(SQLiteDatabase paramSQLiteDatabase);
  
  public abstract void onSQLExecuted(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt, long paramLong);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wcdb\database\SQLiteTrace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */