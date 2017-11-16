package com.tencent.wcdb.database;

import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.support.CancellationSignal;

public final class SQLiteDirectCursorDriver
  implements SQLiteCursorDriver
{
  private static SQLiteDatabase.CursorFactory DEFAULT_FACTORY = SQLiteCursor.FACTORY;
  private final CancellationSignal mCancellationSignal;
  private final SQLiteDatabase mDatabase;
  private final String mEditTable;
  private SQLiteProgram mQuery;
  private final String mSql;
  
  public SQLiteDirectCursorDriver(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, CancellationSignal paramCancellationSignal)
  {
    this.mDatabase = paramSQLiteDatabase;
    this.mEditTable = paramString2;
    this.mSql = paramString1;
    this.mCancellationSignal = paramCancellationSignal;
  }
  
  public final void cursorClosed() {}
  
  public final void cursorDeactivated() {}
  
  public final void cursorRequeried(Cursor paramCursor) {}
  
  public final Cursor query(SQLiteDatabase.CursorFactory paramCursorFactory, String[] paramArrayOfString)
  {
    Object localObject = paramCursorFactory;
    if (paramCursorFactory == null) {
      localObject = DEFAULT_FACTORY;
    }
    paramCursorFactory = null;
    try
    {
      paramArrayOfString = ((SQLiteDatabase.CursorFactory)localObject).newQuery(this.mDatabase, this.mSql, paramArrayOfString, this.mCancellationSignal);
      paramCursorFactory = paramArrayOfString;
      localObject = ((SQLiteDatabase.CursorFactory)localObject).newCursor(this.mDatabase, this, this.mEditTable, paramArrayOfString);
      this.mQuery = paramArrayOfString;
      return (Cursor)localObject;
    }
    catch (RuntimeException paramArrayOfString)
    {
      if (paramCursorFactory != null) {
        paramCursorFactory.close();
      }
      throw paramArrayOfString;
    }
  }
  
  public final void setBindArguments(String[] paramArrayOfString)
  {
    this.mQuery.bindAllArgsAsStrings(paramArrayOfString);
  }
  
  public final String toString()
  {
    return "SQLiteDirectCursorDriver: " + this.mSql;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wcdb\database\SQLiteDirectCursorDriver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */