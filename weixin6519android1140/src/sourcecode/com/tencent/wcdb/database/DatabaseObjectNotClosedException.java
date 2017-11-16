package com.tencent.wcdb.database;

public class DatabaseObjectNotClosedException
  extends RuntimeException
{
  private static final String s = "Application did not close the cursor or database object that was opened here";
  
  public DatabaseObjectNotClosedException()
  {
    super("Application did not close the cursor or database object that was opened here");
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\wcdb\database\DatabaseObjectNotClosedException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */