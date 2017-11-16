package com.tencent.mm.plugin.fts.a;

import android.database.Cursor;
import com.tencent.wcdb.database.SQLiteStatement;
import com.tencent.wcdb.support.CancellationSignal;

public abstract interface f
{
  public abstract Cursor a(String paramString, String[] paramArrayOfString, CancellationSignal paramCancellationSignal);
  
  public abstract void beginTransaction();
  
  public abstract boolean ch(int paramInt1, int paramInt2);
  
  public abstract void commit();
  
  public abstract SQLiteStatement compileStatement(String paramString);
  
  public abstract void execSQL(String paramString);
  
  public abstract void execSQL(String paramString, Object[] paramArrayOfObject);
  
  public abstract boolean inTransaction();
  
  public abstract long k(long paramLong1, long paramLong2);
  
  public abstract void l(long paramLong1, long paramLong2);
  
  public abstract Cursor rawQuery(String paramString, String[] paramArrayOfString);
  
  public abstract boolean yL(String paramString);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\fts\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */