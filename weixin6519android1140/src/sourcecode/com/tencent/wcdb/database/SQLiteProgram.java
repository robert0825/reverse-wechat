package com.tencent.wcdb.database;

import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.support.CancellationSignal;
import java.util.Arrays;

public abstract class SQLiteProgram
  extends SQLiteClosable
{
  private static final String[] EMPTY_STRING_ARRAY = new String[0];
  private static final String TAG = "WCDB.SQLiteProgram";
  private final Object[] mBindArgs;
  private SQLiteSession mBoundSession;
  private final String[] mColumnNames;
  private final SQLiteDatabase mDatabase;
  private final int mNumParameters;
  protected SQLiteConnection.PreparedStatement mPreparedStatement;
  private final boolean mReadOnly;
  private final String mSql;
  
  protected SQLiteProgram(SQLiteDatabase paramSQLiteDatabase, String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    this.mDatabase = paramSQLiteDatabase;
    this.mSql = paramString.trim();
    int i = DatabaseUtils.getSqlStatementType(this.mSql);
    switch (i)
    {
    default: 
      if (i != 1) {
        break;
      }
    }
    for (;;)
    {
      paramString = new SQLiteStatementInfo();
      paramSQLiteDatabase.getThreadSession().prepare(this.mSql, paramSQLiteDatabase.getThreadDefaultConnectionFlags(bool), paramCancellationSignal, paramString);
      this.mReadOnly = paramString.readOnly;
      this.mColumnNames = paramString.columnNames;
      for (this.mNumParameters = paramString.numParameters; (paramArrayOfObject != null) && (paramArrayOfObject.length > this.mNumParameters); this.mNumParameters = 0)
      {
        throw new IllegalArgumentException("Too many bind arguments.  " + paramArrayOfObject.length + " arguments were provided but the statement needs " + this.mNumParameters + " arguments.");
        this.mReadOnly = false;
        this.mColumnNames = EMPTY_STRING_ARRAY;
      }
      bool = false;
    }
    if (this.mNumParameters != 0)
    {
      this.mBindArgs = new Object[this.mNumParameters];
      if (paramArrayOfObject != null) {
        System.arraycopy(paramArrayOfObject, 0, this.mBindArgs, 0, paramArrayOfObject.length);
      }
    }
    for (;;)
    {
      this.mPreparedStatement = null;
      this.mBoundSession = null;
      return;
      this.mBindArgs = null;
    }
  }
  
  private void bind(int paramInt, Object paramObject)
  {
    if ((paramInt <= 0) || (paramInt > this.mNumParameters)) {
      throw new IllegalArgumentException("Cannot bind argument at index " + paramInt + " because the index is out of range.  The statement has " + this.mNumParameters + " parameters.");
    }
    this.mBindArgs[(paramInt - 1)] = paramObject;
  }
  
  protected boolean acquirePreparedStatement()
  {
    for (;;)
    {
      try
      {
        SQLiteSession localSQLiteSession1 = this.mDatabase.getThreadSession();
        SQLiteSession localSQLiteSession3 = this.mBoundSession;
        if (localSQLiteSession1 == localSQLiteSession3)
        {
          bool = false;
          return bool;
        }
        if (this.mBoundSession != null) {
          throw new IllegalStateException("SQLiteProgram has bound to another thread.");
        }
      }
      finally {}
      this.mBoundSession = localSQLiteSession2;
      this.mPreparedStatement = localSQLiteSession2.acquirePreparedStatement(this.mSql, this.mDatabase.getThreadDefaultConnectionFlags(this.mReadOnly));
      this.mPreparedStatement.bindArguments(this.mBindArgs);
      boolean bool = true;
    }
  }
  
  public void bindAllArgsAsStrings(String[] paramArrayOfString)
  {
    if (paramArrayOfString != null)
    {
      int i = paramArrayOfString.length;
      while (i != 0)
      {
        bindString(i, paramArrayOfString[(i - 1)]);
        i -= 1;
      }
    }
  }
  
  public void bindBlob(int paramInt, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      throw new IllegalArgumentException("the bind value at index " + paramInt + " is null");
    }
    bind(paramInt, paramArrayOfByte);
  }
  
  public void bindDouble(int paramInt, double paramDouble)
  {
    bind(paramInt, Double.valueOf(paramDouble));
  }
  
  public void bindLong(int paramInt, long paramLong)
  {
    bind(paramInt, Long.valueOf(paramLong));
  }
  
  public void bindNull(int paramInt)
  {
    bind(paramInt, null);
  }
  
  public void bindString(int paramInt, String paramString)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("the bind value at index " + paramInt + " is null");
    }
    bind(paramInt, paramString);
  }
  
  public void clearBindings()
  {
    if (this.mBindArgs != null) {
      Arrays.fill(this.mBindArgs, null);
    }
  }
  
  protected void finalize()
  {
    try
    {
      if ((this.mBoundSession != null) || (this.mPreparedStatement != null)) {
        throw new SQLiteMisuseException("Acquired prepared statement is not released.");
      }
    }
    finally
    {
      throw ((Throwable)localObject);
    }
  }
  
  protected final Object[] getBindArgs()
  {
    return this.mBindArgs;
  }
  
  public final String[] getColumnNames()
  {
    return this.mColumnNames;
  }
  
  protected final int getConnectionFlags()
  {
    return this.mDatabase.getThreadDefaultConnectionFlags(this.mReadOnly);
  }
  
  public final SQLiteDatabase getDatabase()
  {
    return this.mDatabase;
  }
  
  protected final SQLiteSession getSession()
  {
    return this.mDatabase.getThreadSession();
  }
  
  public final String getSql()
  {
    return this.mSql;
  }
  
  @Deprecated
  public final int getUniqueId()
  {
    return -1;
  }
  
  protected void onAllReferencesReleased()
  {
    releasePreparedStatement();
    clearBindings();
  }
  
  public final void onCorruption()
  {
    SQLiteDebug.collectLastIOTraceStats(this.mDatabase);
    this.mDatabase.onCorruption();
  }
  
  protected void releasePreparedStatement()
  {
    for (;;)
    {
      try
      {
        if (this.mBoundSession == null)
        {
          SQLiteConnection.PreparedStatement localPreparedStatement = this.mPreparedStatement;
          if (localPreparedStatement == null) {
            return;
          }
        }
        if (this.mBoundSession != this.mDatabase.getThreadSession()) {
          throw new IllegalStateException("SQLiteProgram has bound to another thread.");
        }
      }
      finally {}
      this.mBoundSession.releasePreparedStatement(this.mPreparedStatement);
      this.mPreparedStatement = null;
      this.mBoundSession = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wcdb\database\SQLiteProgram.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */