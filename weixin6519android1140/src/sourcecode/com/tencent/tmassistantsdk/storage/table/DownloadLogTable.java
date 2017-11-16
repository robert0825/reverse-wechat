package com.tencent.tmassistantsdk.storage.table;

public class DownloadLogTable
  extends BaseLogTable
{
  public static final String CREATE_TABLE_SQL = "CREATE TABLE if not exists downloadLogData( _id INTEGER PRIMARY KEY AUTOINCREMENT, logData BLOB );";
  protected static final String SQL_INSERT = "INSERT INTO downloadLogData logData = ?";
  public static final String TABLE_NAME = "downloadLogData";
  protected static DownloadLogTable mInstance = null;
  
  public static DownloadLogTable getInstance()
  {
    try
    {
      if (mInstance == null) {
        mInstance = new DownloadLogTable();
      }
      DownloadLogTable localDownloadLogTable = mInstance;
      return localDownloadLogTable;
    }
    finally {}
  }
  
  protected String[] getAlterSQL(int paramInt)
  {
    return new String[] { getCreateTableSQL() };
  }
  
  protected String getCreateTableSQL()
  {
    return "CREATE TABLE if not exists downloadLogData( _id INTEGER PRIMARY KEY AUTOINCREMENT, logData BLOB );";
  }
  
  protected String getInsertSQL()
  {
    return "INSERT INTO downloadLogData logData = ?";
  }
  
  protected String getTableName()
  {
    return "downloadLogData";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\storage\table\DownloadLogTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */