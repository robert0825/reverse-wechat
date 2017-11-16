package com.tencent.wcdb.database;

public abstract interface SQLiteTransactionListener
{
  public abstract void onBegin();
  
  public abstract void onCommit();
  
  public abstract void onRollback();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wcdb\database\SQLiteTransactionListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */