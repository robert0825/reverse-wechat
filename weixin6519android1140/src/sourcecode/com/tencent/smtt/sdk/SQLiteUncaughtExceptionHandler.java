package com.tencent.smtt.sdk;

import android.database.sqlite.SQLiteException;

public class SQLiteUncaughtExceptionHandler
  implements Thread.UncaughtExceptionHandler
{
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    if ((paramThrowable instanceof SQLiteException)) {
      return;
    }
    throw new RuntimeException(paramThrowable);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\SQLiteUncaughtExceptionHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */