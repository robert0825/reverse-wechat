package com.tencent.wcdb.database;

public abstract interface SQLiteCheckpointListener
{
  public abstract void onAttach(SQLiteDatabase paramSQLiteDatabase);
  
  public abstract void onDetach(SQLiteDatabase paramSQLiteDatabase);
  
  public abstract void onWALCommit(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wcdb\database\SQLiteCheckpointListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */