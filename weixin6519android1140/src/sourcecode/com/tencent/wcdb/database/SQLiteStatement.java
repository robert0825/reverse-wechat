package com.tencent.wcdb.database;

import com.tencent.wcdb.support.CancellationSignal;

public final class SQLiteStatement
  extends SQLiteProgram
{
  SQLiteStatement(SQLiteDatabase paramSQLiteDatabase, String paramString, Object[] paramArrayOfObject)
  {
    super(paramSQLiteDatabase, paramString, paramArrayOfObject, null);
  }
  
  public final void execute()
  {
    execute(null);
  }
  
  public final void execute(CancellationSignal paramCancellationSignal)
  {
    acquireReference();
    try
    {
      getSession().execute(getSql(), getBindArgs(), getConnectionFlags(), paramCancellationSignal);
      return;
    }
    catch (SQLiteDatabaseCorruptException paramCancellationSignal)
    {
      throw paramCancellationSignal;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public final long executeInsert()
  {
    return executeInsert(null);
  }
  
  public final long executeInsert(CancellationSignal paramCancellationSignal)
  {
    acquireReference();
    try
    {
      long l = getSession().executeForLastInsertedRowId(getSql(), getBindArgs(), getConnectionFlags(), paramCancellationSignal);
      return l;
    }
    catch (SQLiteDatabaseCorruptException paramCancellationSignal)
    {
      throw paramCancellationSignal;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public final int executeUpdateDelete()
  {
    return executeUpdateDelete(null);
  }
  
  public final int executeUpdateDelete(CancellationSignal paramCancellationSignal)
  {
    acquireReference();
    try
    {
      int i = getSession().executeForChangedRowCount(getSql(), getBindArgs(), getConnectionFlags(), paramCancellationSignal);
      return i;
    }
    catch (SQLiteDatabaseCorruptException paramCancellationSignal)
    {
      throw paramCancellationSignal;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public final long simpleQueryForLong()
  {
    return simpleQueryForLong(null);
  }
  
  public final long simpleQueryForLong(CancellationSignal paramCancellationSignal)
  {
    acquireReference();
    try
    {
      long l = getSession().executeForLong(getSql(), getBindArgs(), getConnectionFlags(), paramCancellationSignal);
      return l;
    }
    catch (SQLiteDatabaseCorruptException paramCancellationSignal)
    {
      throw paramCancellationSignal;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public final String simpleQueryForString()
  {
    return simpleQueryForString(null);
  }
  
  public final String simpleQueryForString(CancellationSignal paramCancellationSignal)
  {
    acquireReference();
    try
    {
      paramCancellationSignal = getSession().executeForString(getSql(), getBindArgs(), getConnectionFlags(), paramCancellationSignal);
      return paramCancellationSignal;
    }
    catch (SQLiteDatabaseCorruptException paramCancellationSignal)
    {
      throw paramCancellationSignal;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public final String toString()
  {
    return "SQLiteProgram: " + getSql();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wcdb\database\SQLiteStatement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */