package com.tencent.wcdb.database;

public final class SQLiteCustomFunction
{
  public final SQLiteDatabase.CustomFunction callback;
  public final String name;
  public final int numArgs;
  
  public SQLiteCustomFunction(String paramString, int paramInt, SQLiteDatabase.CustomFunction paramCustomFunction)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("name must not be null.");
    }
    this.name = paramString;
    this.numArgs = paramInt;
    this.callback = paramCustomFunction;
  }
  
  private void dispatchCallback(String[] paramArrayOfString)
  {
    this.callback.callback(paramArrayOfString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wcdb\database\SQLiteCustomFunction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */