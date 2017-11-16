package com.tencent.wcdb.database;

import com.tencent.wcdb.support.CancellationSignal;

public final class SQLiteQuery
  extends SQLiteProgram
{
  private static final String TAG = "WCDB.SQLiteQuery";
  private final CancellationSignal mCancellationSignal;
  
  SQLiteQuery(SQLiteDatabase paramSQLiteDatabase, String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    super(paramSQLiteDatabase, paramString, paramArrayOfObject, paramCancellationSignal);
    this.mCancellationSignal = paramCancellationSignal;
  }
  
  /* Error */
  final int fillWindow(com.tencent.wcdb.CursorWindow paramCursorWindow, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 27	com/tencent/wcdb/database/SQLiteQuery:acquireReference	()V
    //   4: aload_1
    //   5: invokevirtual 30	com/tencent/wcdb/CursorWindow:acquireReference	()V
    //   8: aload_0
    //   9: invokevirtual 34	com/tencent/wcdb/database/SQLiteQuery:getSession	()Lcom/tencent/wcdb/database/SQLiteSession;
    //   12: aload_0
    //   13: invokevirtual 38	com/tencent/wcdb/database/SQLiteQuery:getSql	()Ljava/lang/String;
    //   16: aload_0
    //   17: invokevirtual 42	com/tencent/wcdb/database/SQLiteQuery:getBindArgs	()[Ljava/lang/Object;
    //   20: aload_1
    //   21: iload_2
    //   22: iload_3
    //   23: iload 4
    //   25: aload_0
    //   26: invokevirtual 46	com/tencent/wcdb/database/SQLiteQuery:getConnectionFlags	()I
    //   29: aload_0
    //   30: getfield 16	com/tencent/wcdb/database/SQLiteQuery:mCancellationSignal	Lcom/tencent/wcdb/support/CancellationSignal;
    //   33: invokevirtual 52	com/tencent/wcdb/database/SQLiteSession:executeForCursorWindow	(Ljava/lang/String;[Ljava/lang/Object;Lcom/tencent/wcdb/CursorWindow;IIZILcom/tencent/wcdb/support/CancellationSignal;)I
    //   36: istore_2
    //   37: aload_1
    //   38: invokevirtual 55	com/tencent/wcdb/CursorWindow:releaseReference	()V
    //   41: aload_0
    //   42: invokevirtual 56	com/tencent/wcdb/database/SQLiteQuery:releaseReference	()V
    //   45: iload_2
    //   46: ireturn
    //   47: astore 5
    //   49: aload_0
    //   50: invokevirtual 59	com/tencent/wcdb/database/SQLiteQuery:onCorruption	()V
    //   53: aload 5
    //   55: athrow
    //   56: astore 5
    //   58: aload_1
    //   59: invokevirtual 55	com/tencent/wcdb/CursorWindow:releaseReference	()V
    //   62: aload 5
    //   64: athrow
    //   65: astore_1
    //   66: aload_0
    //   67: invokevirtual 56	com/tencent/wcdb/database/SQLiteQuery:releaseReference	()V
    //   70: aload_1
    //   71: athrow
    //   72: astore 5
    //   74: ldc 8
    //   76: new 61	java/lang/StringBuilder
    //   79: dup
    //   80: ldc 63
    //   82: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   85: aload 5
    //   87: invokevirtual 69	com/tencent/wcdb/database/SQLiteException:getMessage	()Ljava/lang/String;
    //   90: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: ldc 75
    //   95: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: aload_0
    //   99: invokevirtual 38	com/tencent/wcdb/database/SQLiteQuery:getSql	()Ljava/lang/String;
    //   102: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: invokestatic 84	com/tencent/wcdb/support/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   111: aload 5
    //   113: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	SQLiteQuery
    //   0	114	1	paramCursorWindow	com.tencent.wcdb.CursorWindow
    //   0	114	2	paramInt1	int
    //   0	114	3	paramInt2	int
    //   0	114	4	paramBoolean	boolean
    //   47	7	5	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   56	7	5	localObject	Object
    //   72	40	5	localSQLiteException	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   8	37	47	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   8	37	56	finally
    //   49	56	56	finally
    //   74	114	56	finally
    //   4	8	65	finally
    //   37	41	65	finally
    //   58	65	65	finally
    //   8	37	72	com/tencent/wcdb/database/SQLiteException
  }
  
  public final String toString()
  {
    return "SQLiteQuery: " + getSql();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wcdb\database\SQLiteQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */