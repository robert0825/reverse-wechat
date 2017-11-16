package com.tencent.tmassistantsdk.storage.table;

public class TipsInfoLogTable
  extends BaseLogTable
{
  public static final String CREATE_TABLE_SQL = "CREATE TABLE if not exists TipsInfoLogData( _id INTEGER PRIMARY KEY AUTOINCREMENT, logData BLOB );";
  protected static final String SQL_INSERT = "INSERT INTO TipsInfoLogData logData = ?";
  public static final String TABLE_NAME = "TipsInfoLogData";
  protected static TipsInfoLogTable mInstance = null;
  
  public static TipsInfoLogTable getInstance()
  {
    try
    {
      if (mInstance == null) {
        mInstance = new TipsInfoLogTable();
      }
      TipsInfoLogTable localTipsInfoLogTable = mInstance;
      return localTipsInfoLogTable;
    }
    finally {}
  }
  
  protected String[] getAlterSQL(int paramInt)
  {
    if (paramInt > 1) {
      return new String[] { getCreateTableSQL() };
    }
    return null;
  }
  
  protected String getCreateTableSQL()
  {
    return "CREATE TABLE if not exists TipsInfoLogData( _id INTEGER PRIMARY KEY AUTOINCREMENT, logData BLOB );";
  }
  
  protected String getInsertSQL()
  {
    return "INSERT INTO TipsInfoLogData logData = ?";
  }
  
  protected String getTableName()
  {
    return "TipsInfoLogData";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\storage\table\TipsInfoLogTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */